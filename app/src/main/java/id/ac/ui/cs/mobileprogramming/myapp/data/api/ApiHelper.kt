package id.ac.ui.cs.mobileprogramming.myapp.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}