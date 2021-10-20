package com.mertoenjosh.listview

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(context: Context?, userArrayList: ArrayList<User?>?):
    ArrayAdapter<User?>(
        context!!, R.layout.list_item,
        userArrayList!!
    ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val user = getItem(position)

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val imageView = convertView!!.findViewById<ImageView>(R.id.profile_picture)
        val userName = convertView.findViewById<TextView>(R.id.userName)
        val message = convertView.findViewById<TextView>(R.id.lastMessage)
        val time = convertView.findViewById<TextView>(R.id.msgTime)

        imageView.setImageResource(user!!.imageId)
        userName.text = user.name
        message.text = user.lastMessage
        time.text = user.lastMessageTime

        return convertView
    }
}