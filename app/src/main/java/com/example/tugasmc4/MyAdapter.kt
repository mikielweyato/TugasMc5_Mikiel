package com.example.tugasmc4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter (private  val  namaList : ArrayList<itemdata>) :RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder (itemdata: View) : RecyclerView.ViewHolder (itemdata){
        val gambar : ImageView = itemdata.findViewById(R.id.img_item_photo)
        val nama : TextView = itemdata.findViewById(R.id.tv_item_name)
        val asal : TextView = itemdata.findViewById(R.id.tv_item_description)
    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_data,parent,false)
        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int {
    return namaList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currenItem: itemdata = namaList[position]
        holder.gambar.setImageResource(currenItem.gambar)
        holder.nama.text = currenItem.nama
        holder.asal.text = currenItem.asal
    }
}