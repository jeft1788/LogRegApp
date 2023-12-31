package com.example.logregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //var EXTRA_MESSAGE = "com.example.logregapp.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.btnReg)
        val edittext  = findViewById<EditText>(R.id.edtxname)
        boton.setOnClickListener {

            val mensaje:String =  edittext.text.toString()
            val intent = Intent(this, SecondActitity:: class.java).apply {
                putExtra("mensaje", mensaje)
            }
            startActivity(intent)
        }
    }
    fun enviar(view: View){
        val edittext  = findViewById<EditText>(R.id.edtxname)
        val mensaje:String =  edittext.text.toString()
        val intent = Intent(this, SecondActitity:: class.java).apply {
            putExtra("mensaje", mensaje)
        }
        startActivity(intent)
    }
}