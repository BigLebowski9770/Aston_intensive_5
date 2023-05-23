package com.kipreev.aston_intensive_5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class ListFragment : Fragment(R.layout.list_fragment) {

    private var listContact = mutableListOf<InfoData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setValuesForFields(view)

        val bundle = Bundle()
        val fragmentInfo = InfoFragment()


        view.findViewById<LinearLayout>(R.id.ll_one).setOnClickListener {
            bundle.putString(FIRST_NAME, listContact[0].firstName)
            bundle.putString(LAST_NAME, listContact[0].lastName)
            bundle.putString(PHONE_NUMBER, listContact[0].phoneNumber)

            fragmentInfo.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragmentInfo, InfoFragment::class.getTag())
                .addToBackStack(InfoFragment::class.getTag())
                .commit()
        }

        view.findViewById<LinearLayout>(R.id.ll_two).setOnClickListener {
            bundle.putString(FIRST_NAME, listContact[1].firstName)
            bundle.putString(LAST_NAME, listContact[1].lastName)
            bundle.putString(PHONE_NUMBER, listContact[1].phoneNumber)

            fragmentInfo.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragmentInfo, InfoFragment::class.getTag())
                .addToBackStack(InfoFragment::class.getTag())
                .commit()
        }

        view.findViewById<LinearLayout>(R.id.ll_three).setOnClickListener {
            bundle.putString(FIRST_NAME, listContact[2].firstName)
            bundle.putString(LAST_NAME, listContact[2].lastName)
            bundle.putString(PHONE_NUMBER, listContact[2].phoneNumber)

            fragmentInfo.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragmentInfo, InfoFragment::class.getTag())
                .addToBackStack(InfoFragment::class.getTag())
                .commit()
        }

    }

    init {
        listContact.apply {
            add(0, InfoData("Иванов", "Иван", "+79230345454"))
            add(1, InfoData("Сергеев", "Сергей", "+72341232233"))
            add(2, InfoData("Петров", "Пётр", "+79230354456"))
        }
    }

    private fun setValuesForFields(view: View) {
        view.findViewById<TextView>(R.id.first_name_one).text = listContact[0].firstName
        view.findViewById<TextView>(R.id.last_name_one).text = listContact[0].lastName
        view.findViewById<TextView>(R.id.phone_number_one).text = listContact[0].phoneNumber

        view.findViewById<TextView>(R.id.first_name_two).text = listContact[1].firstName
        view.findViewById<TextView>(R.id.last_name_two).text = listContact[1].lastName
        view.findViewById<TextView>(R.id.phone_number_two).text = listContact[1].phoneNumber

        view.findViewById<TextView>(R.id.first_name_three).text = listContact[2].firstName
        view.findViewById<TextView>(R.id.last_name_three).text = listContact[2].lastName
        view.findViewById<TextView>(R.id.phone_number_three).text = listContact[2].phoneNumber

    }

    companion object {
        private const val FIRST_NAME = "first name"
        private const val LAST_NAME = "last name"
        private const val PHONE_NUMBER = "phone number"
    }

}

