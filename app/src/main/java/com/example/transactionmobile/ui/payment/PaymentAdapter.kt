package com.example.transactionmobile.ui.payment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.transactionmobile.R
import com.example.transactionmobile.data.User
import kotlinx.android.synthetic.main.item_contact.view.*

class PaymentAdapter(private val users: List<User>) :
    RecyclerView.Adapter<PaymentAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(user: User){
            with(itemView){
                textView2.text = user.login
                textView3.text = user.nomeCompleto
            }
        }
    }

    //responsible to render my component
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        return ViewHolder(view)
    }

    //size item
    override fun getItemCount(): Int = users.size

    //how show in the component
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
    }
}