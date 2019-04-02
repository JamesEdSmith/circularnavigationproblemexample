package com.uptake.circularnavigationproblemexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_one.view.*


class FragmentOne : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        view.button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentOne_to_sub_nav_graph))
        return view
    }
}