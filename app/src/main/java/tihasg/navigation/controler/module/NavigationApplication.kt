package tihasg.navigation.controler.module

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import tihasg.navigation.controler.module1.ModuleOneNavigationControllerImpl
import tihasg.navigation.controler.module1.di.moduleOne
import tihasg.navigation.controler.module2.ModuleTwoNavigationControllerImpl
import tihasg.navigation.controler.module2.di.moduleTwo
import tihasg.navigation.controler.navigation.ModuleOneNavigationController
import tihasg.navigation.controler.navigation.ModuleTwoNavigationController
import tihasg.navigation.controler.navigation.NavigationController
import tihasg.navigation.controler.navigation.moduleNavigation

class NavigationApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
        setupNavigationController()
    }

    class NavigationControllerImpl : NavigationController {
        override fun module1(): ModuleOneNavigationController {
         return  ModuleOneNavigationControllerImpl()
        }

        override fun module2(): ModuleTwoNavigationController {
            return  ModuleTwoNavigationControllerImpl()
        }


    }

    private fun setupNavigationController() {
        NavigationController.instance = NavigationControllerImpl()
    }
    private fun setupKoin() {
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@NavigationApplication)
            androidFileProperties()
            modules(
                moduleOne,
                moduleTwo,
                moduleNavigation
            )
        }
    }
}
