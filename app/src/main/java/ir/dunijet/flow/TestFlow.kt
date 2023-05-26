package ir.dunijet.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = flowOf(1, 2, 3, 4, 5)

    // collect
    flow.collect { value ->
        println("Collect: $value")
        delay(1000)
    }

    // collectLatest
    flow.collectLatest { value ->
        println("CollectLatest: $value")
        delay(1000)
    }

    // collectIndexed
    flow.collectIndexed { index, value ->
        println("CollectIndexed - Index: $index, Value: $value")
    }

}