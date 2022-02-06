package tihasg.navigation.controler.module1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import tihasg.navigation.controler.module1.R

class OneActivity : AppCompatActivity() {

    private val viewModel: OneViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
    }
}