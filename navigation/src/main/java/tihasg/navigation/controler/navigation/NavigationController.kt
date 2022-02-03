package tihasg.navigation.controler.navigation


interface NavigationController {

    companion object {
        var instance : NavigationController? = null
    }

    fun module1(): ModuleOneNavigationController
    fun module2(): ModuleTwoNavigationController
}