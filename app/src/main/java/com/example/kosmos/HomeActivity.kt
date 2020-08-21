package com.example.kosmos

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_signs)
        val adapter = SignsAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = RecyclerView.LayoutManager(this)
    }
}