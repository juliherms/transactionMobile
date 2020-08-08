package com.example.transactionmobile.ui.adjustments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdjustmentsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is adjustments Fragment"
    }
    val text: LiveData<String> = _text
}