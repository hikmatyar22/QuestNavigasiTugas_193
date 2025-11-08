package com.example.tugasquestnavigasi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasquestnavigasi.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilanData(
    OnBerandaClick: () -> Unit,
    OnFormulirClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFF0D1B2A)
    ) { isikonten ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF0D1B2A))
                .padding(isikonten)
                .padding(top = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.list),
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            )

            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 28.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(90.dp)
                    ) {
                        Column {
                            Text(stringResource(id = R.string.namalengkap), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Hikmatyar", color = Color.White)
                        }
                        Column {
                            Text(stringResource(id = R.string.jenis), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Laki-Laki", color = Color.White)
                        }
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(100.dp)
                    ) {
                        Column {
                            Text(stringResource(id = R.string.fans), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Ultras", color = Color.White)
                        }
                        Column {
                            Text(stringResource(id = R.string.alamat), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Yogyakarta", color = Color.White)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 28.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(90.dp)
                    ) {
                        Column {
                            Text(stringResource(id = R.string.namalengkap), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Hafiza", color = Color.White)
                        }
                        Column {
                            Text(stringResource(id = R.string.jenis), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Perempuan", color = Color.White)
                        }
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(100.dp)
                    ) {
                        Column {
                            Text(stringResource(id = R.string.fans), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Fans Aktif", color = Color.White)
                        }
                        Column {
                            Text(stringResource(id = R.string.alamat), fontWeight = FontWeight.Bold, color = Color.Gray)
                            Text("Pontianak", color = Color.White)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(250.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = OnBerandaClick,
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 30.dp)
                        .fillMaxHeight(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF415A77)),
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = stringResource(id = R.string.kembali),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Button(
                    onClick = OnFormulirClick,
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 30.dp)
                        .fillMaxHeight(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF415A77)),
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = stringResource(id = R.string.formulir),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

        }
    }
}


