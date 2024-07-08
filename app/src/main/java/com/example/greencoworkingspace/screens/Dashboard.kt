package com.example.greencoworkingspace.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.greencoworkingspace.AppScreen
import com.example.greencoworkingspace.R
import com.example.greencoworkingspace.ui.theme.almaraiFontFamily

@Composable
fun Dashbord(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    Row (
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Person,
                                contentDescription = "Localized description",
                                tint = Color(0xffC8DBCF),
                                modifier = Modifier.size(35.dp)
                            )

                        }
                        IconButton(onClick = { /* do something */ }) {
                            Image(
                                painter = painterResource(id = R.drawable.ticket),
                                contentDescription = "",
                                modifier = Modifier.size(35.dp)
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Rounded.Home,
                                contentDescription = "Localized description",
                                modifier = Modifier.size(35.dp)
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Image(
                                painter = painterResource(id = R.drawable.paper),
                                contentDescription = "",
                                modifier = Modifier.size(33.dp)
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Image(
                                painter = painterResource(id = R.drawable.bookmark),
                                contentDescription = "",
                                modifier = Modifier.size(33.dp)
                            )
                        }
                    }
                },
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(Color(0xff75A488))
                .verticalScroll(rememberScrollState()),
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Text(
                        "Good Afternoon",
                        color = Color.White,
                        fontSize = 26.sp
                    )
                    Text("Susan Clay",
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(Color.White),
                    shape = RoundedCornerShape(45.dp, 45.dp, 0.dp, 0.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .align(Alignment.BottomCenter)
                ) {
                }
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "",
                    modifier = Modifier
                        .size(150.dp)
                        .align(Alignment.TopCenter)
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(15.dp)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Your fresh and green", fontSize = 30.sp,
                        color = Color(0xff1E1E1E), 
                        fontFamily = almaraiFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                    Row {
                        Text("comfortable ", fontSize = 30.sp, color = Color(0xff1E1E1E),
                            fontFamily = almaraiFontFamily,
                            fontWeight = FontWeight.Bold
                        )
                        Text("place", fontSize = 30.sp, color = Color(0xff75A488),
                            fontFamily = almaraiFontFamily,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.Bottom,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp)
                            .padding(1.dp)
                    ) {
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .border(
                                    width = 0.dp,
                                    color = Color.Transparent,
                                )
                                .fillMaxHeight(),

                            label = {
                                Text(
                                    "Search Now",
                                    fontSize = 18.sp,
                                    color = Color(0xff75A488)
                                )
                            },

                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = "",
                                    tint=   Color(0xff75A488),
                                    modifier = Modifier.size(25.dp)
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0x2275A488),
                                unfocusedContainerColor = Color(0x2275A488),
                                disabledTextColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent
                            ),
                        )
                        Card(
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(8.dp, 8.dp, 8.dp, 8.dp),
                            border = BorderStroke(2.dp, Color(0x2275A488)),
                            modifier = Modifier
                                .height(60.dp)
                                .width(60.dp)
                        ) {
                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.filter),
                                    contentDescription = "",
                                    modifier = Modifier.size(35.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(30.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.layer2),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(41.dp)
                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text("Near By", fontFamily = almaraiFontFamily)
                        }

                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.logo3),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(41.dp)
                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text("Book Room", fontFamily = almaraiFontFamily)
                        }


                        Column (horizontalAlignment = Alignment.CenterHorizontally){
                            Image(
                                painter = painterResource(id = R.drawable.logo2),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(41.dp)
                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text("Add Event", fontFamily = almaraiFontFamily)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Column (
                        modifier = Modifier.fillMaxWidth()
                            .padding(10.dp)
                    ){
                        Text("Recommended for you",
                            fontFamily = almaraiFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        CardRecommend(
                            Img = R.drawable.image1,
                            title = "876 Green town",
                            subTitle = "Rosaville",
                            rate = 4.9,
                            navController = navController
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        CardRecommend(
                            Img = R.drawable.image2,
                            title = "876 Green town",
                            subTitle = "Rosaville",
                            rate = 4.9,
                            navController = navController
                        )

                    }
                }
            }
        }

    }

}


@Composable
fun CardRecommend(
    Img: Int,
    title: String,
    subTitle: String,
    rate: Double,
    navController: NavController
) {
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable {
            navController.navigate(AppScreen.RoomSelect.name)
        }
    ) {
        Image(
            painter = painterResource(id = Img),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(title, fontFamily = almaraiFontFamily, fontWeight = FontWeight.Bold)
            Text(subTitle, fontFamily = almaraiFontFamily)
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    tint=   Color(0xffFFB61D),
                    modifier = Modifier.size(25.dp)
                )
                Text(rate.toString())
            }

        }
    }
}