package com.example.papdia.ui.screen

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.papdia.R
import com.example.papdia.ui.theme.black
import com.example.papdia.ui.theme.white

@Composable
fun EmptyScreen(navController: NavHostController) {
    val context = LocalContext.current

    Column(
        modifier = Modifier.background(color = white),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth()){
                Image(
                        modifier = Modifier
                            .width(412.dp)
                            .height(342.dp),
            painter = painterResource(
                id = R.drawable.fotosaya),
            contentDescription = "foto gweh")

                Image(
                    modifier = Modifier
                        .width(106.dp)
                        .height(106.dp)
                        .align(Alignment.BottomCenter)
                        .offset(y = 53.dp),
                    painter = painterResource(
                        id = R.drawable.fotoprofil),
                    contentDescription = "foto gweh")

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 75.dp, start = 45.dp)
            ) {
                IconButton(onClick = { (context as? Activity)?.finish()},
                    modifier = Modifier.width(50.dp) .height(50.dp)) {
                    Image(
                        modifier = Modifier
                            .width(41.dp)
                            .height(41.dp),
                        painter = painterResource(id = R.drawable.btnlogout),
                        contentDescription = "Back button"
                    )
                }
                Text(
                    text = "Profil",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        }
        Box(modifier = Modifier.fillMaxWidth())
        {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 53.dp),
                color = Color.White
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(16.dp)
                ) {
                    ProfileItem(title = "Nama", content = "Raihan Al Arsy")
                    ProfileItem(title = "Email", content = "raihanalarsy14@gmail.com")
                    ProfileItem(title = "Kampus", content = "Universitas Muhammadiyah Purwokerto")
                    ProfileItem(title = "Prodi", content = "Teknik Informatika")
                }
            }
            Box(modifier = Modifier.fillMaxWidth()
                .align(Alignment.BottomCenter)
                .width(240.dp)
                .height(80.dp)) {

                Image(
                    painter = painterResource(id = R.drawable.shapebar),
                    contentDescription = "Background Shape",
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 8.dp)
                        .align(Alignment.Center),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    IconButton(
                        onClick = { navController.navigate("beranda_screen") },
                        modifier = Modifier.size(50.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.iconhome),
                            contentDescription = "Icon 1"
                        )
                    }


                    IconButton(
                        onClick = { /* TODO: */ },
                        modifier = Modifier.size(50.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fotoprofil),
                            contentDescription = "Icon 2"
                        )
                    }
                }
            }
        }

    }
}

@Composable
fun ProfileItem(title: String, content: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        color = Color.Gray.copy(alpha = 0.1f),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = content,
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            )
        }
    }
}