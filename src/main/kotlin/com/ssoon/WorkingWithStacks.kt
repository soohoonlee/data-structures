package com.ssoon

import java.util.*

fun main() {
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.peek())
    println(stack.size)
    println(stack.pop())
    println(stack.size)
    println(stack.empty())
}