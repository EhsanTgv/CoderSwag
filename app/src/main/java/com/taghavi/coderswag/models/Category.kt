package com.taghavi.coderswag.models

class Category(private val title: String, val image: String) {
    override fun toString(): String {
        return title
    }
}