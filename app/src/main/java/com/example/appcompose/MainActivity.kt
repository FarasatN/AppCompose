package com.example.appcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()

//        setContent {
//            Surface(color = MaterialTheme.colorScheme.background) {
//                ImageGrid()
//            }

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
//            Column(
//                modifier = Modifier
////                        .background(Color.Green)
//                    .fillMaxHeight(1f)
//                    .fillMaxWidth(1f)
////                    .fillMaxWidth(0.8f)
////                    .width(400.dp)
////                    .requiredWidth(400.dp)
////                    .padding(20.dp)
////                    .padding(top = 20.dp)
//                    .border(5.dp,Color.Red)
//                    .padding(3.dp)
//                    .border(3.dp,Color.Blue)
//            ) {
////                Text(text = "Hello", modifier = Modifier
////                    .offset(0.dp,20.dp))
//                Text(text = "Hello",modifier = Modifier
//                    .border(5.dp,Color.Red)
//                    .padding(5.dp)
//                    .padding(top = 50.dp)
//                    .padding(start = 50.dp)
//                    .border(5.dp,Color.Blue)
//                    .clickable {  }
//                    .size(66.dp)
//                )
//                Spacer(modifier = Modifier.height(100.dp))
//                Text(text = "World")
//            }

//            ----------------------

//            val painter = painterResource(id = R.drawable.philosophers)
//            val title = "The Great muslims"
//            val description = "Why were great Islamic scholars regarded as infidels?"
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(16.dp)
//            ) {
//                ImageCard(painter = painter, title = title, contentDescription = description)
//            }


        //--------------------------

//        val fontFamily = FontFamily(
//            Font(R.font.lexend_bold, FontWeight.Bold),
//            Font(R.font.lexend_light, FontWeight.Light),
//            Font(R.font.lexend_thin, FontWeight.Thin),
//        )
////        val uriHandler = LocalUriHandler.current
//        val annotatedString = buildAnnotatedString {
//            append("This is an ")
//
//            // Style "Annotated" differently
//            withStyle(style = SpanStyle(color = Color.Red, fontWeight = FontWeight.Bold)) {
//                append("Annotated")
//            }
//
//            append(" string. ")
//
//            // Add clickable annotation
//            pushStringAnnotation(tag = "URL", annotation = "https://www.example.com")
//            withStyle(
//                style = SpanStyle(
//                    color = Color.Blue,
//                    textDecoration = TextDecoration.Underline
//                )
//            ) {
//                append("Click here")
//            }
//            pop()
//
//            append(" to learn more.")
//        }


//        setContent {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color(0XFF101010))
//            ) {
//                Text(
////                    text = "Jetpack Compose",
//                    text = annotatedString,
//                    color = Color.White,
//                    fontSize = 30.sp,
//                    fontFamily = fontFamily,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier
//                        .clickable {
//                            // Handle click events on annotations
//                            val annotations = annotatedString.getStringAnnotations(
//                                "URL",
//                                0,
//                                annotatedString.length
//                            )
//                            annotations.firstOrNull()?.let {
//                                // Example: Open URL in browser
//                                println("Clicked URL: ${it.item}")
////                                uriHandler.openUri(it.item)
//                            }
//                        }
//                )
//            }


        //--------------------------------


//        setContent {
//            Column(Modifier.fillMaxSize()) {
//                val color = remember {
//                    mutableStateOf(Color.Yellow)
//                }
//                ColorBox(
//                    Modifier
//                        .weight(1f)
//                        .fillMaxSize()
//                ){
//                    color.value = it
//                }
//                Box(
//                    modifier = Modifier
//                        .background(color.value)
//                        .weight(1f)
//                        .fillMaxSize()
//                )
//            }
//        }


        //-----------------------------

//        setContent{
//            val scope = rememberCoroutineScope()
//            val snackbarHostState = remember { SnackbarHostState() }
//            Scaffold(
//                snackbarHost = {
//                    SnackbarHost(hostState = snackbarHostState)
//                },
//                floatingActionButton = {
//                    ExtendedFloatingActionButton(
//                        text = { Text("Show snackbar") },
//                        icon = { Icon(Icons.Filled.Add, contentDescription = "") },
//                        onClick = {
//                            scope.launch {
//                                snackbarHostState.showSnackbar("Snackbar")
//                            }
//                        }
//                    )
//                },
//                content = { paddingValues ->
//                    // Your main content goes here
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(paddingValues) // Respect scaffold padding
//                    ) {
//                        Text("Hello, World!")
//                    }
//                }
//            )
//        }


        //---------------------

//        setContent {
////            val scrollState = rememberScrollState()
////            Column(
////                modifier = Modifier.verticalScroll(scrollState)
////            )
//            LazyColumn{
////                items(5000){
////                    Text(
////                        text = "Item $it",
////                        fontSize = 24.sp,
////                        fontWeight = FontWeight.Bold,
////                        textAlign = TextAlign.Center,
////                        modifier = Modifier.fillMaxWidth()
////                            .padding(vertical = 24.dp)
////                    )
////                }
//
//                val itemList = ArrayList<String>()
//                for (i in 1..5000) {
//                    itemList.add("Item $i")
//                }
//
//                //replacement recyclerview
//                itemsIndexed(
////                    listOf("This", "is", "Jetpack","Compose")
//                    itemList
//                ){index, string ->
//                    Text(
//                        text = "At $index:  $string",
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//
//
//
////                for (i in 1..500){
////                    Text(
////                        text = "Item $i",
////                        fontSize = 24.sp,
////                        fontWeight = FontWeight.Bold,
////                        textAlign = TextAlign.Center,
////                        modifier = Modifier.fillMaxWidth()
////                            .padding(vertical = 24.dp)
////                    )
////                }
//            }
//
//        }


        //-------------------------------------------------------

        //ConstraintLayout in Compose
//        setContent{
//            val constraints = ConstraintSet{
//
//                val greenBox = createRefFor("greenBox")
//                val redBox = createRefFor("redBox")
//                val guideline = createGuidelineFromTop(0.5f)
//                constrain(greenBox){
//                    top.linkTo(guideline)
//                    start.linkTo(parent.start)
//                    width = Dimension.value(50.dp)
//                    height = Dimension.value(100.dp)
//                }
//                constrain(redBox){
//                    top.linkTo(parent.top)
//                    start.linkTo(greenBox.end)
//                    width = Dimension.fillToConstraints
//                    height = Dimension.value(50.dp)
//                }
//
//                createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
//            }
//            ConstraintLayout(constraintSet = constraints, modifier = Modifier.fillMaxSize()) {
//                Box(modifier = Modifier
//                    .background(Color.Green)
//                    .layoutId("greenBox"))
//                Box(modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("redBox"))
//            }
//
//        }

        //------------------------------------------

        //Simple Animations


        setContent{
            var sizeState by remember { mutableStateOf(200.dp) }
            Box(modifier = Modifier.size(200.dp)
                .background(Color.Red),
                contentAlignment = Alignment.Center) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button with", color = Color.Magenta)
                    Text(text = "Two color", color = Color.Red)
                }
            }
        }


    }








    //------------------------------
//    @Composable
//    fun ColorBox(
//        modifier: Modifier = Modifier,
//        updateColor: (Color) -> Unit
//    ) {
////        val color = remember {
////            mutableStateOf(Color.Yellow)
////        }
//        Box(modifier = modifier
//            .background(Color.Red)
//            .clickable {
//                updateColor(
//                    Color(
//                        Random.nextFloat(),
//                        Random.nextFloat(),
//                        Random.nextFloat(),
//                        1f
//                    )
//                )
//            })
//    }


    //-------------------------
//    @Composable
//    fun ImageCard(
//        painter: Painter,
//        contentDescription: String,
//        title: String,
//        modifier: Modifier = Modifier,
//    ) {
//        Card(
//            modifier = modifier
//                .fillMaxWidth()
//                .height(250.dp),  // Set a fixed height for the card
//            shape = RoundedCornerShape(15.dp),
//            elevation = CardDefaults.cardElevation(10.dp)
//        ) {
//            Box(modifier = Modifier.fillMaxSize()) {
//                Image(
//                    painter = painter,
//                    contentDescription = contentDescription,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize()
//                )
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(
//                            Brush.verticalGradient(
//                                colors = listOf(
//                                    Color.Transparent,
//                                    Color.Black
//                                ),
//                                startY = 300f
//                            )
//                        )
//                )
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(12.dp),
//                    contentAlignment = Alignment.BottomStart
//                ) {
//                    Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
//                }
//            }
//        }
//    }


    //---------------------------------
//    @Composable
//    fun ImageGrid() {
//        LazyVerticalGrid(
//            columns = GridCells.Fixed(3), // Adjust the number of columns as needed
//            modifier = Modifier.padding(8.dp)
//        ) {
//            items(12) { index -> // Replace with your list of images
//                GridItem(imageResId = getImageResId(index))
//            }
//        }
//    }
//
//    @Composable
//    fun GridItem(imageResId: Int) {
//        Image(
//            painter = painterResource(id = imageResId),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .padding(4.dp)
//                .size(100.dp) // Adjust the size as needed
//                .background(Color.Gray, shape = RoundedCornerShape(8.dp))
//        )
//    }
//
//    fun getImageResId(index: Int): Int {
//        // Return the correct drawable resource ID for the given index
//        return when (index % 4) {
//            0 -> R.drawable.ic_launcher_foreground
//            1 -> R.drawable.ic_launcher_foreground
//            2 -> R.drawable.ic_launcher_foreground
//            else -> R.drawable.ic_launcher_foreground
//        }
//    }


}

