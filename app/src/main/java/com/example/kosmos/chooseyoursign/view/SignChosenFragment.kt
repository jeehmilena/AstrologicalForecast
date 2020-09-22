package com.example.kosmos.chooseyoursign.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kosmos.R
import com.example.kosmos.chooseyoursign.viewmodel.ChooseYourSignViewModel

class SignChosenFragment : Fragment() {

    companion object {
        fun newInstance() = SignChosenFragment()
    }

    private lateinit var viewModel: ChooseYourSignViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_chosen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChooseYourSignViewModel::class.java)
        // TODO: Use the ViewModel
    }

}