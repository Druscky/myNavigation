package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.mynavigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _b: FragmentSecondBinding? = null
    private val b get() = _b!!
    private val args: SecondFragmentArgs by navArgs()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _b = FragmentSecondBinding.inflate(inflater, container, false)
            return b.root
        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnAtras2.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_initFragment, null)
        }
        b.btnSiguiente2.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment, null)
        }
       b.tvContador2.text = args.variable1.toString()
    }
}
