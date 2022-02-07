package tihasg.navigation.controler.cart.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import tihasg.navigation.controler.navigation.CarrinhoNavController
import tihasg.navigation.controler.navigation.CatalogoNavController

class CarrinhoViewModel(private val catalogoNavController: CatalogoNavController) : ViewModel() {
    fun goToCart(context: Context) {
        catalogoNavController.goToActivity(context)
    }
}