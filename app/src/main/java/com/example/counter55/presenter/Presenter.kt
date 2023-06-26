package com.example.counter55.presenter

import android.graphics.Color
import com.example.counter55.setting.Injector
import com.example.counter55.ui.CounterView

class Presenter {

    var model = Injector.fillModel()
    lateinit var view : CounterView

    fun increment (){
        model.increment()
        view.updateText(model.count)

    if (model.count == 10) {
        view.showToast("Congratulations!")
    }

    if (model.count == 15) {
        view.changeTextColor(Color.GREEN)
    } else {
        view.resetTextColor()
    }
}

fun decrement(){
    model.decrement()
    view.updateText(model.count)
    view.resetTextColor()
}

fun initView(view: CounterView){
    this.view = view
}
}
