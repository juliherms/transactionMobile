package com.example.transactionmobile.ui.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.transactionmobile.R
import com.example.transactionmobile.data.User
import kotlinx.android.synthetic.main.fragment_payment.*
import org.koin.android.viewmodel.ext.android.viewModel

class PaymentFragment : Fragment() {

    //variable imutable
    private val dashboardViewModel: PaymentViewModel by viewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_payment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureRecyclerView()
    }

    private fun configureRecyclerView(){
        var listof = listOf(
            User(login = "juliherms", nomeCompleto = "Juliherms Vasconcelos"),
            User(login = "fred",nomeCompleto = "Fred Vasconcelos")
        )
        recyclerView.adapter = PaymentAdapter(listof)
    }
}