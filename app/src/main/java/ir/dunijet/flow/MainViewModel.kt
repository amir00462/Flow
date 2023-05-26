package ir.dunijet.flow

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class MainViewModel(mainRepository: MainRepository) {
    val dataStudents: LiveData<StudentUi> = mainRepository.getAllFromApi()
            .map {
                StudentUi(it.id, it.name, it.familyName, it.grade)
            }
            .filter {
                it.name.endsWith("7")
            }
            .catch {
                Log.v("testFlow", it.message ?: "null message")
            }.asLiveData()


}