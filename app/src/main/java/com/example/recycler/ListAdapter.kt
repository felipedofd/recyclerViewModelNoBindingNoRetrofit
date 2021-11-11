package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val listaChaves: List<MokData>)
    : RecyclerView.Adapter<ListAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listaChaves[position])
    }

    override fun getItemCount(): Int {
        return listaChaves.size
    }

    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(data: MokData){
            with(itemView) {
                val itemNome = findViewById<TextView>(R.id.item_nome)
                val itemEmail = findViewById<TextView>(R.id.item_email)

                itemNome.text = data.nome
                itemEmail.text = data.email
            }
        }
    }
}

