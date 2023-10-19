package com.danilkharytonov.architecturepatterns.singleton

class Singleton private constructor(var value: String) {

    companion object {
        private var instance: Singleton? = null
        fun getInstance(value: String): Singleton? {
            if (instance == null) {
                synchronized(Singleton::class){
                    if (instance == null){
                        instance = Singleton(value)
                    }
                }
            }
            return instance
        }
    }
}