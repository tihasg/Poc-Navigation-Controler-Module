package tihasg.navigation.controler.module2.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import tihasg.navigation.controler.module2.ui.TwoViewModel

val moduleTwo= module {
     viewModel { TwoViewModel() }
}
