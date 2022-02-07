package tihasg.navigation.controler.module

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module
import tihasg.navigation.controler.module.nav.CarrinhoNavControllerImpl
import tihasg.navigation.controler.cart.di.cartModule
import tihasg.navigation.controler.module.nav.CatalogoNavControllerImpl
import tihasg.navigation.controler.catalog.di.catalogoModule
import tihasg.navigation.controler.navigation.CarrinhoNavController
import tihasg.navigation.controler.navigation.CatalogoNavController

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@AppApplication)
            androidFileProperties()
            modules(
                appModule,
                catalogoModule,
                cartModule
            )
        }
    }
}

val appModule = module {
    factory<CarrinhoNavController> {
        CarrinhoNavControllerImpl()
    }
    factory<CatalogoNavController> {
        CatalogoNavControllerImpl()
    }
}