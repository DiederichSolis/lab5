package com.diederich.laboratorio5

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.diederich.laboratorio5.ui.theme.Laboratorio5Theme
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diederich.laboratorio5.ui.theme.barra
import com.diederich.laboratorio5.ui.theme.cc

import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    my_components()
                }
            }
        }
    }
}

@Composable
fun my_components(){
    Column (    modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        //TOPAPPBAR
        TopAppBar(
            backgroundColor = barra, // Color de fondo personalizado
            elevation = AppBarDefaults.TopAppBarElevation,
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .height(60.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "  TodoEventos",
                    modifier = Modifier
                        .weight(1f)
                        .height(56.dp),
                    style = MaterialTheme.typography.h6,
                    color = Color.Black, // Color del texto
                )

                IconButton(
                    onClick = {
                        // Acción cuando se presiona el botón
                    },
                    modifier = Modifier
                        .height(56.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon), // Reemplaza con tu ícono
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        tint = Color.Black, // Color del ícono
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los dos Rows



        //TEXTO
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "   Your Favorites",
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp),
                style = TextStyle(
                    fontSize = 17.sp,
                    color = Color.Black

                )

            )
        }


            Spacer(modifier = Modifier.height(2.dp)) // Espacio entre los Rows y la Card

        //CARDS
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {

                Spacer(modifier = Modifier.width(16.dp))

                Card(
                    modifier = Modifier
                        .width(175.dp)
                        .height(225.dp),
                    shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                            backgroundColor = cc
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.cardimage1),
                            contentDescription = null, // Descripción del contenido para accesibilidad
                            modifier = Modifier
                                .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                                .height(150.dp) // Altura de la imagen
                                .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                                .aspectRatio(1f) // Relación de aspecto cuadrada
                                .clip(MaterialTheme.shapes.small) // Forma de círculo

                        )

                        Spacer(modifier = Modifier.height(2.dp))

                        Text(
                            text = "Title",
                            style = TextStyle(
                                fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                                color = Color.Black // Color del texto
                            )
                        )

                        Text(
                            text = "Supporting text",
                            style = TextStyle(
                                fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                                color = Color.Black // Color del texto
                            )
                        )
                    }
                    // Puedes agregar otro elemento en esta fila si lo necesitas
                }



                Spacer(modifier = Modifier.width(16.dp))

                //Segundo card
                Card(
                    modifier = Modifier
                        .width(175.dp)
                        .height(225.dp),
                    shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                    backgroundColor = cc
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.micro),
                            contentDescription = null, // Descripción del contenido para accesibilidad
                            modifier = Modifier
                                .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                                .height(145.dp) // Altura de la imagen
                                .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                                .aspectRatio(1f) // Relación de aspecto cuadrada
                                .clip(MaterialTheme.shapes.small) // Forma de círculo

                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Title",
                            style = TextStyle(
                                fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                                color = Color.Black // Color del texto
                            )
                        )

                        Text(
                            text = "Supporting text",
                            style = TextStyle(
                                fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                                color = Color.Black // Color del texto
                            )
                        )
                    }
                    // Puedes agregar otro elemento en esta fila si lo necesitas
                }
            }


        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los dos Rows
        //Segundo row
        //CARDS
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Spacer(modifier = Modifier.width(16.dp))

            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.planta),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(150.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }



            Spacer(modifier = Modifier.width(16.dp))

            //Segundo card
            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.azul),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(145.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los row y el texto
        //TEXTO
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "     All Concerts",
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp),
                style = TextStyle(
                    fontSize = 17.sp,
                    color = Color.Black

                )

            )
        }



        //CARDS
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Spacer(modifier = Modifier.width(16.dp))

            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cardimage1),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(150.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }



            Spacer(modifier = Modifier.width(16.dp))

            //Segundo card
            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cardimage1),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(145.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }
        }


    }
}


@Preview
@Composable
fun previous(){
    my_components()
}

