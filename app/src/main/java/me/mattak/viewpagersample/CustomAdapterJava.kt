package me.mattak.viewpagersample

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

/**
 * CustomAdapterJava
 * Created by maruyama on 15/12/14.
 */
class CustomAdapterJava : PagerAdapter() {
    override fun getCount(): Int {
        return 10
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return false
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }
}