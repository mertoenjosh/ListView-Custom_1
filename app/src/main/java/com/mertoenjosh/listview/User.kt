package com.mertoenjosh.listview

class User (
    val name: String,
    val lastMessage: String,
    val lastMessageTime: String,
    val phoneNumber: String,
    val country: String,
    val imageId: Int
)

object UsersData {

    private val images = arrayListOf(
        R.drawable.mke_logo, R.drawable.ck_logo,R.drawable.sin_logo
    )

    private val names = arrayListOf(
        "Mertoenjosh", "Einstein", "SinC"
    )

    private val lastMessages = arrayListOf(
        "Lo que sera sera", "The Road not taken", "Stoic"
    )

    private val lastMessageTimes = arrayListOf(
        "05:00 pm", "6:00 pm", "2:00 pm"
    )

    private val phoneNumbers = arrayListOf(
        "254720xxx731", "254718392960", "254704909764"
    )

    private val countrys = arrayListOf(
        "Switzerland", "Australia", "Italy"
    )

    var userArrayList: ArrayList<User?>? = null
    get() {
        if (field != null)
            return field

        field = ArrayList()
        for (i in images.indices) {
            val imageId = images[i]
            val name = names[i]
            val lastMessage = lastMessages[i]
            val lastMessageTime = lastMessageTimes[i]
            val phoneNumber = phoneNumbers[i]
            val country = countrys[i]

            val user = User(name, lastMessage, lastMessageTime, phoneNumber, country, imageId)
            field!!.add(user)

        }

        return field
    }
}