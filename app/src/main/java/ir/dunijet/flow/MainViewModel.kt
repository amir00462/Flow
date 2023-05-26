package ir.dunijet.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel {
    val createFlow : Flow<Int> = flow {
        while (true) {
            emit(  (1000..10000).random()  )
            delay(100)
        }
    }


}