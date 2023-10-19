package com.danilkharytonov.architecturepatterns.singleton

import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class SingletonTest {

    @Test
    fun assertStaticVariable() {
        val result1 = Singleton.getInstance("Result1")
        val result2 = Singleton.getInstance<Any>()
        assertEquals(result1.getValue(), result2.getValue())
    }
}