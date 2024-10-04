package com.example.playjuegos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.res.ResourcesCompat
import com.example.playjuegos.ui.theme.PlayJuegosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)

        val jugador = findViewById(R.id.button1) as Button

        jugador.setOnClickListener {
            lanzarNewPlayer()
        }

        val titulo = findViewById<TextView>(R.id.textView)

        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgetteregular)

    }

    fun lanzarNewPlayer() {
        val i = Intent (this, NewPlayer::class.java)
        startActivity(i)
    }


}