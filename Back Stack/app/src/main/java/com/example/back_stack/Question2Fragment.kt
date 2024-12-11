package com.example.back_stack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass.
 * Use the [Question2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Question2Fragment : Fragment() {

    val args: Question2FragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val submit: Button = view.findViewById(R.id.submit_button)
        val option: RadioGroup = view.findViewById(R.id.result_options)
        submit.setOnClickListener {
            val navController = view.findNavController()

            var count = args.count
            count += if (option.checkedRadioButtonId == R.id.option2) 1 else 0

            val action = Question2FragmentDirections.actionQuestion2FragmentToQuestion3Fragment(count)
            navController.navigate(action)
        }
    }
}