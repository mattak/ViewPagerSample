package me.mattak.viewpagersample

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * CustomAdapter
 * Created by maruyama on 15/12/14.
 */
class CustomAdapter(private val context: Context) : PagerAdapter() {

    override fun getCount(): Int {
        return 10
    }

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`;
    }

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val view = TextView(context)
        view.text = "page: " + position
        collection.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup,  position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getPageTitle(position: Int) : CharSequence {
        return "page:" + position
    }
}