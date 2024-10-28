package id.ac.polbeng.ardianto.threadexample1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import id.ac.polbeng.ardianto.threadexample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG ="MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartThread.setOnClickListener {
            startThread()
        }
    }

    private
}