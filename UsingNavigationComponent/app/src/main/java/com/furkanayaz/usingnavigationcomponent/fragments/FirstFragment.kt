package com.furkanayaz.usingnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.furkanayaz.usingnavigationcomponent.R
import com.furkanayaz.usingnavigationcomponent.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)

        binding.btnFirst.setOnClickListener {
            val id = FirstFragmentDirections.toSecond(name = "FURKAN", lastname = "AYAZ", 21, false)
            Navigation.findNavController(it).navigate(id)
        }

        return binding.root
    }
}