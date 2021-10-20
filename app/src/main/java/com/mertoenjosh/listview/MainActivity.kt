package com.mertoenjosh.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertoenjosh.listview.databinding.ActivityMainBinding
import com.mertoenjosh.listview.UsersData.userArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAdapter: ListAdapter = ListAdapter(this, userArrayList)

        binding.listView.setAdapter(listAdapter)
        binding.listView.isClickable
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val user = userArrayList!![position]
            val intent= Intent(this, UserActivity::class.java).apply {
                putExtra(EXTRA_NAME, user!!.name)
                putExtra(EXTRA_PHONE, user.phoneNumber)
                putExtra(EXTRA_COUNTRY, user.country)
                putExtra(EXTRA_IMAGEID, user.imageId)
            }
            startActivity(intent)

        }

    }
}