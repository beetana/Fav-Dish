package com.example.favdish.utils

object Constants {

    const val DISH_TYPE: String = "DishType"
    const val DISH_CATEGORY: String = "DishCategory"
    const val DISH_COOKING_TIME: String = "DishCookingTime"

    fun dishTypes(): ArrayList<String> {
        val list = ArrayList<String>()
        list.add("朝食")
        list.add("ランチ")
        list.add("おやつ")
        list.add("ディナー")
        list.add("サラダ")
        list.add("副菜")
        list.add("デザート")
        list.add("その他")
        return list
    }

    fun dishCategories(): ArrayList<String> {
        val list = ArrayList<String>()
        list.add("ピザ")
        list.add("BBQ")
        list.add("パン")
        list.add("バーガー")
        list.add("カフェ")
        list.add("鶏肉")
        list.add("デザート")
        list.add("ドリンク")
        list.add("ホットドッグ")
        list.add("サンドイッチ")
        list.add("その他")
        list.add("ピザ")
        list.add("BBQ")
        list.add("パン")
        list.add("バーガー")
        list.add("カフェ")
        list.add("鶏肉")
        list.add("デザート")
        list.add("ドリンク")
        list.add("ホットドッグ")
        list.add("サンドイッチ")
        list.add("その他")
        return list
    }

    fun dishCookTime(): ArrayList<String> {
        val list = ArrayList<String>()
        list.add("10")
        list.add("15")
        list.add("20")
        list.add("30")
        list.add("45")
        list.add("50")
        list.add("60")
        list.add("90")
        list.add("120")
        list.add("150")
        list.add("180")
        return list
    }
}