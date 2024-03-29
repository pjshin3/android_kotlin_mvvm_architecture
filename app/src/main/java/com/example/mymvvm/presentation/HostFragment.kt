package com.example.mymvvm.presentation

import android.os.Bundle
import android.view.View
import com.example.mymvvm.R
import com.example.mymvvm.databinding.FragmentHostBinding
import com.example.mymvvm.presentation.viewmodele.CommonViewModel
import org.koin.android.ext.android.inject

class HostFragment : BaseFragment<FragmentHostBinding>(
    layoutRes = R.layout.fragment_host
) {
    private val viewModel by inject<CommonViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonview.setOnClickListener { viewModel.getSomeString() }
        subscribeUi()
    }

    fun subscribeUi(){
        viewModel.tmpLiveData.observe(viewLifecycleOwner){ text ->
            binding.textview.text = text
        }
    }
}