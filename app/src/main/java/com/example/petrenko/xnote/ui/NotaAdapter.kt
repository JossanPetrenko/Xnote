package com.example.petrenko.xnote.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.petrenko.xnote.R
import com.example.petrenko.xnote.model.Nota

class NotaAdapter(val listaNotas:List<Nota>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return listaNotas.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is ItemViewHolder){
            holder.titulo.text = listaNotas[position].titulo
        }
    }


    class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val titulo : TextView by lazy {itemView.findViewById(R.id.tv_item_titulo) as TextView}
    }


}

