package id.ac.ui.cs.mobileprogramming.myapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var START_MILLI_SECONDS = 60000L

    lateinit var countdown_timer: CountDownTimer
    var isRunning: Boolean = false;
    var time_in_milli_seconds = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            if (isRunning) {
                stopTimer()
            } else {
                val time  = time_edit_text.text.toString()
                if (time.isEmpty()) {
                    val dialogBuilder = AlertDialog.Builder(this)
                    dialogBuilder.setMessage("Masukkan input berupa jumlah menit")
                        // if the dialog is cancelable
                        .setCancelable(false)
                        // negative button text and action
                        .setNegativeButton("Oke", DialogInterface.OnClickListener {
                                dialog, id -> dialog.cancel()
                        })
                    val alert = dialogBuilder.create()
                    alert.show()
                } else {
                    time_in_milli_seconds = time.toLong() *60000L
                    startTimer(time_in_milli_seconds)
                }
            }
        }

        reset.setOnClickListener {
            resetTimer()
        }
    }

    override fun onBackPressed() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage("Apakah Anda yakin ingin keluar?")
            // if the dialog is cancelable
            .setCancelable(false)
            // negative button text and action
            .setNegativeButton("Tidak", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
            .setPositiveButton("Ya", DialogInterface.OnClickListener {
                    dialog, id -> finish()
            })
        val alert = dialogBuilder.create()
        alert.setTitle("Tutup Aplikasi")
        alert.show()
    }

    private fun stopTimer() {

        button.text = "Start"
        countdown_timer.cancel()
        isRunning = false
        reset.visibility = View.VISIBLE
    }

    private fun startTimer(time_in_seconds: Long) {
        countdown_timer = object : CountDownTimer(time_in_seconds, 1000) {
            override fun onFinish() {
            }

            override fun onTick(p0: Long) {
                time_in_milli_seconds = p0
                updateTextUI()
            }
        }
        countdown_timer.start()

        isRunning = true
        button.text = "Stop"
        reset.visibility = View.INVISIBLE

    }

    private fun resetTimer() {
        time_in_milli_seconds = START_MILLI_SECONDS
        updateTextUI()
        reset.visibility = View.INVISIBLE
    }

    private fun updateTextUI() {
        val minute = (time_in_milli_seconds / 1000) / 60
        val seconds = (time_in_milli_seconds / 1000) % 60

        timer.text = "$minute:$seconds"
    }
}
