package com.example.customrecyclerviewusingkotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecyclerviewusingkotlin.Model.Model
import com.example.customrecyclerviewusingkotlin.R
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(var arrayList: ArrayList<Model>, val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(arrayList[position])
        holder.itemView.setOnClickListener {
            if (position == 0)
            {
                Toast.makeText(context,"Facebook",Toast.LENGTH_LONG).show()
            }
            if (position == 1)
            {
                Toast.makeText(context,"Instagram",Toast.LENGTH_LONG).show()
            }
            if (position == 2)
            {
                Toast.makeText(context,"Twitter",Toast.LENGTH_LONG).show()
            }
            if (position == 3)
            {
                Toast.makeText(context,"What's App",Toast.LENGTH_LONG).show()
            }
            if (position == 4)
            {
                Toast.makeText(context,"YouTube",Toast.LENGTH_LONG).show()
            }
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bindItem(model: Model)
        {
            itemView.titleTv.text = model.title
            itemView.descriptionTv.text = model.des
            itemView.imageIV.setImageResource(model.image)
        }
    }

}