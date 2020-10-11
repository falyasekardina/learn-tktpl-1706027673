package id.ac.ui.cs.mobileprogramming.myapp.layout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo : Fragment() {
    var inputText: String? = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_two, container, false)
        inputText = arguments?.getString("inputText")
        rootView.outPutTextView.text = inputText
        return rootView
    }
}