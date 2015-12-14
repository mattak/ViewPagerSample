package me.mattak.viewpagersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import butterknife.bindView

class MainActivity : AppCompatActivity() {
    val pagerView: ViewPager by bindView(R.id.pager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerView.adapter = CustomAdapter(this)
    }
}