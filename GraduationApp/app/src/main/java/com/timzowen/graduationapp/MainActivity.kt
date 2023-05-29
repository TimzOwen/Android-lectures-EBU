package com.timzowen.graduationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        val btnList = findViewById<Button>(R.id.btn_list)
        val etName = findViewById<EditText>(R.id.et_name)
        val etCourse = findViewById<EditText>(R.id.et_course)

        val et_Name = etName.text.toString()
        val et_Course = etCourse.text.toString()

        btnSubmit.setOnClickListener {
            val intent = Intent(this,GraduationActivity::class.java).also{
                it.putExtra("name",et_Name)
                it.putExtra("course",et_Course)
                startActivity(it)
            }
        }

        btnList.setOnClickListener {
            startActivity(Intent(this,ListActivity::class.java))
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.list_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ic_grad_list -> startActivity(Intent(this,ListActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

}