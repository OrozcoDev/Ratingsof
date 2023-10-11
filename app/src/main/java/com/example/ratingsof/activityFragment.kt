package com.example.ratingsof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ratingsof.databinding.ActivityFragmentBinding

class activityFragment : AppCompatActivity() {

    lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button7.setOnClickListener{

            replaceFragment(fragment1())
        }

        binding.button6.setOnClickListener{

            replaceFragment(fragment2())
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManeger = supportFragmentManager
        val fragmentTransaction = fragmentManeger.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }
}