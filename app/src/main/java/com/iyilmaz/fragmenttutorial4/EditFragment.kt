package com.iyilmaz.fragmenttutorial4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.iyilmaz.fragmenttutorial4.databinding.FragmentEditBinding

class EditFragment : Fragment() {
    private var _binding: FragmentEditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEditBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_editFragment_to_veiwFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            button2.setOnClickListener {
                val direction = EditFragmentDirections.actionEditFragmentToVeiwFragment(
                    etName.text.toString(),
                    etPhone.text.toString(),
                    etEmail.text.toString(),
                    etCity.text.toString()
                )
                findNavController().navigate(direction)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
