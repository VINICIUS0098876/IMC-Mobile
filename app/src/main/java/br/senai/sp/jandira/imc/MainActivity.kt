package br.senai.sp.jandira.imc

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .background(color = Color(0xffea1450)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Image(
                painter = painterResource(id = R.drawable.bmi),
                contentDescription = "",
                modifier = Modifier
                    .size(height = 76.dp, width = 76.dp)
                    .padding(top = 16.dp)

            )
            Text(
                text = "Calculadora IMC",
                modifier = Modifier
                    .padding(top = 10.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp
            )
        }

        Card(
            modifier = Modifier
                .size(height = 420.dp, width = 300.dp)
                .offset(x = 45.dp, y = -30.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xffF9F6F6)
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(30.dp)

            ) {
                Text(
                    text = "Seus dados",
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp),
                    fontSize = 25.sp,
                    color = Color(0xffea1450),
                    fontWeight = FontWeight.ExtraBold
                )

                Text(
                    text = "Seu peso:",
                    color = Color(0xffea1450),
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                TextField(
                    value = "Seu peso em Kg" ,
                    onValueChange = {},
                    modifier = Modifier
                        .border(width = 1.dp,
                            color = Color(0xffea1450),
                            shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0xffFFFFFF)),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedTextColor = Color(0xffAFA9A9),
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Transparent,
                        ),

                )

                Text(
                    text = "Sua altura:",
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 10.dp),
                    color = Color(0xffea1450),

                )

                TextField(
                    value = "Sua altura em cm",
                    onValueChange = {},
                    modifier = Modifier
                        .border(width = 1.dp,
                        color = Color(0xffea1450),
                        shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0xffFFFFFF)),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedTextColor = Color(0xffAFA9A9),
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Transparent,
                        ),



                    )




                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(300.dp)
                        .padding(top = 20.dp),
                    shape = RoundedCornerShape(size = 8.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xffea1450)
                        )
                ) {
                    Text(
                        text = "Calcular",
                        modifier = Modifier
                            .padding(3.dp)
                            ,
                        fontSize = 20.sp
                    )
                }


        }
        }
        Card(
            modifier = Modifier
                .size(width = 300.dp, height = 100.dp)
                .align(alignment = Alignment.CenterHorizontally),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xff329F6B)
                )

        ) {
            Row(
                modifier = Modifier

            ) {

            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 5.dp),
            ) {
                Text(
                    text = "Resultado",
                    modifier = Modifier
                        .padding(start = 6.dp),
                    color = Color.White

                )

                Text(
                    text = "Peso Ideal",
                    modifier = Modifier,
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
                Text(
                    text = "21.3",
                    modifier = Modifier
                        .padding(top = 15.dp, start = 20.dp),
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 50.sp
                )
            }
        }

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}