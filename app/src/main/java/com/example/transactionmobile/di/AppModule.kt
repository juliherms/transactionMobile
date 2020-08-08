package com.example.transactionmobile.di

import com.example.transactionmobile.ui.component.ComponentViewModel
import com.example.transactionmobile.ui.payment.PaymentViewModel
import com.example.transactionmobile.ui.home.HomeViewModel
import com.example.transactionmobile.ui.adjustments.AdjustmentsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Koin responsible to provide dependency injection in the application
 * Inject automatic viewModel
 */
val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { PaymentViewModel() }
    viewModel { AdjustmentsViewModel() }
    viewModel { ComponentViewModel() }

}