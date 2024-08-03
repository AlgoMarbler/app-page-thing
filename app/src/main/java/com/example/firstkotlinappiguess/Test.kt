package com.example.firstkotlinappiguess

class Test {
    fun main() {
        sumSimple(1, 2)
    }

    private fun sum(a: Int, b: Int) : Int {
        return a + b
    }

    private fun sumSimple(a: Int, b: Int) = a + b
    private fun printText(text: String) = println(text)
}