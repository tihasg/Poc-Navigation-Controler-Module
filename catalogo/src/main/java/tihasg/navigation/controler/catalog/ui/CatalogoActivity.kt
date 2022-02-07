package tihasg.navigation.controler.catalog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_catalogo.*
import org.koin.android.ext.android.inject
import tihasg.navigation.controler.catalog.R

class CatalogoActivity : AppCompatActivity() {

    private val viewModel: CatalogoViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        button.setOnClickListener {
            viewModel.goToCatalog(this)
        }
    }
}