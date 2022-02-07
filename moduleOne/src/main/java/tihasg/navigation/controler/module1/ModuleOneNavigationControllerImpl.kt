package tihasg.navigation.controler.module1

import android.content.Context
import android.content.Intent
import tihasg.navigation.controler.module1.ui.OneActivity
import tihasg.navigation.controler.navigation.ModuleOneNavigationController

class ModuleOneNavigationControllerImpl : ModuleOneNavigationController {
    override fun goToActivity(context: Context) {
        val intent = Intent(context, OneActivity::class.java)
        context.startActivity(intent)
    }

}