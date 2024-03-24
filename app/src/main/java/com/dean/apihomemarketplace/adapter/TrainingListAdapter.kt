package com.dean.apihomemarketplace.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dean.apihomemarketplace.R
import com.dean.apihomemarketplace.model.Model
import kotlinx.android.synthetic.main.item_staggered_row.view.iv_staggered_training
import kotlinx.android.synthetic.main.item_staggered_row.view.tv_address_training
import kotlinx.android.synthetic.main.item_staggered_row.view.tv_desc_training
import kotlinx.android.synthetic.main.item_staggered_row.view.tv_staggered_training

class TrainingListAdapter(private val listener:(Model)-> Unit): RecyclerView.Adapter<TrainingListAdapter.RecyclerViewHolder>() {
    private val listTraining=ArrayList<Model>()

    fun setData(items:ArrayList<Model>) {
        listTraining.clear()
        listTraining.addAll(items)
        //buat ngereload/syncronize data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_staggered_row, parent, false)
        //return RecyclerViewHolder(view)
        return RecyclerViewHolder(view)

    }


    override fun getItemCount(): Int = listTraining.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(listTraining[position], listener)
    }


    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(recyclerViewModel:Model, listener: (Model) -> Unit) {
            with(itemView){
                Glide.with(itemView.context)
                    .load(recyclerViewModel.image)
                    .apply (
                        RequestOptions()
                        .override(300))
                    .into(iv_staggered_training)

                tv_staggered_training.text = recyclerViewModel.title
                tv_address_training.text = recyclerViewModel.address
                tv_desc_training.text = recyclerViewModel.desc

                itemView.setOnClickListener { listener(recyclerViewModel) }

            }

        }

    }
}