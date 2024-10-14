package com.example.dotanews02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val dataList: ArrayList<ModelClass> , val context: Context) : RecyclerView.Adapter<ItemAdapter.viewHolder>() {

    var onItemClick: ((ModelClass) -> Unit)? = null

    class viewHolder(view : View) : RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.image)
        val date = view.findViewById<TextView>(R.id.date)
        val title = view.findViewById<TextView>(R.id.title)
       // val description = view.findViewById<TextView>(R.id.description)
        val detailImage = view.findViewById<ImageView>(R.id.detailImage)
        val detailTitle = view.findViewById<TextView>(R.id.detailTitle)
        val detailDesc = view.findViewById<TextView>(R.id.detailDesc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_file,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val data = dataList[position]
        holder.image.setImageResource(data.image)
        holder.date.text = data.date
        holder.title.text = data.title
       // holder.description.text = data.description

//        holder.itemView.setOnClickListener {
//            val intent = Intent(context, ItemDetail::class.java).apply {
//                putExtra("img", data.image)
//                putExtra("detailTitle", data.title)
//                putExtra("detailDesc", data.description)
//            }
//            context.startActivity(intent)
//        }

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(data)
        }
    }
}      