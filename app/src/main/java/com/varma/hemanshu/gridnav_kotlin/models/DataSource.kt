package com.varma.hemanshu.gridnav_kotlin.models

class DataSource {
    companion object {
        fun data(): ArrayList<ItemModel> {
            val items = ArrayList<ItemModel>()
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 1"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 2"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 3"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 4"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 5"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 6"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 7"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 8"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 9"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 10"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 11"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 12"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 13"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 14"))
            items.add(ItemModel(android.R.drawable.btn_star_big_on, "Item 15"))

            return items
        }
    }
}