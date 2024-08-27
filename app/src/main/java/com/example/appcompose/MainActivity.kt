package com.example.appcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcompose.ui.theme.AppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            Surface(color = MaterialTheme.colorScheme.background) {
                ImageGrid()


            }

//            Row(
//                modifier = Modifier
////                    .fillMaxSize(0.6f)
////                    .height(200.dp)
//                    .fillMaxWidth(1f)
//                    .background(Color.Green),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.Top                ) {
//                Text("Hello!")
//                Text("World!")
//                Text("Hello!")
//                Text("World!")
//            }

//-------------------------------------------------------------------------------------
            Column(
                modifier = Modifier
//                        .background(Color.Green)
                    .fillMaxHeight(1f)
                    .fillMaxWidth(1f)
//                    .fillMaxWidth(0.8f)
//                    .width(400.dp)
//                    .requiredWidth(400.dp)
//                    .padding(20.dp)
//                    .padding(top = 20.dp)
                    .border(5.dp,Color.Red)
                    .padding(3.dp)
                    .border(3.dp,Color.Blue)
            ) {
//                Text(text = "Hello", modifier = Modifier
//                    .offset(0.dp,20.dp))
                Text(text = "Hello",modifier = Modifier
                    .border(5.dp,Color.Red)
                    .padding(5.dp)
                    .padding(top = 50.dp)
                    .padding(start = 50.dp)
                    .border(5.dp,Color.Blue)
                    .clickable {  }
                    .size(66.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))
                Text(text = "World")
            }
        }
    }




    @Composable
    fun ImageGrid() {
        LazyVerticalGrid(
            columns = GridCells.Fixed(3), // Adjust the number of columns as needed
            modifier = Modifier.padding(8.dp)
        ) {
            items(12) { index -> // Replace with your list of images
                GridItem(imageResId = getImageResId(index))
            }
        }
    }

    @Composable
    fun GridItem(imageResId: Int) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(4.dp)
                .size(100.dp) // Adjust the size as needed
                .background(Color.Gray, shape = RoundedCornerShape(8.dp))
        )
    }

    fun getImageResId(index: Int): Int {
        // Return the correct drawable resource ID for the given index
        return when (index % 4) {
            0 -> R.drawable.ic_launcher_foreground
            1 -> R.drawable.ic_launcher_foreground
            2 -> R.drawable.ic_launcher_foreground
            else -> R.drawable.ic_launcher_foreground
        }
    }


}

