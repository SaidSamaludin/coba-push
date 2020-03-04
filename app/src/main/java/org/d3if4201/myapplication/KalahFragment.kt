package org.d3if4201.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3if4201.myapplication.databinding.FragmentKalahBinding

/**
 * A simple [Fragment] subclass.
 */
class KalahFragment : Fragment() {

    private lateinit var binding: FragmentKalahBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kalah, container, false)

        binding.btnBack.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_kalahFragment_to_soalFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}
