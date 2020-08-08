package com.example.transactionmobile.ui.component

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComponentViewModel : ViewModel() {

    val _components = MutableLiveData<Component>().also {
        it.value = itemComponent
    }

    var itemComponent = Component()
        set(value){
            field = value
            _components.value
        }
}

data class Component(
    val bottomNavigation: Boolean = false

)

