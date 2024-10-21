package com.example.pertemanke4.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pertemanke4.R

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection2()
        DetailMhs(
            param = "Nama",
            argu = "Jois Ilham"
        )
        DetailMhs(
            param = "Nim",
            argu ="20220140128")

        DetailMhs(
            param = "Prodi",
            argu ="Teknologi Informasi")

        DetailMhs(
            param = "Falkutas",
            argu ="Teknik")


    }
}



@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(painter = painterResource(id = R.drawable.hala),
                    contentDescription = "ini adalah icon",
                    modifier = Modifier.clip(CircleShape)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
            Column (
                modifier = Modifier.padding(14.dp)
            ) {
                Text(text = "REAL MADRID")
                Text(text = "HALA MADRID")
            }
        }
    }
}

@Composable
fun DetailMhs(param: String, argu: String) {
    Column(
        modifier = Modifier.padding(16.dp),

    ) {
        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.8f))
            Text(text = argu,
                modifier = Modifier.weight(0.8f)
            )

        }


    }
}


