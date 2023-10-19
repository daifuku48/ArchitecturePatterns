package com.danilkharytonov.architecturepatterns.builder

import android.graphics.Color

class CustomTextView private constructor(
    var text: String,
    var size: Size,
    var textColor: Int,
    var textSize: Int,
    var backgroundColor: Int
) {
    class BuilderBase : Builder<CustomTextView> {

        private var text: String = ""
        private var size = Size(0, 0)
        private var textColor = Color.rgb(0,0,0)
        private var textSize = 10
        private var backgroundColor = Color.rgb(255,255,255)

        override fun setText(text: String): Builder<CustomTextView> {
            this.text = text
            return this
        }

        override fun setSize(width: Int, height: Int): Builder<CustomTextView> {
            size = Size(width, height)
            return this
        }

        override fun setTextColor(color: Int): Builder<CustomTextView> {
            textColor = color
            return this
        }

        override fun setTextSize(size: Int): Builder<CustomTextView> {
            textSize = size
            return this
        }

        override fun setBackgroundColor(color: Int): Builder<CustomTextView> {
            backgroundColor = color
            return this
        }

        override fun build(): CustomTextView {
            return CustomTextView(
                text = text,
                size = size,
                textColor = textColor,
                textSize = textSize,
                backgroundColor = backgroundColor
            )
        }
    }
}