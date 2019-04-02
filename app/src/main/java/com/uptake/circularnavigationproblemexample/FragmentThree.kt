package com.uptake.circularnavigationproblemexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_three.view.*


class FragmentThree : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentThree_to_nav_graph))
        return view
    }
}