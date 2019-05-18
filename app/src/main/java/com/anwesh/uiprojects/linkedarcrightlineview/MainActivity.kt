package com.anwesh.uiprojects.linkedarcrightlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.arcrightlineview.ArcRightLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ArcRightLineView.create(this)
    }
}
