package tihasg.navigation.controler.navigation


interface NavigationController {

    companion object {
        var instance : NavigationController? = null
    }

    fun moduleOneNavigationController(): ModuleOneNavigationController
    fun moduleTwoNavigationController(): ModuleTwoNavigationController
}