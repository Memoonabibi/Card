package com.example.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Unforgettable Journey!",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 35.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        // First Card
        Card(
            colors = CardDefaults.cardColors(Color(0xFFB9E6C1)), // Islamic touch color
            modifier = Modifier
                .padding(10.dp)
                .shadow(9.dp, shape = RoundedCornerShape(19.dp))
                .clip(RoundedCornerShape(19.dp))
        ) {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kaaba_48089),
                    contentDescription = "Kaaba",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(110.dp, 158.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        text = "Makkah",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "A timeless symbol of unity and devotion, where the black stone's serene majesty reflects the boundless faith of millions.",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Second Card
        Card(
            colors = CardDefaults.cardColors(Color(0xFFE8F5E9)),
            modifier = Modifier
                .padding(10.dp)
                .shadow(9.dp, shape = RoundedCornerShape(19.dp))
                .clip(RoundedCornerShape(19.dp))
        ) {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.madina_02p),
                    contentDescription = "Madinah",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(110.dp, 158.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        text = "MADINAH",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Masjid-e-Nabawi: A sanctuary where every prayer echoes with the love and devotion of millions, and every corner tells a story of profound serenity.",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Third Card
        Card(
            colors = CardDefaults.cardColors(Color(0xFFCFD8DC)),
            modifier = Modifier
                .padding(10.dp)
                .shadow(9.dp, shape = RoundedCornerShape(19.dp))
                .clip(RoundedCornerShape(19.dp))
        ) {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.meekat),
                    contentDescription = "Another Example",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(110.dp, 158.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        text = "TAIF",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "The cool breeze and lush landscapes of Taif reflect the Prophet Muhammad's (PBUH) gentle spirit and patience.",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )
                }
            }
        }
    }
}
