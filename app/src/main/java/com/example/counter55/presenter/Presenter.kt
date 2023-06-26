package com.example.counter55.presenter

import com.example.counter55.setting.Injector
import com.example.counter55.ui.CounterView

class Presenter {

    var model = Injector.fillModel()
    lateinit var view : CounterView

    fun increment (){
        model.increment()
        view.updateText(model.count)
    }

    fun init(view: CounterView) {
        this.view = view
    }

    fun decrement (){
        model.decrement()
        view.updateText(model.count)
    }
}