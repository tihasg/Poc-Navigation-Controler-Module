package tihasg.navigation.controler.catalog.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import tihasg.navigation.controler.catalog.ui.CatalogoViewModel

val catalogoModule = module {
     viewModel { CatalogoViewModel(get()) }
}
