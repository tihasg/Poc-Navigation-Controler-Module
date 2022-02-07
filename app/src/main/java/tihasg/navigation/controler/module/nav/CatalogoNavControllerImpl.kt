package tihasg.navigation.controler.module.nav

import android.content.Context
import android.content.Intent
import tihasg.navigation.controler.catalog.ui.CatalogoActivity
import tihasg.navigation.controler.navigation.CatalogoNavController

class CatalogoNavControllerImpl : CatalogoNavController() {
    override fun goToActivity(context: Context) {
        val intent = Intent(context, CatalogoActivity::class.java)
        context.startActivity(intent)
    }

}