package com.example.aviatickets.activity

import OfferListFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aviatickets.R
import com.example.aviatickets.adapter.OfferListAdapter
import com.example.aviatickets.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter: OfferListAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, OfferListFragment())
            .commit()

    }

}