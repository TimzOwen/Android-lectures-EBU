package com.timzowen.graduationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class GraduationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduation)

    }
    // val tvCourse = findViewById<TextView>(R.id.tv_course_name)

    val tv_Name = intent.getStringExtra("name")
    val tv_Course = intent.getStringExtra("course")


    val tvName = findViewById<TextView>(R.id.tv_name).apply {
        text = tv_Name

        // tvCourse.setText(tv_Course)

    }
}