package com.example.adressbook
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import android.content.Context
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import java.io.Serializable

class Person(val surname: String,val name: String,val adress: String, val phone: String): Serializable {


    override fun toString() = " ${surname}   /   ${name} "

  //  companion object {



      //  fun actyvity2(context: Context, adapter: ArrayAdapter<Person>) =
         //   AdapterView.OnItemClickListener { s, v, position, id -> }

   // }


}




