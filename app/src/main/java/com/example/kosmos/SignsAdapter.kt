package com.example.kosmos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class SignsAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<SignsAdapter.SignsViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var signs = emptyList<Signs>()

    inner class SignsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val signImage: ImageView = itemView.findViewById(R.id.image_sign)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SignsAdapter.SignsViewHolder {

        val itemView = inflater.inflate(R.layout.item_sign_recyclerview, parent, false)
        return SignsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: SignsAdapter.SignsViewHolder, position: Int) {
        val current = signs[position]
        // holder.signImage.drawable = current.id
        TODO("pegar a posição a partir do id do signo")

    }

    override fun getItemCount() = signs.size

    internal fun setSigns(signs: List<Signs>) {
        this.signs = signs
        notifyDataSetChanged()
    }


}