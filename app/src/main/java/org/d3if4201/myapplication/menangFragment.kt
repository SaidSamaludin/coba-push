package org.d3if4201.myapplication


import android.content.ActivityNotFoundException
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3if4201.myapplication.databinding.FragmentMenangBinding
import java.util.zip.Inflater

/**
 * A simple [Fragment] subclass.
 */
class menangFragment : Fragment() {

    private lateinit var binding: FragmentMenangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_menang, container, false)
        // Inflate the layout for this fragment
        binding.btnBack.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_menangFragment_to_utamaFragment)
        }
        binding.tvMenang.setOnClickListener {
            val shareIntent = ShareCompat.IntentBuilder.from(requireActivity())
                .setType("plain/text")
                .setText(getString(R.string.share_text))
                .intent
            try {
                startActivity(shareIntent)
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(context, "Gagal", Toast.LENGTH_LONG).show()
            }

        }
        return binding.root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.winner,menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}

