package com.example.mvptuto2

interface BasePresenter<T>{

    fun setView(view : T)
    fun dropView()

}