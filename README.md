# Poc-Navigation-Controler-Module
Essa Poc e para fazer a simulação de navegação entre modulos, com injeção de depedencia.

criar classe abstract dentro do module navigation ->

 abstract class CarrinhoNavController {
    abstract fun goToActivity(context: Context)
}

criar implementação dentro do module que deseja usar -> 

class CarrinhoNavControllerImpl : CarrinhoNavController() {
    override fun goToActivity(context: Context) {
        val intent = Intent(context, CarrinhoActivity::class.java)
        context.startActivity(intent)
    }
}


implementar isso na Application com o koin -> 

   factory<CarrinhoNavController> {
        CarrinhoNavControllerImpl()
    }
    factory<CatalogoNavController> {
        CatalogoNavControllerImpl()
   }
   
   
   Agora so injeta na view model ou view e utilizar:
 
   class CarrinhoViewModel(private val catalogoNavController: CatalogoNavController) : ViewModel() {
    fun goToCart(context: Context) {
        catalogoNavController.goToActivity(context)
    }
}
    
    
