package com.mertoenjosh.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertoenjosh.listview.databinding.ActivityMainBinding
import com.mertoenjosh.listview.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_user)
        val binding: ActivityUserBinding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent: Intent = this.intent

        if (intent != null) {
            val name = intent.getStringExtra(EXTRA_NAME)
            val phone = intent.getStringExtra(EXTRA_PHONE)
            val country = intent.getStringExtra(EXTRA_COUNTRY)
            val imageId = intent.getIntExtra(EXTRA_IMAGEID, R.drawable.ic_baseline_account_circle_24)

            binding.nameProfile.setText(name)
            binding.phoneProfile.setText(phone)
            binding.countryProfile.setText(country)
            binding.profileImage.setImageResource(imageId)
        }


    }
}