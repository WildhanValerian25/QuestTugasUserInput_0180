package com.example.pertemuan5tugasuserlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan5tugasuserlayout.ui.theme.Pertemuan5TugasUserLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan5TugasUserLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FormBiodata(
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FormBiodataPreview() {
    Pertemuan5TugasUserLayoutTheme {
        FormBiodata()
    }
}


