package com.example.pertemuan5tugasuserlayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {
    //  State untuk input field
    var namaDepan by remember { mutableStateOf("") }
    var namaBelakang by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var tglLahir by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }

    // state untuk checkbox skill
    var isAndroidDevChecked by remember { mutableStateOf(false) }
    var isUiUxChecked by remember { mutableStateOf(false) }
    var isWebDevChecked by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF1E1B2E)),

        ) {
        // 1. Header Banner Atas
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .background(Color(0xFF2A0845)),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.wallpaper_ultraman),
                contentDescription = "wallpaper Ultraman",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        // Card 2 putih form utama
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 170.dp),
            shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // Judul
                Text(
                    text = "Formulir Biodata",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6B46C1)
                )
                Text(
                    text = "Silahkan isi formulir biodata di bawah ini",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(6.dp))

                // Input Nama Depan & Belakang
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = namaDepan,
                        onValueChange = { namaDepan = it },
                        label = { Text("Nama Depan", fontSize = 11.sp) },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f)

                    )
                    OutlinedTextField(
                        value = namaBelakang,
                        onValueChange = { namaBelakang = it },
                        label = { Text("Nama Belakang", fontSize = 11.sp) },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f)
                    )
                }
                // Input Email
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email", fontSize = 11.sp) },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                )
                // Input Tgl Lahir & Experience
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = tglLahir,
                        onValueChange = { tglLahir = it },
                        label = { Text("Tanggal Lahir", fontSize = 11.sp) },
                        trailingIcon = {
                            Icon(Icons.Default.DateRange, contentDescription = "Callender")
                        },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedTextField(
                        value = experience,
                        onValueChange = { experience = it },
                        label = { Text("Experience", fontSize = 11.sp) },
                        trailingIcon = {
                            Icon(Icons.Default.ArrowDropDown, contentDescription = "Dropdown")
                        },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f)
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
            }
            // Label Skill
            Text(
                text = "Pilih Skill Anda :",
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                modifier = Modifier.fillMaxWidth()
            )
            // Checkbox Skill
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isAndroidDevChecked,
                        onCheckedChange = { isAndroidDevChecked = it },
                    )
                    Text(text = "Android", fontSize = 11.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isUiUxChecked,
                        onCheckedChange = { isUiUxChecked = it },
                    )
                    Text(text = "UI/UX", fontSize = 11.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isWebDevChecked,
                        onCheckedChange = { isWebDevChecked = it },
                    )
                    Text(text = "Web ", fontSize = 11.sp)
                }
                Spacer(modifier = Modifier.height(10.dp))

                // Tombol Submit / Proceed
                Button(
                    onClick = { /* Aksi submit */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(44.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDCDCDC))
                ) {
                    Text(text = "Proceed", color = Color.White)
                }
            }
        }
    }
}

















