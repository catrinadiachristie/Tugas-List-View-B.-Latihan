package com.uty.listviewicon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.listviewicon.model.Bahasa

class ListBahasaAdapter (val listBahasa: ArrayList<Bahasa>) : RecyclerView.Adapter<ListBahasaAdapter.BahasaViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListBahasaAdapter.BahasaViewHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.item_bahasa, p0, false)
        return BahasaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBahasa.size
    }

    override fun onBindViewHolder(holder: ListBahasaAdapter.BahasaViewHolder, position: Int) {
        val bahasa: Bahasa = listBahasa[position]
        holder.tvBahasa.text = bahasa.nama
        holder.tvinformasi.text = bahasa.info
        Glide.with(holder.itemView.context)
            .load(bahasa.gambar)
            .into(holder.gmbr)
    }
    inner class BahasaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvBahasa: TextView = itemView.findViewById(R.id.textview_itemnama_bahasa)
        val tvinformasi: TextView = itemView.findViewById(R.id.textview_iteminfo_bahasa)
        val gmbr: ImageView = itemView.findViewById(R.id.gambar_bahasa)
    }
}