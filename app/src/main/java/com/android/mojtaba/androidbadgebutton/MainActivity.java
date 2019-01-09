package com.android.mojtaba.androidbadgebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.mojtaba_shafaei.androidToolbarBadgeButton.BadgeButton;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
final BadgeButton btn1 = findViewById(R.id.btnBadge);
final BadgeButton btn2 = findViewById(R.id.btnBadge2);
final BadgeButton btn3 = findViewById(R.id.btnBadge3);

btn1.setBadgeNum("9+");
btn1.setEnabled(false);

btn2.setBadgeNum("5");

btn3.setBadgeNum("16");
}
}
