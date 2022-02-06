package tihasg.navigation.controler.module1.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import tihasg.navigation.controler.module1.ui.OneViewModel

val moduleOne = module {
     viewModel { OneViewModel() }
}
