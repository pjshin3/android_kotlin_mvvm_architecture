package com.example.mymvvm

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.example.mymvvm.databinding.FragmentHostBinding
import com.example.mymvvm.viewmodele.CommonViewModel
import org.koin.android.ext.android.inject

class HostFragment : BaseFragment<FragmentHostBinding>(
    layoutRes = R.layout.fragment_host
) {
    private val viewmodel by inject<CommonViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonview.setOnClickListener { viewmodel.getApiSomeText() }
        subscribeUi()
    }

    fun subscribeUi(){
        viewmodel.tmpLiveData.observe(viewLifecycleOwner){
            binding.textview.text = it
        }
    }
}