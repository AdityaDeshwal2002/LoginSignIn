package com.asn8.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.asn8.myapplication.databinding.FragmentSignBinding

class SignFragment : Fragment() {
    private var _binding: FragmentSignBinding? = null
    private val binding get() = _binding!!
    lateinit var userName: String
    lateinit var userPassowrd: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signButton.setOnClickListener {
            userName = binding.tvUserName.text.toString()
            userPassowrd = binding.eTPassowrd.text.toString()
            Toast.makeText(context, "Sign SuccessFull", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}