package com.example.transactionmobile.ui.payment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PaymentViewModel : ViewModel() {

    init {
        //Function responsible initialize
        Log.i("init","init");
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is Payment Fragment"
    }
    val text: LiveData<String> = _text
}