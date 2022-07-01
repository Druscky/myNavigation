package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mynavigation.databinding.FragmentInitBinding
import com.example.mynavigation.databinding.FragmentSecondBinding
import com.example.mynavigation.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private var _b: FragmentThirdBinding? = null
    private val b get() = _b!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentThirdBinding.inflate(inflater, container, false)
        return b.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnAtras3.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFragment_to_secondFragment, null)
        }
        b.btnInicio3.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFragment_to_initFragment, null)
        }
    }
}
