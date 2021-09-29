package com.example.rvinclass

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_my_adapter.view.*

class myAdapter(val context: Context, val input:ArrayList<String>) : RecyclerView.Adapter<myAdapter.itemViewHolder>() {

    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        //take ont data and add it to textview up
        val message = input[position]

        holder.itemView.apply {

            tv1.text = message


        }}

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
            return itemViewHolder(

                LayoutInflater.from(context).inflate(
                    R.layout.activity_my_adapter,
                    parent,
                    false
                )
            )
        }

        override fun getItemCount() = input.size





}