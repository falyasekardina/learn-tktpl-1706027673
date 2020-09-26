package id.ac.ui.cs.mobileprogramming.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = count.toString() + " Clicks!"

        increment.setOnClickListener{
            textView.text = (++count).toString() + " Clicks!"
        }

        decrement.setOnClickListener{
            textView.text = (--count).toString() + " Clicks!"
        }
    }
}
