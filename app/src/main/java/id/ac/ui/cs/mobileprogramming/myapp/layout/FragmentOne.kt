package id.ac.ui.cs.mobileprogramming.myapp.layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.myapp.R
import id.ac.ui.cs.mobileprogramming.myapp.view.SharedViewModel
import kotlinx.android.synthetic.main.fragment_one.*
import org.jetbrains.annotations.Nullable


class FragmentOne : Fragment() {
    private var viewModel: SharedViewModel? = null

    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_one, container, false)
        val button: Button = v.findViewById(R.id.btnSend)
        button.setOnClickListener(View.OnClickListener {
            viewModel!!.setText(editText.getText())
            val transaction = this.parentFragmentManager.beginTransaction()
            val fragmentTwo = FragmentTwo()
            transaction.replace(R.id.frame, fragmentTwo)
            transaction.addToBackStack(null)
            transaction.commit()
        })
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(activity!!).get(SharedViewModel::class.java)
        viewModel.getText().observe(
            viewLifecycleOwner,
            Observer { charSequence -> editText!!.setText(charSequence) })
    }
}