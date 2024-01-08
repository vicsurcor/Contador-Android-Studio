package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var valor: TextView;
    private lateinit var btns: Button;
    private lateinit var btnr: Button;
    private lateinit var btnrs: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valor = findViewById(R.id.resultado)
        btns = findViewById(R.id.suma)
        btnr = findViewById(R.id.resta)
        btnrs = findViewById(R.id.reset)
        btns.setOnClickListener { Suma() }
        btnr.setOnClickListener { Resta() }
        btnrs.setOnClickListener { Reset() }
    }

    fun Suma(){

        var num = valor.text.toString().toInt()
        num++
        valor.text = num.toString();

    }

    fun Resta(){

        var num = valor.text.toString().toInt();
        if (num != 0){
            num--;
            valor.text = num.toString();
        }


    }

    fun Reset(){

        valor.text = "0"

    }

}