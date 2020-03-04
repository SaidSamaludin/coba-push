package org.d3if4201.myapplication


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4201.myapplication.databinding.FragmentUtamaBinding

/**
 * A simple [Fragment] subclass.
 */
class UtamaFragment : Fragment() {

    private lateinit var binding: FragmentUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_utama,container,false)

        binding.btnplay.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_utamaFragment_to_soalFragment)
        }
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())||super.onOptionsItemSelected(item)
    }


}
