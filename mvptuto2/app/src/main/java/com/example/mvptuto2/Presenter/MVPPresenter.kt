package com.example.mvptuto2.Presenter

import android.util.Log
import com.example.mvptuto2.Contract.MVPContract
import com.example.mvptuto2.Model.MVPModel

class MVPPresenter : MVPContract.Presenter{

    private var MVPView : MVPContract.View? = null
    private var list : ArrayList<MVPModel> = ArrayList()

    override fun initList(){
        addList("동글이1",1)
        addList("동글이2",2)
        addList("동글이3",3)
    }

    override fun addList(name:String, num:Int) {
        val data = MVPModel(name,num)
        list.add(data)
    }

    override fun getListByString() : String{
        var data = ""
        for(one in list){
            data += "${one.num} : ${one.name} \n"
        }
        return data
    }


    override fun setView(view: MVPContract.View) {
        MVPView = view
    }

    override fun dropView() {
        MVPView = null
    }


}