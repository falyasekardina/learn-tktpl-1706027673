package id.ac.ui.cs.mobileprogramming.myapp.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.myapp.data.api.ApiHelper
import id.ac.ui.cs.mobileprogramming.myapp.data.repository.MainRepository
import id.ac.ui.cs.mobileprogramming.myapp.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}