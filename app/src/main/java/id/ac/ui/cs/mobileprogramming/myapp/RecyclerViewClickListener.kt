package id.ac.ui.cs.mobileprogramming.myapp

import android.view.View

interface RecyclerViewClickListener {
    // method yang akan dipanggil di MainActivity
    fun onItemClicked(view: View, negara: Negara)

}