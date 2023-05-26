package ir.dunijet.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = MainViewModel( MainRepository() )

        viewModel.dataStudents.observe(this) {
            Log.v("testFlow" , it.name)
        }

//        lifecycleScope.launch {
//            viewModel.dataStudents.collect {
//                Log.v("testFlow" , it.name)
//            }
//        }

    }
}