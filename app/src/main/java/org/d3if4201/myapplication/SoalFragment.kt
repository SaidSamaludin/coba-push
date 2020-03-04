package org.d3if4201.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_soal.*
import org.d3if4201.myapplication.databinding.FragmentSoalBinding

/**
 * A simple [Fragment] subclass.
 */
class SoalFragment : Fragment() {

    private lateinit var binding: FragmentSoalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_soal, container, false)

        binding.btnSubmit.setOnClickListener {
            val check = radioGroup.checkedRadioButtonId
            var index = 0
            when(check) {
                R.id.rbDice1 -> index=1
                R.id.rbDice2 -> index=2
                R.id.rbDice3 -> index=3
                R.id.rbDice4 -> index=4
            }
            if (index == 2 || index == 3 || index == 4){
                view?.findNavController()?.navigate(R.id.action_soalFragment_to_kalahFragment)
            }
            else{
                view?.findNavController()?.navigate(R.id.action_soalFragment_to_menangFragment)
            }
        }

        // Inflate the layout for this fragment
        return binding.root
    }
}
