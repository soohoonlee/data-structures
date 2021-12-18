package com.ssoon

import java.util.*

fun main() {
    val supermarket: Queue<Person> = LinkedList()
    supermarket.add(Person("Alex", 214))
    supermarket.add(Person("Mariam", 18))
    supermarket.add(Person("Ali", 40))

    println(supermarket.size)
    println(supermarket.peek())
    println(supermarket.poll())
    println(supermarket.size)
    println(supermarket.peek())
}

data class Person(val name: String, val age: Int)