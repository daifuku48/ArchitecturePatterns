package com.danilkharytonov.architecturepatterns.builder

import android.graphics.Color

interface Builder<T> {
    fun setText(text: String): Builder<T>
    fun setSize(width: Int, height: Int): Builder<T>
    fun setTextColor(color: Int): Builder<T>
    fun setTextSize(size: Int): Builder<T>
    fun setBackgroundColor(color: Int): Builder<T>
    fun build(): T
}