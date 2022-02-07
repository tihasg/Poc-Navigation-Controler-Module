package tihasg.navigation.controler.cart.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import tihasg.navigation.controler.cart.ui.CarrinhoViewModel

val cartModule = module {
    viewModel { CarrinhoViewModel(get()) }
}
