package com.safakaraca.nav_comp_odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.safakaraca.nav_comp_odev4.databinding.FragmentSayfaABinding
import com.safakaraca.nav_comp_odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var tasarim: FragmentSayfaBBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)


        tasarim.buttonBdenYgit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBdenYGecis)
        }


        return tasarim.root
    }
}