package ir.dunijet.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainRepository {

    fun randomStudent(): Student {
        val id = (1..10000).random()

        return Student(
            id = id,
            name = "Student$id",
            familyName = "familyName$id",
            fatherName = "father$id",
            university = "esfahan",
            grade = "grade$id",
            sitePassword = "$id && $id",
            siteUsername = "$id"
        )
    }

    fun getAllFromApi(): Flow<Student> = flow {
        while (true) {
            emit(randomStudent())
            delay(10)
        }
    }


}