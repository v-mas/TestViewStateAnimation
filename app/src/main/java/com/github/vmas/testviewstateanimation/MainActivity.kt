package com.github.vmas.testviewstateanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        checkbox.setOnCheckedChangeListener { view, isChecked ->
            text.isEnabled = !isChecked
        }
    }
}
