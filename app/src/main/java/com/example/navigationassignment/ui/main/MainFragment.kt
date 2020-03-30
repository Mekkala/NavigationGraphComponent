package com.example.navigationassignment.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationassignment.R
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

            TempB.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.mainToTemp)
            }

            lengthB.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.action_temp_to_lenght)
            }

        massB.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_lenght_to_mass)
        }
    }

}
