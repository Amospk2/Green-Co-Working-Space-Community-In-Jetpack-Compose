package com.example.greencoworkingspace.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.greencoworkingspace.AppScreen
import com.example.greencoworkingspace.R
import com.example.greencoworkingspace.ui.theme.almaraiFontFamily

@Composable
fun StartScreen(navController: NavController) {
    Scaffold (
        containerColor = Color(0xff75A488)
    ) { paddingValues ->
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.group_13812),
                contentDescription = "Banner",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(472.dp)
            )
            Card(
                colors = CardDefaults.cardColors(Color.White),
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(0.dp, 0.dp, 45.dp, 45.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
            ) {
                Column (
                    modifier = Modifier.padding(horizontal = 30.dp, vertical = 23.dp)
                ){
                    Text(
                        "Book a Green Room &",
                        fontSize = 27.sp
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            "Workspace ",
                            fontSize = 27.sp,
                            color = Color(0xff75A488),
                            fontFamily = almaraiFontFamily,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            "On-Demand",
                            fontSize = 27.sp
                        )
                    }

                    Text(
                        "A Space that unite the conscious individuals who collaborate to reduce their carbon footprint.",
                        textAlign = TextAlign.Justify,
                        fontSize = 13.sp,
                        modifier = Modifier.padding(10.dp),
                        color = Color(0xff747474)
                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ){
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .clip(CircleShape)
                                .background(Color(0x8A1E1E1E))
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .clip(CircleShape)
                                .background(Color.Black)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .clip(CircleShape)
                                .background(Color(0x8A1E1E1E))
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .clip(CircleShape)
                                .background(Color(0x8A1E1E1E))
                        )

                    }
                }

            }

            Row (
                modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(15.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Button(
                    shape = RoundedCornerShape(16.dp, 16.dp, 16.dp, 16.dp),
                    onClick = {
                        navController.navigate(AppScreen.Dashbord.name)
                   },
                    colors = ButtonDefaults.buttonColors(Color(0xff1E1E1E))
                    , modifier = Modifier.fillMaxWidth().height(63.dp)
                ) {
                    Text("Let’s Start", fontSize = 20.sp)
                }
            }

        }
    }

}
