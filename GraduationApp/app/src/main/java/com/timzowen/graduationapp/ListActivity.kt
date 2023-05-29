package com.timzowen.graduationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val gradList = findViewById<ListView>(R.id.lv_grad_list)

        val graduationList = arrayListOf<String>(
            "Timz Owen",
            "Ambrose Musyoka",
            "B Nyaga",
            "Joshua Samson",
            "Kipyegon Wilberforce",
            "Olujide Alabi",
            "Timz Owen",
            "Ambrose Musyoka",
            "B Nyaga",
            "Joshua Samson",
            "Kipyegon Wilberforce",
            "Olujide Alabi",
            "Timz Owen",
            "Ambrose Musyoka",
            "B Nyaga",
            "Joshua Samson",
            "Kipyegon Wilberforce",
            "Olujide Alabi",
            "Timz Owen",
            "Ambrose Musyoka",
            "B Nyaga",
            "Joshua Samson",
            "Kipyegon Wilberforce",
            "Olujide Alabi"
        )
        val gradAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,graduationList)
        gradList.adapter = gradAdapter

        gradList.setOnItemClickListener { parent, view, position, id ->
            when(position){
                0 -> Toast.makeText(this, "index ${position}", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "index ${position}", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "index ${position}", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "index ${position}", Toast.LENGTH_SHORT).show()
            }
        }

    }

    // menu inflators
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.grad_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Menu selectors
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ic_home -> startActivity(Intent(this,MainActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }


}