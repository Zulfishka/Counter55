package com.example.counter55.ui

interface CounterView {

        fun updateText(count:Int)
        fun showToast(message: String)
        fun changeColor(color: Int)
        fun resetColor()
    }
