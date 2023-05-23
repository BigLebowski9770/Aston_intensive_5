package com.kipreev.aston_intensive_5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class InfoFragment : Fragment(R.layout.info_fragment) {

    private val TAG = "INFO FRAG"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = this.arguments

        view.findViewById<TextView>(R.id.first_name).setText(args?. getString("first name").toString())
        view.findViewById<EditText>(R.id.last_name).setText(args?. getString("last name").toString())
        view.findViewById<EditText>(R.id.phone_number).setText(args?. getString("phone number").toString())



        view.findViewById<Button>(R.id.button_save).setOnClickListener{

        }
    }


    companion object {

        private const val CORRECTED_F_NAME = "corrected fname"
        private const val CORRECTED_L_NAME = "corrected lname"
        private const val CORRECTED_PHONE_NUMBER = "corrected pnumber"

        private const val TAG = "INFO FRAG"

        fun getInstance(value: String): InfoFragment {
            return InfoFragment().apply {
                arguments = bundleOf("KEY" to value)
            }
        }
    }
}
