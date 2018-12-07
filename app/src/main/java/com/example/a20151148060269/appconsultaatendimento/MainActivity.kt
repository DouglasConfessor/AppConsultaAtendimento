package com.example.a20151148060269.appconsultaatendimento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun entrar(view: View){
        val usuario:String=editText.text.toString()
        val numerosus:String=editText2.text.toString()
        val senha:String=editText3.text.toString()

        if (senha=="1234"){
            val intentCall:Intent=Intent(this,MainActivity2::class.java)
            val parametros:Bundle=Bundle()
            parametros.putString("usuario",usuario)
            parametros.putString("numerosus",numerosus)
            intentCall.putExtras(parametros)
            startActivity(intentCall)
        }else{
            Toast.makeText(this,"Senha Errada",Toast.LENGTH_LONG).show()
        }
    }





}
