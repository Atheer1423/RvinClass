package com.example.rvinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var B1: Button
    lateinit var ed: EditText
    lateinit var Rc:RecyclerView
    lateinit var Inputs:ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        B1=findViewById(R.id.b1)
        ed=findViewById(R.id.ed1)
        Rc=findViewById(R.id.rv)
        Inputs=ArrayList()

        Rc.adapter=myAdapter(this, Inputs)
        Rc.layoutManager = LinearLayoutManager(this)

        B1.setOnClickListener{
            var text=ed.text.toString()
            Inputs.add(text)
            Rc.adapter?.notifyDataSetChanged()
            ed.text.clear()
            ed.clearFocus()
        }

    }
}