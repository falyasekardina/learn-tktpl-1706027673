package id.ac.ui.cs.mobileprogramming.myapp.data.repository

import id.ac.ui.cs.mobileprogramming.myapp.data.api.ApiHelper
import id.ac.ui.cs.mobileprogramming.myapp.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}