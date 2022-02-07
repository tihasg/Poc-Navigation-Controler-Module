package tihasg.navigation.controler.module2

import android.content.Context
import android.content.Intent
import tihasg.navigation.controler.module2.ui.TwoActivity
import tihasg.navigation.controler.navigation.ModuleTwoNavigationController

class ModuleTwoNavigationControllerImpl : ModuleTwoNavigationController {
    override fun goToActivity(context: Context) {
        val intent = Intent(context, TwoActivity::class.java)
        context.startActivity(intent)
    }

}