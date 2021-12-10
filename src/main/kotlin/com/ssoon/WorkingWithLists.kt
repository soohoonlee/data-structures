package com.ssoon

fun main() {
    val colorsUnmodifiable = listOf("blue", "yellow").toMutableList()
    colorsUnmodifiable.add("pink")

    val colors = mutableListOf<String>()
    colors.add("blue")
    colors.add("purple")
    colors.add("yellow")
    println(colors.size)
    println(colors.contains("yellow"))
    println(colors.contains("pink"))
    println(colors)

    for (color in colors) {
        println(color)
    }

    colors.forEach { println(it) }

    for (i in colors.indices) {
        println(colors[i])
    }
}