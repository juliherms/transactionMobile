package com.example.transactionmobile.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.transactionmobile.R
import com.example.transactionmobile.data.User
import com.example.transactionmobile.data.UserAuthenticated
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //set click on button
        button.setOnClickListener{

            //set user
            UserAuthenticated.user = User("juliherms")
            goToHome()
        }
    }

    private fun goToHome(){
        val direction = LoginFragmentDirections.actionLoginFragmentToNavigationHome()
        val controller = findNavController()
        controller.navigate(direction)
    }

}