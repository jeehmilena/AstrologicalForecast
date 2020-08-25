package com.example.kosmos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()

    }

    private fun initView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_signs)
        val adapter = SignsAdapter(this)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.addItemDecoration(GridItemDecoration(10, 2))
        recyclerView.adapter = adapter
        adapter.setSigns(generateDummySigns())

    }

    private fun generateDummySigns(): List<SignsModel> {
        val listOfSigns = mutableListOf<SignsModel>()


        var sign = SignsModel(1, "Áries", R.drawable.kosmos_aries)
        listOfSigns.add(sign)

        sign = SignsModel(2, "Touro", R.drawable.kosmos_taurus)
        listOfSigns.add(sign)

        sign = SignsModel(3, "Gêmeos", R.drawable.kosmos_gemini)
        listOfSigns.add(sign)

        sign = SignsModel(4, "Câncer", R.drawable.kosmos_cancer)
        listOfSigns.add(sign)

        sign = SignsModel(5, "Leão", R.drawable.kosmos_leo)
        listOfSigns.add(sign)

        sign = SignsModel(6, "Virgem", R.drawable.kosmos_virgo)
        listOfSigns.add(sign)

        sign = SignsModel(7, "Libra", R.drawable.kosmos_libra)
        listOfSigns.add(sign)

        sign = SignsModel(8, "Scorpião", R.drawable.kosmos_scorpio)
        listOfSigns.add(sign)

        sign = SignsModel(9, "Sagitário", R.drawable.kosmos_sagittarius)
        listOfSigns.add(sign)

        sign = SignsModel(10, "Capricornio", R.drawable.kosmos_capricorn)
        listOfSigns.add(sign)
        sign = SignsModel(11, "Aquario", R.drawable.kosmos_aquarium)
        listOfSigns.add(sign)

        sign = SignsModel(12, "Peixes", R.drawable.kosmos_pisces)
        listOfSigns.add(sign)

        return listOfSigns

    }
}