package com.example.mymvvm

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mymvvm.databinding.FragmentHostBinding
import com.example.mymvvm.viewmodele.CommonViewModel
import org.koin.android.ext.android.inject

class HostFragment : Fragment() {

    private lateinit var binding : FragmentHostBinding
    private val viewmdoel by inject<CommonViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHostBinding.inflate(inflater, container, false)
        binding.textview.setOnClickListener { Log.e("philip","${viewmdoel.textChange()}") }

        return binding.root
    }
}