package com.example.a20151148060269.appconsultaatendimento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.content.DialogInterface
import kotlinx.android.synthetic.main.cadastro.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun entrar(view: View){
        val usuario:String=editText.text.toString()
        val numerosus:String=editText2.text.toString()
        val senha:String=editText3.text.toString()

        if (usuario=="") {
            Toast.makeText(this, "Campo obrigátório!", Toast.LENGTH_LONG).show()
        }

        else if (numerosus=="") {
            Toast.makeText(this, "Digite o número do SUS", Toast.LENGTH_LONG).show()

        }
        else if (senha=="1234"){
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

    fun cadastrar(view: View){
        val mBuilder = AlertDialog.Builder(this@MainActivity)
        val teste = getLayoutInflater().inflate(R.layout.cadastro, null)

        mBuilder.setView(teste)
        val dialog = mBuilder.create()
        dialog.show()

        //val intentCall:Intent=Intent(this,R.layout.cadastro::class.java)

    }

    fun concluir(view: View){

        /*val cad_usuario:String = editText4.text.toString()
        val cad_email:String = editText12.text.toString()
        val cad_numerosus:String = editText6.text.toString()
        val cad_senha:String = editText7.text.toString()

        if (cad_usuario=="") {
            Toast.makeText(this, "Campo obrigatório!", Toast.LENGTH_LONG).show()
        }
        else if (cad_email==""){
            Toast.makeText(this, "Campo obrigátório!", Toast.LENGTH_LONG).show()

        }else if (cad_numerosus==""){
            Toast.makeText(this,"Campo obrigátório!(5 números)",Toast.LENGTH_LONG).show()

        }else if (cad_senha==""){
            Toast.makeText(this,"Campo obrigátório!(Mínimo de 5 caracteres)",Toast.LENGTH_LONG).show()
        }*/

            Toast.makeText(this, "Cadastro concluído!", Toast.LENGTH_LONG).show()
            val intentCall: Intent = Intent(this, MainActivity::class.java)
            startActivity(intentCall)


    }
}



