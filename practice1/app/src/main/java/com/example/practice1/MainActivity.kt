package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice1.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val textList = listOf("뷰A","뷰B","뷰C","뷰D")
        val customAdapter = CustomPagerAdapter()
        customAdapter.textList = textList
        binding.viewPager.adapter = customAdapter
        val tabTitles = listOf("View A","View B","View C","View D")
        TabLayoutMediator(binding.tabLayout, binding.viewPager){tab,position ->
            tab.text = tabTitles[position]
        }.attach()

    }
}