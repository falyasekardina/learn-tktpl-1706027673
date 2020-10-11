package id.ac.ui.cs.mobileprogramming.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.ui.cs.mobileprogramming.myapp.layout.FragmentOne
import id.ac.ui.cs.mobileprogramming.myapp.layout.FragmentTwo


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.frame, FragmentOne())
            .commit()
    }
}
