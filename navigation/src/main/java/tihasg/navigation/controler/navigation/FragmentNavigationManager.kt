package tihasg.navigation.controler.navigation

import android.webkit.WebView
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object FragmentNavigationManager {
    private const val fragmentTagPrefix = "via_"
    fun attachFragment(
        manager: FragmentManager,
        container: Int,
        fragment: Fragment,
        @IdRes menuItemId: Int
    ) = with(manager) {
        val tag = fragmentTagPrefix + menuItemId
        findFragmentByTag(tag)?.let {
            beginTransaction().apply {
                remove(it)
                commit()
            }
        }
        beginTransaction().apply {
            add(container, fragment, tag)
            addToBackStack(tag)
            commit()
        }
    }
    fun findSelectedTag(manager: FragmentManager): Int = with(manager) {
        fragments.findLast(filterViaFragments())?.tag
            ?.removePrefix(fragmentTagPrefix)?.toIntOrNull() ?: 0
    }

    fun fragmentsCount(manager: FragmentManager): Int = with(manager) {
        fragments.filter(filterViaFragments()).size
    }

    private fun filterViaFragments(): (Fragment) -> Boolean = {
        it.tag?.contains(fragmentTagPrefix) ?: false
    }

    fun findWebView(manager: FragmentManager): WebView? = with(manager) {
        val webViewTag = "webViewFragment"
        var fragment: Fragment? = null
        fragments.forEach {
            fragment = if(it?.tag == webViewTag) it
            else it?.childFragmentManager?.findFragmentByTag(webViewTag)
        }
        return fragment?.view as WebView?
    }

    fun clearBackStack(manager: FragmentManager) = with(manager) {
        for (i in 0 until backStackEntryCount) {
            popBackStack()
        }
    }
}