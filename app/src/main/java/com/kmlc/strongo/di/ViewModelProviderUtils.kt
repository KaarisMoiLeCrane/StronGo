package com.kmlc.strongo.di

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * Fonction générique pour fournir un ViewModel avec sa Factory personnalisée.
 * Usage :
 * val vm = provideViewModel<MyViewModel> { MyViewModel.Factory(depA, depB) }
 */
@Composable
inline fun <reified VM : ViewModel> provideViewModel(
    noinline factoryBuilder: () -> ViewModelProvider.Factory
): VM {
    val factory = remember { factoryBuilder() }
    return viewModel(factory = factory)
}