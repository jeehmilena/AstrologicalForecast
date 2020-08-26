package com.example.kosmos.chooseyoursign.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kosmos.R
import com.example.kosmos.chooseyoursign.model.ChooseYourSignModel

class ChooseYourSignAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<ChooseYourSignAdapter.SignsViewHolder>() {
    private var listOfSigns = listOf<ChooseYourSignModel>()
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var signs = emptyList<ChooseYourSignModel>()

    inner class SignsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(chooseYourSign: ChooseYourSignModel) {
            itemView.findViewById<TextView>(R.id.name_of_sign).text = chooseYourSign.name
            Glide.with(itemView.context).load(chooseYourSign.signImage!!)
                .into(itemView.findViewById(R.id.image_sign))
        }


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SignsViewHolder {

        return SignsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_choose_your_sign_recyclerview, parent, false)
        )

    }

    override fun onBindViewHolder(holder: SignsViewHolder, position: Int) {
        val signHolder = holder as SignsViewHolder
        signHolder.bindView(listOfSigns[position])


    }

    override fun getItemCount(): Int = listOfSigns.size

    fun setSigns(listOfSigns: List<ChooseYourSignModel>) {
        this.listOfSigns = listOfSigns
        notifyDataSetChanged()
    }


}