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

        val itemView = inflater.inflate(R.layout.item_sign_recyclerview, parent, false)
        return SignsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: SignsAdapter.SignsViewHolder, position: Int) {
        val signHolder = holder as SignsViewHolder
        signHolder.bindView(listOfSigns[position])

    }

    override fun getItemCount() = signs.size

    fun setSigns(signs: List<SignsModel>) {
        this.signs = signs
        notifyDataSetChanged()
    }


}