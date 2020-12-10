package com.example.newproject.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.newproject.R

class NotificatinonFragment :Fragment(R.layout.fragment_notification){
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)
        textView.text = NotificatinonFragmentArgs.fromBundle(requireArguments()).number.toString()

    }


}