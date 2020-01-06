package com.varma.hemanshu.gridnav_kotlin

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.varma.hemanshu.gridnav_kotlin.adapters.RecyclerViewAdapter
import com.varma.hemanshu.gridnav_kotlin.databinding.ActivityMainBinding
import com.varma.hemanshu.gridnav_kotlin.models.DataSource

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var itemAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout
        toolbar = binding.toolbar
        setSupportActionBar(toolbar)
        toggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        ) {}
        toggle.isDrawerIndicatorEnabled = true
        toggle.syncState()
        drawerLayout.addDrawerListener(toggle)

        binding.recyclerView.apply {
            itemAdapter = RecyclerViewAdapter()
            adapter = itemAdapter
            val data = DataSource.data()
            itemAdapter.submitList(data)

        }
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START)
        else
            super.onBackPressed()
    }
}
