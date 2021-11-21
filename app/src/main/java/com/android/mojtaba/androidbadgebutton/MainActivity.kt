package com.android.mojtaba.androidbadgebutton

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.mojtaba.androidbadgebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

//    btn_badge1.setIcon(R.drawable.ic_phone_white_24dp)

    binding.btnBadge1.setBadgeNum("9+")
    binding.btnBadge1.isEnabled = false

    binding.btnBadge2.setBadgeNum("5")
    binding.btnBadge3.setBadgeNum("8")

    binding.btnBadge3.setOnClickListener{
      binding.btnBadge3.setBadgeTextColor(Color.RED)
      binding.btnBadge3.setBadgeBackgroundColor(Color.TRANSPARENT)
    }
  }
}
