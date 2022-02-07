package tihasg.navigation.controler.module.nav

import android.content.Context
import android.content.Intent
import tihasg.navigation.controler.cart.ui.CarrinhoActivity
import tihasg.navigation.controler.navigation.CarrinhoNavController

class CarrinhoNavControllerImpl : CarrinhoNavController() {
    override fun goToActivity(context: Context) {
        val intent = Intent(context, CarrinhoActivity::class.java)
        context.startActivity(intent)
    }
}