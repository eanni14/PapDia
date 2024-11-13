package com.example.papdia.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.papdia.R
import com.example.papdia.ui.theme.black
import com.example.papdia.ui.theme.orange
import com.example.papdia.ui.theme.white

@Composable
fun Beranda(navController: NavHostController) {

    val lazyRowImages = listOf(
        R.drawable.karina1,
        R.drawable.karina2,
        R.drawable.karina3,
        R.drawable.karina4,
        R.drawable.karina5,
        R.drawable.karina6,
        R.drawable.karina7,
        R.drawable.karina18,
        R.drawable.karina19,
        R.drawable.karina20,
    )

    val lazyRowDescriptions = listOf(
        "istri gwehhh amin",
        "Karina pernah notic gw coyy",
        "Kalian iri kan sama ku?",
        "Ahh yang bener kamuuu",
        "Nyoba ajaa jangan baper",
        "Kasih nilai A yaaa kakak mentor",
        "Kasian Ni akunya",
        "Jika Kakak mentor liat in aku ada pesan buat kakak. di tim aku ada yang ga kerja kak. namanya Nayla Azizah, Abai, miftahul farid",
        "KAKK AKU CAPEEE NGERJAIN KODINGANN SENDIRIANN",
        "LOPYOUUU KARINA"
    )

    val lazyGridImages = listOf(
        R.drawable.karina6,
        R.drawable.karinadetail,
        R.drawable.karina8,
        R.drawable.karina11,
        R.drawable.karina10,
        R.drawable.karina9,
        R.drawable.karina12,
        R.drawable.karina13,
        R.drawable.karina14,
        R.drawable.karina15,
        R.drawable.karina16,
        R.drawable.karina17,
        R.drawable.karina18,
        R.drawable.karina19,
        R.drawable.karina20,
        R.drawable.karina21,
    )

    val lazyGridDescriptions = listOf(
        "Lu tau ga? gw sih gatau",
        "Makan sama kamu di korea",
        "Pulang pulang gandeng karina",
        "Hai kamu yang cek tugasnya",
        "Jangan lupa kasi nilai A",
        "Nyambung gasih bang?",
        "Nyambungin aja",
        "Karina cakep bgt oyy",
        "Gatau ni ah",
        "lopyuu karina",
        "Aihhh karina cakep bgt",
        "Arigato, sarangheo, nihao",
        "INI KARINA CAKEP OYYY PUNYA GW",
        "CAKEPNYA OY",
        "Ngoding sambil bayangin karina jadi istri gwehh",
        "Jangan dianggap gila yaa",
    )

    Column(
        modifier = Modifier.fillMaxSize().background(color = white),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Box(modifier = Modifier.fillMaxWidth())
        {
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(412.dp)
                    .height(150.dp))
            {

                Text(
                    text = "Beranda",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )

            }
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(412.dp)
                    .height(150.dp)
                    .padding(start = 250.dp))
            {
                IconButton(
                    onClick = { /*TODO()*/ },
                    modifier = Modifier.size(50.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .width(41.dp)
                            .height(41.dp),
                        painter = painterResource(id = R.drawable.btncari),
                        contentDescription = "cari btn"
                    )
                }
            }


        }
        LazyColumn(
            modifier = Modifier
                .background(color = white)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(
                    text = "Karina Luv",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier.padding(end = 220.dp)
                )
                Text(
                    text = "Waipu Gwehh",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier.padding(end = 265.dp)
                )
            }
            item {
                LazyRow(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                )
                {
                    items(lazyRowImages.size) { index ->
                        IconButton(
                            onClick = {
                                navController.navigate("detail_screen/${lazyRowImages[index]}/${lazyRowDescriptions[index]}")
                            },
                            modifier = Modifier
                                .width(130.dp)
                                .height(90.dp)
                        ) {
                            Image(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                painter = painterResource(id = lazyRowImages[index]),
                                contentDescription = "Gambar ${index + 1}",
                                contentScale = ContentScale.FillBounds
                            )
                        }
                    }
                }

            }
        }
        Box(modifier = Modifier.fillMaxWidth())
        {
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                verticalItemSpacing = 4.dp,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.padding(4.dp)
            )
            {

                items(lazyGridImages.size) { index ->
                    Image(
                        painter = painterResource(id = lazyGridImages[index]),
                        contentDescription = null,
                        modifier = Modifier
                            .clickable {
                                navController.navigate("detail_screen/${lazyGridImages[index]}/${lazyGridDescriptions[index]}")
                            }
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        contentScale = ContentScale.Crop
                    )
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
                            onClick = { /* TODO: */ },
                            modifier = Modifier.size(50.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.iconhome),
                                contentDescription = "Icon 1"
                            )
                        }


                        IconButton(
                            onClick = {

                                navController.navigate("empty_screen")
                            },
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
