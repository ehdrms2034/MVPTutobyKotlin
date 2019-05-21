package com.example.mvptuto2.View

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.mvptuto2.Contract.MVPContract
import com.example.mvptuto2.Presenter.MVPPresenter
import com.example.mvptuto2.R
import kotlinx.android.synthetic.main.activity_main.*

class MVPActivity : AppCompatActivity(),MVPContract.View, View.OnClickListener {

    private lateinit var mPresenter :MVPPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MVPPresenter()
        mPresenter.initList()

        button.setOnClickListener(this)

    }

    override fun updateText(msg: String) {
        tvData.text = msg
    }

    override fun buttonClick() {
        val msg = mPresenter.getListByString()
        Log.d("ㅁㅇㄴㄹ",msg)
        updateText(msg)
    }

    override fun onClick(v: View?) {
        when(v){
            button->{
                buttonClick()
            }
        }
    }

}