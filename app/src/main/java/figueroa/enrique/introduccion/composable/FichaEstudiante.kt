package figueroa.enrique.introduccion.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import figueroa.enrique.introduccion.iconos.AddIc
import figueroa.enrique.introduccion.iconos.RemoveIc
import kotlin.text.ifEmpty

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FichaEstudiante() {

    var nombre by remember {
        mutableStateOf("")
    }

    var semestre by remember {
        mutableIntStateOf(1)
    }

    var carrera by remember {
        mutableStateOf("")
    }

    var likes by remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Mi Ficha")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .padding(start = 25.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Text("Limpiar")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            TarjetaPerfil(nombre, semestre, carrera)
            TarjetaFormulario(
                nombre,
                carrera,
                onNombreChange = {
                    nuevoNombre -> nombre = nuevoNombre
                },
                onCarreraChange = {
                    nuevaCarrera -> carrera = nuevaCarrera
                }
            )
            TarjetaSemestre(
                semestre,
                onSemestreChange = {
                    nuevoSemestre -> semestre = nuevoSemestre
                }
            )
            TarjetaLikes(
                likes,
                onLikesChange = {
                    nuevoLikes -> likes = nuevoLikes
                }
            )
        }
    }
}

@Composable
fun TarjetaPerfil(
    nombre: String,
    semestre: Int,
    carrera: String
) {
    //Tarjeta Perfil
    Card(
        modifier = Modifier
            .padding(10.dp)
            .height(300.dp)
            .fillMaxWidth()
            //.weight(2f)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(150.dp)
                    .clip(CircleShape)
                    .height(150.dp)
                    .background(color = Color.Gray)
            ) {
                val inicial = nombre.firstOrNull()?.toString() ?: "?"
                Text(
                    text = inicial.uppercase(), fontSize = 49.sp
                )
            }
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = nombre.ifEmpty { "Sin Nombre" },
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = carrera.ifEmpty { "Sin Carrera" },
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "Semestre: $semestre",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Composable
fun TarjetaFormulario(
    nombre: String,
    carrera: String,
    onNombreChange: (String) -> Unit,
    onCarreraChange: (String) -> Unit
) {
    //Campos de texto
    Column(
        modifier = Modifier
            .padding(horizontal = 3.dp)
            .fillMaxWidth(),
            //.weight(1f)
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = nombre,
            onValueChange = onNombreChange,
            placeholder = { Text("Enrique Diaz") },
            shape = CircleShape,
            label = { Text("Nombre Del Alumno") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = carrera,
            onValueChange = onCarreraChange,
            placeholder = { Text("Ingenieria en Electronica") },
            shape = CircleShape,
            label = { Text("Carrera") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun TarjetaSemestre(
    semestre: Int,
    onSemestreChange: (Int) -> Unit
) {
    //Selector de semestre
    Column(
        modifier = Modifier
            .padding(horizontal = 3.dp)
            .fillMaxWidth(),
            //.weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("${semestre}º Semestre")
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .horizontalScroll(state = rememberScrollState())
        ) {
            listOf(1, 2, 3, 4, 5, 6, 7, 8).forEach { n ->
                FilterChip(
                    selected = semestre == n,
                    onClick = { onSemestreChange(n) },
                    shape = CircleShape,
                    elevation = SelectableChipElevation(
                        elevation = 8.dp,
                        pressedElevation = 10.dp,
                        focusedElevation = 11.dp,
                        hoveredElevation = 12.dp,
                        draggedElevation = 13.dp,
                        disabledElevation = 5.dp
                    ),
                    label = { Text("${n}º") }
                )
            }
        }
    }
}

@Composable
fun TarjetaLikes(
    likes: Int,
    onLikesChange: (Int) -> Unit
) {
    //Likes
    Column(
        modifier = Modifier
            .padding(horizontal = 3.dp)
            .fillMaxWidth(),
            //.weight(1f),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            FilledTonalButton(
                onClick = {
                    if (likes > 0) onLikesChange(likes - 1)
                }
            ) {
                Icon(
                    imageVector = RemoveIc,
                    contentDescription = null
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "$likes",
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    fontSize = 28.sp
                )
                Text(
                    text = "Likes",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }
            FilledTonalButton(
                onClick = {
                    onLikesChange(likes + 1)
                }
            ) {
                Icon(
                    imageVector = AddIc,
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
@Preview
fun FichaEstudiantePreview() {
    FichaEstudiante()
}