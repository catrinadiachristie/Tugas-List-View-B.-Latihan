package com.uty.listviewicon.model

import com.uty.listviewicon.R

object DataBahasa {
    private val namabahasa = arrayOf(
        "Ruby",
        "Rails",
        "Pyhton",
        "Java Script",
        "PHP")

    private val informasibahasa = arrayOf(
        "Ruby is an open-source and fully onject-oriented programming languages",
        "Ruby on Rails is a server-side web application development framework written in Ruby language",
        "Pyhton is interpreted scripting and object-oriented programming language",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language, i.e., there is no need for compilation")

    private val gambarbahasa = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.pyhton,
        R.drawable.javascript,
        R.drawable.php)

    val urutanbahasa: ArrayList<Bahasa>
    get() {
        val list = arrayListOf<Bahasa>()
        for (position in namabahasa.indices) {
            val bahasa = Bahasa()
            bahasa.nama = namabahasa[position]
            bahasa.info = informasibahasa[position]
            bahasa.gambar = gambarbahasa[position]
            list.add(bahasa)
        }
        return list
    }
}