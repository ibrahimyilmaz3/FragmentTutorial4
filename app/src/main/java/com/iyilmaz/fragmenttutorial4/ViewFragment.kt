package com.iyilmaz.fragmenttutorial4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.iyilmaz.fragmenttutorial4.databinding.FragmentViewBinding


class ViewFragment : Fragment() {

    private var _binding: FragmentViewBinding? = null
    private val binding get() = _binding!!

    private val args: ViewFragmentArgs by navArgs()
    private var name = ""
    private var phone = ""
    private var email = ""
    private var city = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_veiwFragment_to_editFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name = args.name
        phone = args.phone
        email = args.email
        city = args.city

        binding.apply {
            tvName.text = name
            tvPhone.text = phone
            tvEmail.text = email
            tvCity.text = city

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}