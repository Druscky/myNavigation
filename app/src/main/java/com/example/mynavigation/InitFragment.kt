package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mynavigation.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    private var _b:FragmentInitBinding? = null
    private val b get() = _b!!

    var cont  = 0

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

//        b.btnFrag2.setOnClickListener {
//            view.findNavController().navigate(R.id.action_initFragment_to_secondFragment, null)
//        }
        b.tvContadorInit.setOnClickListener {
            cont++
            b.tvContadorInit.text = cont.toString()
        }
        b.btnFrag1.setOnClickListener {
            val bundle = bundleOf("Contador" to cont.toString())
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment, bundle)
        }
        b.btnFrag2.setOnClickListener {
            val action = InitFragmentDirections.actionInitFragmentToSecondFragment(cont) //<- Este cont, lo saco de los Atributos de nav_graph.xml
            view.findNavController().navigate(action)                               // El que aconseja Google
        }
    }
}



