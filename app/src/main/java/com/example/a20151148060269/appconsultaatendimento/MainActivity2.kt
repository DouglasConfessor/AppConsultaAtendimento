package com.example.a20151148060269.appconsultaatendimento

import android.Manifest

import android.content.Intent
import android.content.pm.PackageManager
import android.media.audiofx.BassBoost
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog

import kotlinx.android.synthetic.main.activity_main2.*

import android.support.v7.widget.Toolbar
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.widget.*

import com.mancj.materialsearchbar.MaterialSearchBar




 class MainActivity2 : AppCompatActivity() {




     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main2)

         val argumentos: Bundle = intent.extras

         val usuario: String = argumentos.getString("usuario")
         val numerosus: String = argumentos.getString("numerosus")

         textView_usuario.text = "Bem vindo, $usuario!!"
         textView_numero.text = "Número do SUS: $numerosus"



         //REFERENCIA MATERIALSEARCHBAR E LISTVIEW
         val lv = findViewById(R.id.mListView) as ListView
         val searchBar = findViewById(R.id.searchBar) as MaterialSearchBar
         searchBar.setHint("Procurar..")


         var postos = arrayOf("Posto de saúde Jardim Aeroporto", "Posto de Saúde Bela Vista", "Unidade de Saúde Monte Castelo",
                 "Posto de Saúde Liberdade", "Posto de Saúde Esperança", "Posto de Saúde Emaús", "Unidade Básica de Saúde Cidade Verde"  )

         //ADAPTADOR
         val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, postos)
         lv.setAdapter(adapter)

         //SEARCHBAR TEXTO MODIFICADO E LISTENER
         searchBar.addTextChangeListener(object : TextWatcher {
             override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

             }

             override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                 //SEARCH FILTRO
                 adapter.getFilter().filter(charSequence)
             }

             override fun afterTextChanged(editable: Editable) {

             }
         })

         //LISTVIEW ITEM CLICADO
         lv.setOnItemClickListener(object : AdapterView.OnItemClickListener {
             override fun onItemClick(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {

                 if (adapter.getItem(i) == "Posto de saúde Jardim Aeroporto" ) {

                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.jardim_aeroporto, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()
                 } else if (adapter.getItem(i) == "Posto de Saúde Bela Vista"){

                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.bela_vista, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()
                 } else if (adapter.getItem(i) == "Unidade de Saúde Monte Castelo"){

                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.monte_castelo, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()

                 } else if (adapter.getItem(i) == "Posto de Saúde Liberdade"){

                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.liberdade, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()
                 } else if (adapter.getItem(i) == "Posto de Saúde Esperança"){

                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.esperanca, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()

                 } else if (adapter.getItem(i) == "Posto de Saúde Emaús"){

                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.emaus, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()
                 } else if (adapter.getItem(i) == "Unidade Básica de Saúde Cidade Verde"){


                     val mBuilder = AlertDialog.Builder(this@MainActivity2)
                     val teste = getLayoutInflater().inflate(R.layout.cidade_verde, null)


                     mBuilder.setView(teste)
                     val dialog = mBuilder.create()
                     dialog.show()
                 }
                 Toast.makeText(this@MainActivity2, adapter.getItem(i)!!.toString(), Toast.LENGTH_SHORT).show()
             }
         })


         //end


        button2.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent);
        }

     }
/*
     fun clicar(view: View){
         val intentCall:Intent=Intent(this,MapsActivity::class.java)


         startActivity(intentCall)


     }
*/
     }










