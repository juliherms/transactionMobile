package com.example.transactionmobile.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.transactionmobile.R
import com.example.transactionmobile.data.UserAuthenticated
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    //dependency injection
    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view,savedInstanceState)

        if(UserAuthenticated.isUserNotAuthenticated()){
            goToLogin()
        }
    }

    private fun goToLogin(){
        //redirect to login screen
        val dir = HomeFragmentDirections.actionGlobalLoginFragment() //global method
        val controller = findNavController()
        controller.navigate(dir)
    }
}