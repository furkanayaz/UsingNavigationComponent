package com.furkanayaz.usingnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.furkanayaz.usingnavigationcomponent.R
import com.furkanayaz.usingnavigationcomponent.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)

        binding.btnThird.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toFirst)
        }

        return binding.root
    }
}