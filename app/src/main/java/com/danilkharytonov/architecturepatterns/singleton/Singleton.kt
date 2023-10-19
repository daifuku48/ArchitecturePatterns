package com.danilkharytonov.architecturepatterns.singleton

class Singleton<T> private constructor(private val value: T) {

    companion object {
        private var instance: Singleton<*>? = null
        fun <T> getInstance(value: T? = null): Singleton<out T?> {
            return instance as? Singleton<T> ?: Singleton(value as T).also { instance = it }
        }
    }

    fun getValue() : T{
        return value
    }
}
