package com.dome.sharedelementtransition

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt_next.setOnClickListener {
            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    this@MainActivity, iv_img, ViewCompat.getTransitionName(iv_img)!!
            )
            startActivity(intent, options.toBundle())

        }
    }
}
