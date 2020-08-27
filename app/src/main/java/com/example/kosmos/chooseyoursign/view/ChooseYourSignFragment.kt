package com.example.kosmos.chooseyoursign.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kosmos.R
import com.example.kosmos.chooseyoursign.view.adapter.ChooseYourSignAdapter
import com.example.kosmos.chooseyoursign.viewmodel.ChooseYourSignViewModel

class ChooseYourSignFragment : Fragment() {
    private val adapter: ChooseYourSignAdapter by lazy {
        ChooseYourSignAdapter(context)
    }

    private val viewModel: ChooseYourSignViewModel by lazy {
        ViewModelProvider(this).get(
            ChooseYourSignViewModel::class.java
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_choose_your_sign, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_signs)

        recyclerView.layoutManager = GridLayoutManager(context, 2)
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