package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListPlayer(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Image(
                painter = painterResource(R.drawable.lb),
                contentDescription = "LEBRON JAMES",
                modifier = Modifier.size(width = 400.dp, height = 225.dp)
            )
            Text(
                text = "LEBRON JAMES",
                modifier = Modifier.padding(10.dp)
            )
        }

        item {
            Text(
                text = "LeBron Raymone James Sr., nacido el 30 de diciembre de 1984 en Akron, Ohio, es ampliamente " +
                        "considerado como uno de los mejores y más completos jugadores de baloncesto de todos los tiempos.",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp))

            Text( text = "Con una carrera profesional que abarca más de dos décadas (desde su debut en 2003 hasta la actualidad," +
                    " abril de 2026), LeBron ha mantenido un nivel de excelencia que desafía" +
                    " la longevidad de cualquier superstar anterior.",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp))

        }

        item {
            Text( text = "Hitos y Logros Clave (A Abril de 2026):",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )

            Text( text = "Máximo Anotador Histórico: En 2023, superó el récord de puntos de Kareem Abdul-Jabbar, " +
                    "convirtiéndose en el líder absoluto de anotaciones de la NBA. Al año siguiente, en 2024, se convirtió " +
                    "en el primer jugador de la NBA en superar los 40,000 puntos.",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
            )


        }

        item {
            Row() {
                Button(onClick = {/*TODO*/ }) {
                    Text(text = "Ver estadisticas")
                }

                Button(onClick = {/*TODO*/ }) {
                    Text(text = "Ver multimedia ")
                }
            }
        }
    }
}