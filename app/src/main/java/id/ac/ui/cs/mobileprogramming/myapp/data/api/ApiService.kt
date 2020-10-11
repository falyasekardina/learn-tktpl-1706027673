package id.ac.ui.cs.mobileprogramming.myapp.data.api

import id.ac.ui.cs.mobileprogramming.myapp.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}