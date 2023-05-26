package ir.dunijet.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = MainViewModel( MainRepository() )

        lifecycleScope.launch {
                    viewModel.dataStudents
                        .flowWithLifecycle(lifecycle , Lifecycle.State.STARTED)
                        .collect {
                        Log.v("testFlow" , it.name)
                    }

        }

    }
}