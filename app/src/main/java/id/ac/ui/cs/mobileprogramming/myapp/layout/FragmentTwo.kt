package id.ac.ui.cs.mobileprogramming.myapp.layout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.myapp.R
import id.ac.ui.cs.mobileprogramming.myapp.view.SharedViewModel
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo : Fragment() {
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_two, container, false)
        viewModel = ViewModelProvider(activity!!).get(SharedViewModel::class.java)
        viewModel.getText().observe(
            viewLifecycleOwner,
            Observer { charSequence -> outPutTextView!!.text = charSequence })
        return v
    }
}