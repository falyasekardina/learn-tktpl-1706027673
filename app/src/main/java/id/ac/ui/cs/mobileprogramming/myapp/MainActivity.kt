package id.ac.ui.cs.mobileprogramming.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = count.toString() + " Clicks!"

        increment.setOnClickListener{
            changeNumber(count, "plus")
            textView.text = count.toString() + " Clicks!"
        }

        decrement.setOnClickListener{
            changeNumber(count, "minus")
            textView.text = count.toString() + " Clicks!"
        }
    }

    fun changeNumber(num : Int, type : String): NumResult {
        if (type == "plus") {
            count = num + 1
        }
        else {
            count = num - 1
        }
        return NumResult(count)
    }

    data class NumResult(val num : Int)
}
