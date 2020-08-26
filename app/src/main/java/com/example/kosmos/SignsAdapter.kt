package com.example.kosmos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class SignsAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<SignsAdapter.SignsViewHolder>() {
    private var listOfSigns = listOf<SignsModel>()
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var signs = emptyList<SignsModel>()

    inner class SignsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(signs: SignsModel) {
            itemView.findViewById<TextView>(R.id.name_of_sign).text = signs.name
            Glide.with(itemView.context).load(signs.signImage!!)
                .into(itemView.findViewById(R.id.image_sign))
        }


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SignsAdapter.SignsViewHolder {

        return SignsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_sign_recyclerview, parent, false)
        )

    }

    override fun onBindViewHolder(holder: SignsAdapter.SignsViewHolder, position: Int) {
        val signHolder = holder as SignsViewHolder
        signHolder.bindView(listOfSigns[position])


    }

    override fun getItemCount(): Int = listOfSigns.size

    fun setSigns(listOfSigns: List<SignsModel>) {
        this.listOfSigns = listOfSigns
        notifyDataSetChanged()
    }


}