package com.example.flowersapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.flowersapp.databinding.FlowerItemBinding
import com.example.flowersapp.model.Flower

class FlowersAdapter(val data: List<Flower>) : RecyclerView.Adapter<FlowersAdapter.FlowersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ViewDataBinding = DataBindingUtil.inflate(layoutInflater,R.layout.flower_item,parent,false)
        return FlowersViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return data.size
    }

    override fun onBindViewHolder(holder: FlowersViewHolder, position: Int) {
        holder.bind(data[position])
    }


    class FlowersViewHolder (val binding: ViewDataBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(data :Any){
            binding.setVariable(BR.flower,data)
            binding.executePendingBindings()
        }
    }

}