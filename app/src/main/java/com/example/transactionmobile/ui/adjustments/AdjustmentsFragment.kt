package com.example.transactionmobile.ui.adjustments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.transactionmobile.R
import org.koin.android.viewmodel.ext.android.viewModel

class AdjustmentsFragment : Fragment() {

    private val notificationsViewModel: AdjustmentsViewModel by viewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_adjustments, container, false)
        val textView: TextView = root.findViewById(R.id.text_adjustments)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}