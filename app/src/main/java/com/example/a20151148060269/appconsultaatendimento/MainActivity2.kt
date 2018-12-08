package com.example.a20151148060269.appconsultaatendimento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val argumentos:Bundle=intent.extras

        val usuario:String=argumentos.getString("usuario")
        val numerosus:String=argumentos.getString("numerosus")

        textView_usuario.text="Bem vindo, $usuario!!"
        textView_numero.text="Número do SUS: $numerosus"


    }
}
