package com.example.greencoworkingspace.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
fun RoomSelect(navController: NavController) {
    Scaffold(
        bottomBar = {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(vertical = 5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Button(
                    onClick = {
                        navController.navigate(AppScreen.Dashbord.name)
                    },
                    shape = RoundedCornerShape(16.dp, 16.dp, 16.dp, 16.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xff1E1E1E)),
                    modifier = Modifier
                        .fillMaxWidth(0.95F)
                        .height(70.dp)

                ) {
                    Text("Book Now", fontSize = 20.sp)
                }

            }

        }
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

                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "",
                        tint=   Color.White,
                        modifier = Modifier.size(30.dp).clickable {
                            navController.navigate(AppScreen.Dashbord.name)
                        }
                    )

                    Text(
                        "Select Date",
                        color = Color.White,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold
                    )

                }
                Column (
                    horizontalAlignment = Alignment.End
                ){
                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Spacer(modifier = Modifier.height(9.dp))
                   Row {
                       Icon(
                           imageVector = Icons.Filled.DateRange,
                           contentDescription = "",
                           tint=   Color.White,
                           modifier = Modifier.size(25.dp)
                       )
                       Text(
                           "Select Date",
                           color = Color.White,
                           fontSize = 16.sp
                       )
                   }
                }
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color.Transparent)
                ){
                    Text("Mon", fontSize = 20.sp, color = Color.White)
                    Text("12", color = Color.White)
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color.Transparent)
                ){
                    Text("Tue", fontSize = 20.sp, color = Color.White)
                    Text("13", color = Color.White)
                }

                Card(
                    colors = CardDefaults.cardColors(Color(0xff1E1E1E))
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(10.dp)
                    ){
                        Text("Wed", fontSize = 20.sp, color = Color.White)
                        Text("14", color = Color.White)
                    }
                }

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color.Transparent)
                ){
                    Text("Thu", fontSize = 20.sp, color = Color.White)
                    Text("14", color = Color.White)
                }

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color.Transparent)
                ){
                    Text("Fri", fontSize = 20.sp, color = Color.White)
                    Text("15", color = Color.White)
                }

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color.Transparent)
                ){
                    Text("Sat", fontSize = 20.sp, color = Color.White)
                    Text("16", color = Color.White)
                }

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color.Transparent)
                ){
                    Text("Sun", fontSize = 20.sp, color = Color.White)
                    Text("17", color = Color.White)
                }

            }
            Spacer(modifier = Modifier.height(25.dp))
            Card(
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(45.dp, 45.dp, 0.dp, 0.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Color.White
                        )
                ){
                    Spacer(modifier = Modifier.height(20.dp))
                    Image(
                        painter = painterResource(id = R.drawable.img0),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(340.dp)
                    )
                }
                Spacer(modifier = Modifier.height(25.dp))
                Column {
                    Row (
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                "876 Green town",
                                fontSize = 25.sp,
                                fontFamily = almaraiFontFamily,
                                fontWeight = FontWeight.Bold
                            )
                            Text("Rosaville", color = Color.Gray,
                                fontFamily = almaraiFontFamily,)
                        }
                        Row {
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "",
                                tint=   Color(0xffFFB61D),
                                modifier = Modifier.size(25.dp)
                            )
                            Text("4.9", fontSize = 20.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(25.dp))
                    Column(modifier = Modifier.padding(horizontal = 45.dp)) {
                        Text(
                            "6391 Elgin St. Celina,Delaware 10299876 Green town,Rosaville Is the perfect peacful location for those who loves to spend his time with nature and love the fresh air "
                        )
                    }
                }

            }

        }

    }

}