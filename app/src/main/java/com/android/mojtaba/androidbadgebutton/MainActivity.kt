package com.android.mojtaba.androidbadgebutton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    btn_badge1.setIcon(R.drawable.ic_phone_white_24dp)

    btn_badge1.setBadgeNum("9+")
    btn_badge1.isEnabled = false

    btnBadge2?.setBadgeNum("5")
    btnBadge3.setBadgeNum("16")
  }
}
