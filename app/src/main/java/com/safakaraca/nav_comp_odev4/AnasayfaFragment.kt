package com.safakaraca.nav_comp_odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.safakaraca.nav_comp_odev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)


        tasarim.buttonAnasayfadanAgit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)

        }


        tasarim.buttonAnasayfadanXgit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }

        return tasarim.root
    }
}