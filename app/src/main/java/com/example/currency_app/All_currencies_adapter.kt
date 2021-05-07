package com.example.currency_app

//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.AsyncListDiffer
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//
//class All_currencies_adapter:RecyclerView.Adapter<All_currencies_adapter.viewholder>(){
//
//    class viewholder(itemView: View): RecyclerView.ViewHolder(itemView)
//
//    private val diffcallback = object :DiffUtil.ItemCallback<Rates>(){
//        override fun areItemsTheSame(oldItem: Rates, newItem: Rates): Boolean {
//            return oldItem == newItem
//        }
//
//        override fun areContentsTheSame(oldItem: Rates, newItem: Rates): Boolean {
//            return oldItem == newItem
//        }
//
//    }
//
//    val differ = AsyncListDiffer(this,diffcallback)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
//return viewholder(LayoutInflater.from(parent.context).inflate(R.layout.curency_item,parent,false))
//
//    }
//
//    override fun onBindViewHolder(holder: viewholder, position: Int) {
//val list = differ.currentList[position]
//
//    }
//
//    override fun getItemCount(): Int {
//       return differ.currentList.size
//    }
//}