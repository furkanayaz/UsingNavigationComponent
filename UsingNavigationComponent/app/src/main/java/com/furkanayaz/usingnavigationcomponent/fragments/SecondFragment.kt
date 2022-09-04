package com.furkanayaz.usingnavigationcomponent.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.furkanayaz.usingnavigationcomponent.R
import com.furkanayaz.usingnavigationcomponent.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)

        val bundle: SecondFragmentArgs by navArgs()

        Log.e("NAME", bundle.name)
        Log.e("LASTNAME", bundle.lastname)
        Log.e("AGE", bundle.age.toString())
        Log.e("IS SINGLE", bundle.isSingle.toString())

        binding.btnSecond.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toThird)
        }

        return binding.root
    }
}