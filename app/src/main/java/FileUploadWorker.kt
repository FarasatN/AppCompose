package com.example.mydrivesyncapp

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.api.client.extensions.android.http.AndroidHttp
import com.google.api.client.http.InputStreamContent
import com.google.api.client.json.gson.GsonFactory
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import com.google.api.services.drive.model.File as DriveFile
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FileUploadWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        // Retrieve the signed-in account.
        val account = GoogleSignIn.getLastSignedInAccount(applicationContext)
        if (account == null) {
            println("No signed-in account found.")
            return@withContext Result.retry()
        }

        // Create GoogleAccountCredential using the signed-in account.
        val credential = GoogleAccountCredential.usingOAuth2(
            applicationContext,
            listOf(DriveScopes.DRIVE_FILE)
        ).apply {
            selectedAccount = account.account
        }

        // Build the Drive API service.
        val driveService = Drive.Builder(
            AndroidHttp.newCompatibleTransport(),
            GsonFactory.getDefaultInstance(),
            credential
        ).setApplicationName("MyDriveSyncApp")
            .build()

        // Retrieve the file URI passed via inputData.
        val fileUriString = inputData.getString("FILE_URI")
        if (fileUriString == null) {
            println("No file URI provided.")
            return@withContext Result.failure()
        }
        val fileUri = Uri.parse(fileUriString)

        // Open the input stream from the content resolver.
        val inputStream = applicationContext.contentResolver.openInputStream(fileUri)
        if (inputStream == null) {
            println("Unable to open input stream for URI: $fileUri")
            return@withContext Result.failure()
        }

        // Create file metadata – you might want to query the display name from the URI.
        val metadata = DriveFile().apply {
            name = "UploadedFile" // You could update this to reflect the original file name.
        }
        // Wrap the input stream as media content.
        val mediaContent = InputStreamContent("application/octet-stream", inputStream)

        try {
            driveService.files().create(metadata, mediaContent)
                .setFields("id")
                .execute()
            println("File uploaded successfully.")
            Result.success()
        } catch (e: Exception) {
            println("Error during upload: ${e.localizedMessage}")
            Result.retry()
        }
    }
}
