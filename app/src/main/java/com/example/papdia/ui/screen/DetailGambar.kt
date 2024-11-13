package com.example.papdia.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.papdia.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailGambar(navController: NavHostController, imageResId: Int, description: String) {
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )
    val scope = rememberCoroutineScope()
    var showModal by remember { mutableStateOf(true) }

    val validImageResId = runCatching {
        painterResource(id = imageResId)
    }.getOrElse {
        painterResource(id = R.drawable.karinadetail)
    }

    Column(
        modifier = Modifier
            .background(color = Color.Transparent)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentHeight(),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = imageResId),
                contentDescription = "Detail foto"
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 75.dp, start = 45.dp)
            ) {
                IconButton(
                    onClick = { navController.navigate("beranda_screen") },
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .width(41.dp)
                            .height(41.dp),
                        painter = painterResource(id = R.drawable.kembali),
                        contentDescription = "Back button"
                    )
                }
                Text(
                    text = "Detail",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
            Box(modifier = Modifier.fillMaxWidth()
                .align(Alignment.BottomCenter))
            {
                IconButton(
                    onClick = { showModal = true },
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .wrapContentHeight()
                        .width(200.dp)
                        .height(100.dp)
                        .padding(bottom = 20.dp)
                ) {
                    Image(modifier = Modifier
                        .width(151.dp)
                        .height(67.dp),
                        painter = painterResource(id = R.drawable.btnsheet),
                        contentDescription = "Back button"
                    )
                }
            }
        }
    }

    if (showModal) {
        ModalBottomSheet(
            onDismissRequest = { showModal = false },
            sheetState = sheetState,
            containerColor = Color(0xFFFF6A00)
        ) {
            BottomSheetContent(description)
        }
    }
}

@Composable
fun BottomSheetContent(description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier
            .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(
                text = "Karina",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = description,
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}