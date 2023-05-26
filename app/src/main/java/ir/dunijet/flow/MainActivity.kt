package ir.dunijet.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = MainViewModel( MainRepository() )

        val testStateFlow = MutableStateFlow(-1)

        lifecycleScope.launch {
            testStateFlow.collect {
                Log.v("testFlow" , it.toString())
            }
        }

        testStateFlow.value = 5
        testStateFlow.value = 15
        testStateFlow.value = 7

    }
}