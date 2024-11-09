package com.example.adressbook

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.Menu
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

             private lateinit var surnameText: EditText
             private lateinit var nameText: EditText
             private lateinit var adressText: EditText
             private lateinit var phoneText: EditText
             private lateinit var button: Button
             private lateinit var tetxTv: ListView
             val listPerson: MutableList<Person> = mutableListOf()

   // companion object { const val Item_1 = 1
    //                   const val Item_2 = 2
    //                   const val Item_3 = 3 }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenuInfo?){

      //  super.onCreateContextMenu(menu, v, menuInfo)
       //     menu?.add(Menu.NONE, Item_1,Menu.NONE, " Посмотреть карточку")
       //     menu?.add(Menu.NONE, Item_2,Menu.NONE, " Удалить карточку")
        //    menu?.add(Menu.NONE, Item_3,Menu.NONE, " Выход из программы")


    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        surnameText = findViewById(R.id.surnameText)
        nameText = findViewById(R.id.nameText)
        adressText = findViewById(R.id.adressText)
        phoneText = findViewById(R.id.phoneText)
        button = findViewById(R.id.button)
        tetxTv = findViewById(R.id.textTv)
       // registerForContextMenu(tetxTv)



         val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,listPerson)
        tetxTv.adapter = adapter

         button.setOnClickListener{
             if (surnameText.text.isEmpty() or nameText.text.isEmpty() or adressText.text.isEmpty() or phoneText.text.isEmpty()) { return@setOnClickListener }

             listPerson.add(Person(surnameText.text.toString(),nameText.text.toString(), adressText.text.toString(),phoneText.text.toString()))

             adapter.notifyDataSetChanged()
             surnameText.text.clear(); nameText.text.clear(); adressText.text.clear(); phoneText.text.clear() }

               tetxTv.onItemClickListener = AdapterView.OnItemClickListener { s,v, position,id ->
                   // adapter.remove(adapter.getItem(position))
                   val intent = Intent(this,Activity2::class.java)
                  // intent.putExtra("key",position)
                  // intent.putExtra("key",listPerson[position].surname)
                     intent.putExtra(Person::class.java.simpleName,listPerson[position])
                   startActivity(intent)
                }


                                //  startActivity(Intent(this,Activity2::class.java))


        }
    }
