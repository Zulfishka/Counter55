package com.example.counter55.setting

import com.example.counter55.model.Model
import com.example.counter55.presenter.Presenter

class Injector {

    companion object {
        fun fillModel() = Model()
        fun fillPresenter() = Presenter()
    }
}