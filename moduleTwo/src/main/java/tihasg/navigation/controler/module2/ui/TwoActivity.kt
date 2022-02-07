package tihasg.navigation.controler.module2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_two.*
import tihasg.navigation.controler.module2.R
import tihasg.navigation.controler.navigation.NavigationController

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        button.setOnClickListener {
            NavigationController.instance?.moduleOneNavigationController()?.goToActivity(this)
        }
    }
}