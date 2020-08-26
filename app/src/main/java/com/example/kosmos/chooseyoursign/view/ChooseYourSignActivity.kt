package com.example.kosmos.chooseyoursign.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kosmos.R.id
import com.example.kosmos.R.layout
import com.example.kosmos.chooseyoursign.view.adapter.ChooseYourSignAdapter
import com.example.kosmos.chooseyoursign.viewmodel.ChooseYourSignViewModel

class ChooseYourSignActivity : AppCompatActivity() {
    private val adapter: ChooseYourSignAdapter by lazy {
        ChooseYourSignAdapter(this)
    }

    private val viewModel: ChooseYourSignViewModel by lazy {
        ViewModelProvider(this).get(
            ChooseYourSignViewModel::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_choose_your_sign)

        val recyclerView = findViewById<RecyclerView>(id.recycler_signs)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.addItemDecoration(
            GridItemDecoration(
                2,
                2
            )
        )
        recyclerView.adapter = adapter
        adapter.setSigns(viewModel.generateDummySigns())
    }
}