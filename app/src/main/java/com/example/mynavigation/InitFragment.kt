package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mynavigation.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    private var _b:FragmentInitBinding? = null
    private val b get() = _b!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentInitBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnFrag1.setOnClickListener ( // OJO!! Aquí son paréntesis
            Navigation.createNavigateOnClickListener(R.id.firstFragment, null)
            )
        b.btnFrag2.setOnClickListener {
            view.findNavController().navigate(R.id.action_initFragment_to_secondFragment, null)
        }
    }
}