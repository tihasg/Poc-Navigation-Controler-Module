package tihasg.navigation.controler.module1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*
import org.koin.android.ext.android.inject
import tihasg.navigation.controler.module1.R
import tihasg.navigation.controler.navigation.NavigationController

class OneActivity : AppCompatActivity() {

    private val viewModel: OneViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        button.setOnClickListener {
            NavigationController.instance?.moduleTwoNavigationController()?.goToActivity(this)
        }
    }
}