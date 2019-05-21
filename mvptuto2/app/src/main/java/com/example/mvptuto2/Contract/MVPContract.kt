package com.example.mvptuto2.Contract

import com.example.mvptuto2.BasePresenter
import com.example.mvptuto2.BaseView
import com.example.mvptuto2.Model.MVPModel

interface MVPContract {

    interface View : BaseView{
        fun updateText(msg : String)
        fun buttonClick()
    }

    interface Presenter : BasePresenter<View>{
        fun addList(name: String, num: Int)
        fun initList()
        fun getListByString(): String
    }

}