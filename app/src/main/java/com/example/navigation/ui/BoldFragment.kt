package com.example.navigation.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.MainActivity
import com.example.navigation.R
import com.example.navigation.databinding.FragmentBoldBinding

class BoldFragment : Fragment() {

    private var _binding: FragmentBoldBinding? = null
    private lateinit var _main: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        _main = requireActivity() as MainActivity
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentBoldBinding.inflate(inflater, container, false)
        _binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.boldFragment = this
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun showBold1() {
        findNavController().navigate(R.id.action_fragmentBold_to_bold1Fragment)
    }

    fun showBold2() {
        findNavController().navigate(R.id.action_fragmentBold_to_bold2Fragment)
    }

    fun showItalic() {
        _main.binding.bottomNavigationView.selectedItemId = R.id.fragmentItalic
    }

}