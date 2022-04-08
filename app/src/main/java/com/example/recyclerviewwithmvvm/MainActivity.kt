package com.example.recyclerviewwithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.progammingRecyclerView)
        val adapter = ProgramingAdapter()

        val p1 = ProgrammingItem(1,"j","java")
        val p2 = ProgrammingItem(2,"k","kotlin")

        val p3 = ProgrammingItem(3,"a","Android")

        val p4 = ProgrammingItem(4,"p","python")
        adapter.submitList(listOf(p1,p2,p3,p4))
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= adapter

        Handler(Looper.getMainLooper()).postDelayed({
            val p5 = ProgrammingItem(5,"A","Android")
            val p6 = ProgrammingItem(6,"R","Rust")

            val p7 = ProgrammingItem(7,"G","Golang")

            val p8 = ProgrammingItem(8,"N","Node")

        adapter.submitList(listOf(p5,p6,p7,p8))
        },4000)

    }
}