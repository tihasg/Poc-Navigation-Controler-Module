package tihasg.navigation.controler.cart.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_carrinho.*
import org.koin.android.ext.android.inject
import tihasg.navigation.controler.cart.R

class CarrinhoActivity : AppCompatActivity() {
    private val viewModel: CarrinhoViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrinho)

        button.setOnClickListener {
            viewModel.goToCart(this)
        }
    }
}