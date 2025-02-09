package com.example.appcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcompose.components.InputField

class MainActivity : ComponentActivity() {
    //    @OptIn(ExperimentalPermissionsApi::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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


//        setContent{
//            var sizeState by remember { mutableStateOf(0.125f) }
//            val size by animateFloatAsState(targetValue = sizeState,
////                tween(durationMillis = 2000,
////                    delayMillis = 300,
////                    easing = LinearOutSlowInEasing)
//
//                spring(Spring.DampingRatioHighBouncy)
//
////                keyframes {
////                    durationMillis = 2000 // Total duration of the animation
////                    sizeState at 0 with LinearEasing // Reach 100.dp at 500ms
////                    sizeState*1.5f at 1000 with FastOutLinearInEasing // Reach 200.dp at 1000ms
////                    sizeState*2f at 1500 // Reach 250.dp at 1500ms
////                    // Finally reach the target value at 2000ms
////                }
//
//            )
//
//
////            var isGrowing by remember { mutableStateOf(true) } // Track if the Box is growing or shrinking
//
//            val infiniteTransition = rememberInfiniteTransition()
//            val color by infiniteTransition.animateColor(
//                initialValue = Color.Yellow,
//                targetValue = Color.Green,
//                animationSpec = infiniteRepeatable(
//                    tween(
//                        durationMillis = 2000,
//                    delayMillis = 300,
//                    easing = LinearOutSlowInEasing
//                    ),
//                    repeatMode = RepeatMode.Reverse
//                ), label = ""
//            )
//
//            Box(modifier = Modifier
////                .size(sizeState)
////                .size(size)
//                .fillMaxSize(size)
////                .background(Color.Yellow),
//                .background(color),
//                contentAlignment = Alignment.Center) {
//                Button(
////                    modifier = Modifier.fillMaxSize(size/1.1f),
//                    modifier = Modifier.size((size*200).dp),
//                    onClick = {
//                    sizeState = if (sizeState < 1f) sizeState * 1.1f else 0.125f // Grow until full screen, then reset
//
//
////                    if (isGrowing) {
////                        // Grow the Box until it reaches full screen size
////                        if (sizeState < 1f) {
////                            sizeState *= 1.1f
////                        } else {
////                            // Once full size is reached, start shrinking on next click
////                            isGrowing = false
////                        }
////                    } else {
////                        // Shrink the Box back to the initial size
////                        if (sizeState > 0.125f) {
////                            sizeState /= 1.1f
////                        } else {
////                            // Once initial size is reached, start growing again on next click
////                            isGrowing = true
////                        }
////                    }
//
//                }) {
//                    Text(text = "Button with: $size", color = Color.Cyan, fontSize = (size*10).sp)
////                    Text(text = "Two color", color = Color.Red)
//                }
//            }
//        }


        //----------------------------------
//        //Circular Progress Bar
//        setContent{
//            Box(
//                contentAlignment = Alignment.Center,
//                modifier = Modifier.fillMaxSize()
//            ){
//                CircularProgressBar(percentage = 0.99f, number = 100)
//            }
//        }

        //draggable music
//        setContent {
//            MusicPlayerTheme {
////                MusicPlayerUI()
//            }
//        }


//        //meditation ui
//        setContent {
//
//            HomeScreen()
//
//        }

        //3D dropdown
//        setContent {
//            Surface(
//                color = Color(0xff101010),
//                modifier = Modifier.fillMaxSize()
//
//            ) {
////                Dropdown(text = ) {
////
////                }
//            }
//        }

        //Splash Screen
//        setContent{
//            Surface(modifier = Modifier.fillMaxSize()) {
//                Navigation()
//            }
//        }


        //Bottom Navigation
        /*        Material3 changes:
                - BottomNavigation() is now NavigationBar(),
                - background= is now containerColor=,
                - elevation= is now tonalElevation=.
                - BottomNavigationItem() is now NavigationBarItem()
                - Handle the selectedContentColor and unselectedContentColor like this:
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color .Green,
                    unselectedIconColor = Color.Gray
                )
                -BadgeBox() is now BadgedBox()
                -use BadgedBox( badge = { Badge { Text(item.badgeCount.toString()) } } )
        */


//        setContent {
//            val navController = rememberNavController()
//            Scaffold(
//                bottomBar = {
//                    BottomNavBar(
//                        items = listOf(
//                            BottomNavItem(
//                                name = "Home",
//                                route = "home",
//                                icon = Icons.Default.Home
//                            ),
//                            BottomNavItem(
//                                name = "Chat",
//                                route = "chat",
//                                icon = Icons.Default.Face,
//                                badgeCount = 11
//                            ),
//                            BottomNavItem(
//                                name = "Settings",
//                                route = "settings",
//                                icon = Icons.Default.Settings,
//                                badgeCount = 11
//
//                            ),
//
//                            ),
//                        navController = navController,
//                        onItemClick = {
//                            navController.navigate(it.route)
//                        }
//                    )
//                }
//            ) {
//                Nav(navCont = navController)
//            }
//        }


//        setContent {
////            MultiLayerParallaxScreen()
//            var items by remember {
//                mutableStateOf(
//                    (1..20).map {
//                        ListItem(
//                            title = "Item $it",
//                            isSelected = false
//                        )
//                    })
//            }
//
////            items.filter { it.isSelected } //if you wanna selected items
//            LazyColumn(modifier = Modifier.fillMaxSize()){
//                    items(items.size){i ->
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .clickable {
//                                    items = items.mapIndexed{ j, item ->
//                                        if(i==j){
//                                            item.copy(isSelected = !item.isSelected)
//                                        }else item
//                                    }
//                                }
//                                .padding(16.dp),
//                            horizontalArrangement = Arrangement.SpaceBetween,
//                            verticalAlignment = Alignment.CenterVertically
//                        ){
//                            Text(text = items[i].title)
//                            if(items[i].isSelected){
//                                Icon(imageVector = Icons.Default.Check, contentDescription = "Selected", tint = Color.Green, modifier = Modifier.size(20.dp))
//                            }
//                        }
//                    }
//            }


        //Permission
//        setContent {
////            MultiplePermissionsHandler()
//
//            val permissionsState = rememberMultiplePermissionsState(
//                permissions = listOf(
//                    android.Manifest.permission.CAMERA,
//                    android.Manifest.permission.RECORD_AUDIO
//                )
//            )
//            val lifecycleOwner = LocalLifecycleOwner.current
//            DisposableEffect(
//                key1 = lifecycleOwner,
//                effect = {
//                    val observer = LifecycleEventObserver { _, event ->
//                        if (event == Lifecycle.Event.ON_RESUME) {
//                            permissionsState.launchMultiplePermissionRequest()
//                        }
//                    }
//                    lifecycleOwner.lifecycle.addObserver(observer)
//                    onDispose {
//                        lifecycleOwner.lifecycle.removeObserver(observer)
//                    }
//                }
//
//            )
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                permissionsState.permissions.forEach { perm ->
//                    when (perm.permission) {
//                        android.Manifest.permission.CAMERA -> {
//                            when {
//                                perm.status.isGranted -> {
//                                    Log.d("P", "PERMISSION GRANTED")
//                                    Text("Camera permission accepted")
//
//                                }
//
//                                perm.status.shouldShowRationale -> {
//                                    Log.d("P", "PERMISSION NEEDED")
//                                    Text("Camera permission is needed to access camera")
//                                }
//
//                                !perm.isPermanentlyDenied() -> {
//                                    Log.d("P", "PERMISSION DENIED")
//                                    Text("Camera permission was permanently denied.You can enable it in app settings.")
//                                }
//                            }
//                        }
//
//                        android.Manifest.permission.RECORD_AUDIO -> {
//                            when {
//                                perm.status.isGranted -> {
//                                    Log.d("P", "PERMISSION GRANTED")
//                                    Text("Record permission accepted")
//
//                                }
//
//                                perm.status.shouldShowRationale -> {
//                                    Log.d("P", "PERMISSION NEEDED")
//                                    Text("Record permission is needed to access camera")
//                                }
//
//                                !perm.isPermanentlyDenied() -> {
//                                    Log.d("P", "PERMISSION DENIED")
//                                    Text("Record permission was permanently denied.You can enable it in app settings.")
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//
//        }


        //Drawer in Compose
//        setContent {
//            val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
//            val coroutineScope = rememberCoroutineScope()
//            Scaffold(
////                drawerState = drawerState,
//                topBar = {
//                    AppBar(
//                        onNavigationItemClick = {}
//                    )
//                },
//                content = {
//                    DrawerHeader()
//                    DrawerBody(
//                      items = listOf(
//                          MenuItem(
//                              id = "home",
//                              title = "Home",
//                              contentDescription = "Go to home screen",
//                              icon = Icons.Default.Home
//                          )
//                      ),
//                        onItemClick = {
//                            when(it.id){
//                                "home" -> "Navigate Home"
//                            }
//                            println("clicked on ${it.title}")
//                        }
//                    )
//                }
//            )
//        }


        //Pagination
//        setContent {
//            // Use MaterialTheme to wrap the PaginationExample
//            Surface(color = MaterialTheme.colorScheme.background) {
//                PaginationExample() // Call the composable
////                PaginationList(loadMore = ::fetchData)
//            }
//        }


        //*******************************************************************************************
        //JetTip App
        setContent {
            Column {
                TopHeader()
                Spacer(modifier = Modifier.padding(4.dp))
                JetTip {
                    MainContent()
                }
            }
        }


    }
    
    //JetTip App
    @Composable
    fun JetTip(content: @Composable () -> Unit){
        Surface(color = MaterialTheme.colorScheme.background) {
            content()
        }
    }

    @Preview
    @Composable
    fun TopHeader(totalPerson: Double = 134.0){
        Surface(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
//                .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
                .clip(shape = CircleShape.copy(all = CornerSize(12.dp)))
        ) {
            Column(
                modifier = Modifier
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                val total = "%.2f".format(totalPerson)
                Text("Total Per Person",
                    style = MaterialTheme.typography.headlineMedium)
                Text("$$total",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.ExtraBold)
            }
        }
    }

    @Preview
    @Composable
    fun MainContent(){
        BillForm(){billAmt ->
            Log.d("AMT", "MainContent: ${billAmt.toInt() * 100}")
        }
    }

    @Composable
    fun BillForm(modifier: Modifier = Modifier,
                 onValChange: (String) -> Unit = {},){
        val totalBillState = remember{
            mutableStateOf("")
        }
        val validState = remember(totalBillState.value) {
            totalBillState.value.trim().isNotEmpty()
        }
        val keyboardController = LocalSoftwareKeyboardController.current

        Surface(modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(8.dp)),
            border = BorderStroke(width = 2.dp, color = Color.LightGray)
        ) {
            Column(modifier = Modifier.padding(6.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start) {
                InputField(valueState = totalBillState,
                    labelId = "Enter Bill",
                    enabled = true,
                    isSingleLine = true,
                    onAction = KeyboardActions{
                        if(!validState) return@KeyboardActions
                        onValChange(totalBillState.value.trim())

                        keyboardController?.hide()
                    }
                )
                if(validState) {
                    Row(modifier = Modifier
                        .padding(3.dp),
                        horizontalArrangement = Arrangement.Start){
                        Text("Split",
                            modifier = Modifier.align(alignment = Alignment.CenterVertically))
                        Spacer(modifier = Modifier.width(120.dp))
                        Row(modifier = Modifier.padding(horizontal = 3.dp),
                            horizontalArrangement = Arrangement.End) {

                        }
                    }
                }else{
                    Box(){

                    }
                }
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun DefaultPreview(){
        Column {
            TopHeader()
            Spacer(modifier = Modifier.padding(4.dp))
            JetTip {
              MainContent() 
            }
        }

    }

    //*********************************************************************************

    /*
    //Pagination 1
    // Simulated data loading function
    suspend fun fetchData(page: Int): List<String> {
        delay(1500) // Simulate network delay
        val pageSize = 20
        val start = page * pageSize
        return (start until start + pageSize).map { "Item $it" }
    }

    @Composable
    fun PaginationList(
        loadMore: suspend (Int) -> List<String>, // A suspend function to load data
        contentPadding: PaddingValues = PaddingValues(16.dp)
    ) {
        val items = remember { mutableStateListOf<String>() } // List to store items
        val isLoading = remember { mutableStateOf(false) } // Loading state
        var page by remember { mutableStateOf(0) } // Tracks the current page
        val coroutineScope = rememberCoroutineScope()
        // Load initial data
        LaunchedEffect(Unit) {
            loadPage(page, items, isLoading, loadMore)
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding
        ) {
            // Display each item
            items(items) { item ->
                Text(
                    text = item,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            // Show a loading spinner at the bottom when fetching data
            if (isLoading.value) {
                item {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .wrapContentWidth()
                    )
                }
            }
        }
        // Trigger loading more items when reaching the end
        LaunchedEffect(items.size) {
            if (!isLoading.value) {
                coroutineScope.launch {
                    loadPage(++page, items, isLoading, loadMore)
                }
            }
        }
    }

    private suspend fun loadPage(
        page: Int,
        items: MutableList<String>,
        isLoading: MutableState<Boolean>,
        loadMore: suspend (Int) -> List<String>
    ) {
        if (isLoading.value) return
        isLoading.value = true
        val newItems = loadMore(page) // Call the provided function to load data
        items.addAll(newItems)
        isLoading.value = false
    }

    //Pagination 1
//-------------------------------------------------
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun PaginationExample() {
        val items = remember { mutableStateListOf<Int>() } // List to store the data
        val isLoading = remember { mutableStateOf(false) } // Loading state
        val coroutineScope = rememberCoroutineScope()

        // Load initial data
        LaunchedEffect(Unit) {
            loadMoreItems(items, isLoading)
        }

        Scaffold(
            topBar = {
                TopAppBar(title = { Text("Pagination Example") })
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Display the items
                items(items) { item ->
                    Text(
                        text = "Item $item",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    )
                }

                // Show a loading spinner at the bottom when more items are loading
                if (isLoading.value) {
                    item {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .wrapContentWidth()
                        )
                    }
                }
            }

            // Detect if the user has scrolled to the bottom and load more items
            LazyColumnStateListener(items.size, isLoading.value) {
                coroutineScope.launch {
                    loadMoreItems(items, isLoading)
                }
            }
        }
    }

    @Composable
    fun LazyColumnStateListener(itemCount: Int, isLoading: Boolean, onLoadMore: () -> Unit) {
        LaunchedEffect(itemCount, isLoading) {
            if (!isLoading && itemCount > 0) {
                onLoadMore()
            }
        }
    }

    // Simulate loading more items
    suspend fun loadMoreItems(items: MutableList<Int>, isLoading: MutableState<Boolean>) {
        if (isLoading.value) return // Prevent duplicate loads
        isLoading.value = true
        delay(2000) // Simulate a network delay
        val start = items.size
        val end = start + 20
        items.addAll(start until end)
        isLoading.value = false
    }

     */

    //Drawer in Compose


    //Permission Handling
//    @OptIn(ExperimentalPermissionsApi::class)
//    @Composable
//    fun MultiplePermissionsHandler() {
//        val permissionsState = rememberMultiplePermissionsState(
//            listOf(
//                android.Manifest.permission.CAMERA,
//                android.Manifest.permission.RECORD_AUDIO
//            )
//        )
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            when {
//                permissionsState.allPermissionsGranted -> {
//                    Text("All permissions granted!")
//                }
//                permissionsState.shouldShowRationale -> {
//                    Text("Permissions are needed to proceed.")
//                    Spacer(modifier = Modifier.height(8.dp))
//                    Button(onClick = { permissionsState.launchMultiplePermissionRequest() }) {
//                        Text("Grant Permissions")
//                    }
//                }
//                else -> {
//                    Text("Permissions not granted. Please enable them in settings.")
//                    Spacer(modifier = Modifier.height(8.dp))
//                    Button(onClick = { permissionsState.launchMultiplePermissionRequest() }) {
//                        Text("Request Permissions")
//                    }
//                }
//            }
//        }
//    }


//Mutli Select


//Parallax

//    @Composable
//    fun MultiLayerParallaxScreen() {
//        val scrollState = rememberScrollState() // To capture scroll offset
//
//        Box(modifier = Modifier.fillMaxSize()) {
//            // Background Layer (Sky)
//            ParallaxLayer(scrollOffset = scrollState.value, speed = 0.3f) {
//                val painter = runCatching {
//                    painterResource(id = R.drawable.cups2)
//                }.getOrDefault(painterResource(id = R.drawable.ic_launcher_background))
//
//                Image(
//                    painter = painter,
//                    contentDescription = "Sky",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize()
//                )
//            }
//
//            // Midground Layer (Mountains)
//            ParallaxLayer(scrollOffset = scrollState.value, speed = 0.6f) {
//                val painter = runCatching {
//                    painterResource(id = R.drawable.cups2)
//                }.getOrDefault(painterResource(id = R.drawable.ic_launcher_background))
//
//                Image(
//                    painter = painter,
//                    contentDescription = "Mountains",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize()
//                )
//            }
//
//            // Foreground Layer (Trees)
//            ParallaxLayer(scrollOffset = scrollState.value, speed = 1.0f) {
//                val painter = runCatching {
//                    painterResource(id = R.drawable.hearts2)
//                }.getOrDefault(painterResource(id = R.drawable.ic_launcher_foreground))
//
//                Image(
//
//                    painter = painter,
//                    contentDescription = "Trees",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize()
//                )
//            }
//
//            // Foreground Scrollable Content
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .verticalScroll(scrollState)
//                    .padding(top = 300.dp) // To prevent content from overlapping layers
//            ) {
//                repeat(50) { index ->
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(100.dp)
//                            .padding(8.dp)
//                            .background(Color.Gray)
//                    ) {
//                        Text(text = "Item $index", modifier = Modifier.align(Alignment.Center))
//                    }
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun ParallaxLayer(
//        scrollOffset: Int,
//        speed: Float,
//        content: @Composable BoxScope.() -> Unit
//    ) {
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .offset(y = (scrollOffset * speed).toInt().dp),
//            content = content
//        )
//    }


//Bottom Nav
//    @Composable
//    fun Nav(navCont: NavHostController) {
////        Hi Philipp, thanks for this video, in addition to this video add this navController.navigate(item.route) {
////            navController.graph.startDestinationRoute?.let { route ->
////                popUpTo(route) {
////                    saveState = true
////                }
////            }
////            launchSingleTop = true
////            restoreState = true
////        } inside onClick method instead of navController.navigate(item.route) to restore state, and clear back entries, I hope this will helps for someone
//
//        NavHost(navController = navCont, startDestination = "home") {
//            composable("home") {
//                Home()
//            }
//            composable("chat") {
//                Chat()
//            }
//            composable("settings") {
//                Settings()
//            }
//
//        }
//    }
//    @Composable
//    fun Home() {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "Home Screen")
//        }
//    }
//    @Composable
//    fun Chat() {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "Home Screen")
//        }
//    }
//    @Composable
//    fun Settings() {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "Home Screen")
//        }
//    }
//    @Composable
//    fun BottomNavBar(
//        items: List<BottomNavItem>,
//        navController: NavController,
//        modifier: Modifier = Modifier,
//        onItemClick: (BottomNavItem) -> Unit
//    ) {
//        val backStackEntry = navController.currentBackStackEntryAsState()
//        NavigationBar(
//            modifier = Modifier,
//            containerColor = Color.DarkGray,
//            tonalElevation = 5.dp
//        ) {
//            items.forEach { item ->
//                val selected = item.route == backStackEntry.value?.destination?.route
//                NavigationBarItem(
//                    selected = selected,
//                    onClick = { onItemClick(item) },
//                    colors = NavigationBarItemDefaults.colors(
//                        selectedIconColor = Color.Green,
//                        unselectedIconColor = Color.Gray
//                    ),
//                    icon = {
//                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                            if (item.badgeCount > 0) {
//                                BadgedBox(
//                                    badge = { Badge { Text(item.badgeCount.toString()) } }
//                                ) {
//                                    Icon(imageVector = item.icon, contentDescription = item.name)
//                                }
//                            } else {
//                                Icon(imageVector = item.icon, contentDescription = item.name)
//                            }
//                            if (selected) {
//                                Text(
//                                    text = item.name,
//                                    textAlign = TextAlign.Center,
//                                    fontSize = 10.sp
//                                )
//                            }
//                        }
//                    }
//                )
//            }
//        }
//    }


//Splash Screen
//    @Composable
//    fun Navigation(){
//        val navController = rememberNavController()
//        NavHost(navController = navController, startDestination = "splash_screen"){
//            composable("splash_screen"){
//                SplashScreen(navController = navController)
//            }
//            composable("main_screen"){
//                val isDarkMode = isSystemInDarkTheme()
//
//                val backgroundColor = if (isDarkMode) Color.DarkGray else Color(0xFFFDCEED)
//                Box(modifier = Modifier.fillMaxSize().background(backgroundColor), contentAlignment = Alignment.Center){
////                    Text(modifier = Modifier.padding(14.dp),text = "Səni bu həyatda hamıdan və hər şeydən çox sevirəm, __!\n\n \uD83C\uDF39☺", color = Color.Red, fontWeight = FontWeight.Bold,fontStyle = FontStyle.Italic,fontFamily = FontFamily.Cursive, fontSize = 32.sp, textAlign = TextAlign.Center)
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun SplashScreen(navController: NavController) {
//        val scale = remember { androidx.compose.animation.core.Animatable(0f) }
//
//
//        LaunchedEffect(Unit) {
//            // Animate scaling
//            scale.animateTo(
//                targetValue = 4.2f,
//                animationSpec = tween(
//                    durationMillis = 800,
//                    easing = LinearOutSlowInEasing
//                )
//            )
//            delay(3000L)
//            navController.navigate("main_screen")
//        }
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(color = Color(0xFFFDCEED)), // Dynamic background color
//            contentAlignment = Alignment.Center
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.hearts2),
//                contentDescription = "Heart Image",
////                colorFilter = ColorFilter.tint(heartTintColor), // Dynamic tint for the heart
//                modifier = Modifier.scale(scale.value)
//            )
//        }
//    }


//3D dropdown
//    @Composable
//    fun Dropdown(
//        text: String,
//        modifier: Modifier = Modifier,
//        initiallyOpened: Boolean=false,
//        content: @Composable () -> Unit
//    ) {
//
//        var isOpen by remember {
//            mutableStateOf(initiallyOpened)
//        }
//
//        val alpha = animateFloatAsState(
//            targetValue = if (isOpen) 1f else 0f,
//            animationSpec = tween(
//                durationMillis = 300
//            )
//        )
//        val rotateX = animateFloatAsState(
//            targetValue = if (isOpen) 0f else -90f,
//            animationSpec = tween(
//                durationMillis = 300
//            )
//        )
//
//        Column(
//            modifier = modifier
//                .fillMaxWidth()
//        ) {
//            Row(
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                    .fillMaxWidth()
//            ) {
//                Text(
//                    text = text,
//                    color = Color.White,
//                    fontSize = 16.sp
//                )
//                Icon(
//                    imageVector = Icons.Default.ArrowDropDown,
//                    contentDescription = "Open or close the drop down",
//                    tint = Color.White,
//                    modifier = Modifier
//                        .clickable {
//                            isOpen = !isOpen
//                        }
//                        .scale(1f, if (isOpen) -1f else 1f)
//                )
//            }
//            Spacer(modifier = Modifier.height(10.dp))
//            Box(
//                contentAlignment = Alignment.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .graphicsLayer {
//                        transformOrigin = TransformOrigin(0.5f, 0f)
//                        rotationX = rotateX.value
//                    }
//                    .alpha(alpha.value)
//            ) {
//
//            }
//        }
//    }
//

//--------------------
//Meditation ui
//    @Composable
//    fun HomeScreen() {
//        Box(
//            modifier = Modifier
//                .background(Color.Blue)
//                .fillMaxSize()
//        ) {
//            Column {
//                GreetingSection()
//                ChipSection(
//                    chips = listOf(
//                        "Sweet sleep",
//                        "Imsomnia",
//                        "Depression",
//                        "Nightmare",
//                        "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                        "Sweet sleep", "Imsomnia", "Depression", "Nightmare", "Walking sleepy",
//                    )
//                )
//                CurrentMeditation()
//                FeatureSection(
//                    features = listOf(
//                        Feature(
//                            title = "Sleep meditation",
//                            R.drawable.ic_headphone,
//                            Color.DarkGray,
//                            Color.Gray,
//                            Color.LightGray
//                        ),
//                        Feature(
//                            title = "Tips for sleeping",
//                            R.drawable.ic_videocam,
//                            Color.DarkGray,
//                            Color.Gray,
//                            Color.LightGray
//                        ),
//                        Feature(
//                            title = "Night island",
//                            R.drawable.ic_headphone,
//                            Color.DarkGray,
//                            Color.Gray,
//                            Color.LightGray
//                        ),
//                        Feature(
//                            title = "Calming sounds",
//                            R.drawable.ic_headphone,
//                            Color.DarkGray,
//                            Color.Gray,
//                            Color.LightGray
//                        )
//                    )
//                )
//            }
//            BottomMenu(
//                items = listOf(
//                    BottomMenuContent("Home", R.drawable.ic_home),
//                    BottomMenuContent("Bubble", R.drawable.ic_bubble),
//                    BottomMenuContent("Moon", R.drawable.ic_moon),
//                    BottomMenuContent("Music", R.drawable.ic_music),
//                    BottomMenuContent("Profile", R.drawable.ic_profile),
//                ),
//                modifier = Modifier.align(alignment = Alignment.BottomCenter)
//            )
//
//        }
//    }
//
//
//    @Composable
//    fun GreetingSection(
//        name: String = "Farasat"
//    ) {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(15.dp)
//        ) {
//            Column(
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(
//                    text = "Good morning, $name",
//                    style = MaterialTheme.typography.headlineMedium,
//                    color = Color.White
//
//                )
//                Text(
//                    text = "We wish you have a good day!",
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = Color.White
//
//                )
//            }
//            Icon(
//                painter = painterResource(id = R.drawable.ic_search),
//                contentDescription = "Search",
//                tint = Color.White,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//    }
//
//    @Composable
//    fun ChipSection(
//        chips: List<String>
//    ) {
//        var selectedChipIndex by remember {
//            mutableStateOf(0)
//        }
//        LazyRow {
//            items(chips.size) {
//                Box(
//                    contentAlignment = Alignment.Center,
//                    modifier = Modifier
//                        .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
//                        .clickable {
//                            selectedChipIndex = it
//                        }
//                        .clip(RoundedCornerShape(10.dp))
//                        .background(
//                            if (selectedChipIndex == it) Color.Green
//                            else Color.Cyan
//                        )
//                        .padding(15.dp)
//                ) {
//                    Text(text = chips[it], color = Color.LightGray)
//                }
//            }
//        }
//
//    }
//
//    @Composable
//    fun CurrentMeditation(
//        color: Color = Color.Green
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier
//                .padding(15.dp)
//                .clip(RoundedCornerShape(10.dp))
//                .background(color)
//                .padding(horizontal = 15.dp, vertical = 20.dp)
//                .fillMaxWidth()
//        ) {
//            Column {
//                Text(
//                    text = "Daily Thought",
//                    style = MaterialTheme.typography.headlineMedium,
//                    color = Color.White
//
//                )
//                Text(
//                    text = "Meditation * 3-10 min",
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = Color.LightGray
//
//                )
//            }
//            Box(
//                contentAlignment = Alignment.Center,
//                modifier = Modifier
//                    .size(40.dp)
//                    .clip(CircleShape)
//                    .background(Color.Magenta)
//                    .padding(10.dp)
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.ic_play),
//                    contentDescription = "Play",
//                    tint = Color.White,
//                    modifier = Modifier.size(16.dp)
//                )
//            }
//        }
//    }
//
//    @Composable
//    fun FeatureSection(features: List<Feature>) {
//        Column(modifier = Modifier.fillMaxWidth()) {
//            Text(
//                text = "Features",
//                style = MaterialTheme.typography.headlineMedium,
//                modifier = Modifier.padding(15.dp)
//            )
//            LazyVerticalGrid(
//                columns = GridCells.Fixed(2),
//                contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
//                modifier = Modifier.fillMaxHeight()
//            ) {
//                items(features.size) {
//                    FeatureItem(feature = features[it])
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun FeatureItem(
//        feature: Feature
//    ) {
//        BoxWithConstraints(
//            modifier = Modifier
//                .padding(7.5.dp)
//                .aspectRatio(1f)
//                .clip(RoundedCornerShape(10.dp))
//                .background(feature.darkColor)
//        ) {
//            val width = constraints.maxWidth
//            val height = constraints.maxHeight
//
//            //Medium colored path
//            val mediumColoredPoint1 = Offset(0f, height * 0.3f)
//            val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
//            val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
//            val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
//            val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())
//
//            val mediumColoredPath = Path().apply {
//                moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
//                // Replacing standardQuadFromTo with quadraticBezierTo
//                quadraticBezierTo(
//                    mediumColoredPoint1.x, mediumColoredPoint1.y,
//                    mediumColoredPoint2.x, mediumColoredPoint2.y
//                )
//                quadraticBezierTo(
//                    mediumColoredPoint2.x, mediumColoredPoint2.y,
//                    mediumColoredPoint3.x, mediumColoredPoint3.y
//                )
//                quadraticBezierTo(
//                    mediumColoredPoint3.x, mediumColoredPoint3.y,
//                    mediumColoredPoint4.x, mediumColoredPoint4.y
//                )
//                quadraticBezierTo(
//                    mediumColoredPoint4.x, mediumColoredPoint4.y,
//                    mediumColoredPoint5.x, mediumColoredPoint5.y
//                )
//
//                lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
//                lineTo(-100f, height.toFloat() + 100f)
//                close()
//            }
//
//            // Light colored path
//            val lightPoint1 = Offset(0f, height * 0.35f)
//            val lightPoint2 = Offset(width * 0.1f, height * 0.4f)
//            val lightPoint3 = Offset(width * 0.3f, height * 0.35f)
//            val lightPoint4 = Offset(width * 0.65f, height.toFloat())
//            val lightPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)
//
//            val lightColoredPath = Path().apply {
//                moveTo(lightPoint1.x, lightPoint1.y)
//                // Replacing standardQuadFromTo with quadraticBezierTo
//                quadraticBezierTo(
//                    lightPoint1.x, lightPoint1.y,
//                    lightPoint2.x, lightPoint2.y
//                )
//                quadraticBezierTo(
//                    lightPoint2.x, lightPoint2.y,
//                    lightPoint3.x, lightPoint3.y
//                )
//                quadraticBezierTo(
//                    lightPoint3.x, lightPoint3.y,
//                    lightPoint4.x, lightPoint4.y
//                )
//                quadraticBezierTo(
//                    lightPoint4.x, lightPoint4.y,
//                    lightPoint5.x, lightPoint5.y
//                )
//
//                // Completing the path
//                lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
//                lineTo(-100f, height.toFloat() + 100f)
//                close()
//            }
//            Canvas(
//                modifier = Modifier
//                    .fillMaxSize()
//            ) {
//                drawPath(
//                    path = mediumColoredPath,
//                    color = feature.mediumColor
//                )
//                drawPath(
//                    path = lightColoredPath,
//                    color = feature.lightColor
//                )
//            }
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(15.dp)
//            ) {
//                Text(
//                    text = feature.title,
//                    style = MaterialTheme.typography.headlineMedium,
//                    lineHeight = 26.sp,
//                    modifier = Modifier.align(Alignment.TopStart)
//                )
//                Icon(
//                    painter = painterResource(id = feature.iconId),
//                    contentDescription = feature.title,
//                    tint = Color.White,
//                    modifier = Modifier.align(Alignment.BottomStart)
//                )
//                Text(
//                    text = "Start",
//                    color = Color.LightGray,
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier
//                        .clickable {
//                            // Handle the click
//                        }
//                        .align(Alignment.BottomEnd)
//                        .clip(RoundedCornerShape(10.dp))
//                        .background(Color.Red)
//                        .padding(vertical = 6.dp, horizontal = 15.dp)
//                )
//            }
//        }
//    }
//
//    @Composable
//    fun BottomMenu(
//        items: List<BottomMenuContent>,
//        modifier: Modifier = Modifier,
//        activeHighlightColor: Color = Color.Green,
//        activeTextColor: Color = Color.White,
//        inactiveTextColor: Color = Color.Cyan,
//        initialSelectedItemIndex: Int = 0,
//    ) {
//        var selectedItemIndex by remember {
//            mutableStateOf(initialSelectedItemIndex)
//        }
//
//        Row(
//            horizontalArrangement = Arrangement.SpaceAround,
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = modifier
//                .fillMaxWidth()
//                .background(Color.Blue)
//                .padding(15.dp)
//        ) {
//            items.forEachIndexed { index, item ->
//                BottomMenuItem(
//                    item = item,
//                    isSelected = index == selectedItemIndex,
//                    activeHighlightColor = activeHighlightColor,
//                    activeTextColor = activeTextColor,
//                    inactiveTextColor = inactiveTextColor
//                ) {
//                    selectedItemIndex = index
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun BottomMenuItem(
//        item: BottomMenuContent,
//        isSelected: Boolean = false,
//        activeHighlightColor: Color = Color.Green,
//        activeTextColor: Color = Color.White,
//        inactiveTextColor: Color = Color.Cyan,
//        onItemClick: () -> Unit
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier.clickable {
//                onItemClick()
//            }
//        ) {
//            Box(
//                contentAlignment = Alignment.Center,
//                modifier = Modifier
//                    .clip(RoundedCornerShape(10.dp))
//                    .background(if (isSelected) activeHighlightColor else Color.Transparent)
//            ) {
//                Icon(
//                    painter = painterResource(id = item.iconId),
//                    contentDescription = item.title,
//                    tint = if (isSelected) activeTextColor else inactiveTextColor,
//                    modifier = Modifier.size(32.dp)
//                        .padding(6.dp)
//                )
//            }
//
//            Text(
//                text = item.title,
//                color = if (isSelected) activeTextColor else inactiveTextColor
//            )
//
//        }
//    }

//-----------------
//draggable music
//    @Composable
//    fun MusicPlayerUI() {
//        // State to manage play/pause and track name
//        var isPlaying by remember { mutableStateOf(false) }
//        var progress by remember { mutableStateOf(0.01f) } // progress bar value from 0 to 1
//        val trackName = "Sample Track"
//
//        // Continuously update progress when playing
//        LaunchedEffect(isPlaying) {
//            while (isPlaying) {
//                delay(500) // Update every 500ms
//                progress = (progress + 0.03f).coerceAtMost(1f) // Increment progress
//            }
//        }
//        // Box container for the whole UI
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    brush = Brush.verticalGradient(
//                        colors = listOf(Color(0xFF1E1E1E), Color(0x80808080))
//                    )
//                ),
//            contentAlignment = Alignment.Center
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(20.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                // Track name
//                Text(
//                    text = trackName,
//                    fontSize = 24.sp,
//                    color = Color.White,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//
//                // Progress bar for the music
//                LinearProgressIndicator(
//                    progress = progress,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(34.dp)
//                        .padding(12.dp),
//                    color = Color.Green,
////                    backgroundColor = Color.Gray,
//                    trackColor = Color.Transparent,
//                    strokeCap = StrokeCap.Round,
//                )
//
//                // Control buttons (Previous, Play/Pause, Next)
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 20.dp),
//                    horizontalArrangement = Arrangement.SpaceAround,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    IconButton(onClick = {
//                        // Handle previous action
//                        progress = (progress - 0.1f).coerceAtLeast(0f)
//                    }) {
//                        Icon(
//                            imageVector = Icons.Default.ArrowBack,
//                            contentDescription = "Previous",
//                            tint = Color.White,
//                            modifier = Modifier.size(48.dp)
//                        )
//                    }
//
//                    IconButton(onClick = {
//                        // Toggle play/pause state
//                        isPlaying = !isPlaying
//                    }) {
//                        Icon(
//                            imageVector = if (isPlaying) Icons.Default.Menu else Icons.Default.PlayArrow,
//                            contentDescription = "Play/Pause",
//                            tint = Color.White,
//                            modifier = Modifier.size(64.dp)
//                        )
//                    }
//
//                    IconButton(onClick = {
//                        // Handle next action
//                        progress = (progress + 0.1f).coerceAtMost(1f)
//                    }) {
//                        Icon(
//                            imageVector = Icons.Default.ArrowForward,
//                            contentDescription = "Next",
//                            tint = Color.White,
//                            modifier = Modifier.size(48.dp)
//                        )
//                    }
//                }
//                // Reset button
//                Spacer(modifier = Modifier.height(16.dp))
//                Button(onClick = {
//                    // Reset the progress to 0
//                    progress = 0f
//                    isPlaying = false // Stop playback when reset
//                }) {
//                    Text("Reset")
//                }
//            }
//        }
//    }


//------------------
//Circular Progress bar
//    @Composable
//    fun CircularProgressBar(
//        percentage: Float,
//        number: Int,
//        fontSize: TextUnit = 28.sp,
//        radius: Dp = 50.dp,
//        color: Color = Color.Green,
//        strokeWith: Dp = 8.dp,
//        animDuration: Int = 1000,
//        animDelay: Int = 0,
//
//    ){
//        var animationPlayed by remember {
//            mutableStateOf(false)
//        }
//
//        val curPercentage = animateFloatAsState(
//            targetValue = if(animationPlayed) percentage else 0f,
//            animationSpec = tween(
//                durationMillis = animDuration,
//                delayMillis = animDelay
//            )
//        )
//        LaunchedEffect(key1 = true) {
//            animationPlayed = true
//        }
//
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier.size( radius*2f),
//        ){
//            Canvas(modifier = Modifier.size(radius*2f)){
//                drawArc(
//                    color = color,
//                    -90f,
//                    360*curPercentage.value,
//                    useCenter = false,
//                    style = Stroke(strokeWith.toPx(),cap = StrokeCap.Round)
//                )
//            }
//            Text(
//                text = (curPercentage.value*number).toInt().toString(),
//                color = Color.DarkGray,
//                fontSize = fontSize,
//                fontWeight = FontWeight.Bold
//            )
//        }

//-----------------------------------
//Draggable Music animation


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
