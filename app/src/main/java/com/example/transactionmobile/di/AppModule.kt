package com.example.transactionmobile.di

import com.example.transactionmobile.ui.dashboard.DashboardViewModel
import com.example.transactionmobile.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Koin responsible to provide dependency injection in the application
 * Inject automatic viewModel
 */
val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { DashboardViewModel() }
}