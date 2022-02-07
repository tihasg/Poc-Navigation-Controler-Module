package tihasg.navigation.controler.catalog.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import tihasg.navigation.controler.navigation.CarrinhoNavController

class CatalogoViewModel(private val cartNavController: CarrinhoNavController) : ViewModel() {
    fun goToCatalog(context: Context) {
        cartNavController.goToActivity(context)
    }
}