package com.uptake.circularnavigationproblemexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_two.view.*


class FragmentTwo : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentTwo_to_fragmentThree))
        return view
    }
}