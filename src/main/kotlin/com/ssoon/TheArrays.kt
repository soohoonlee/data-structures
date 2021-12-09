package com.ssoon

import java.util.*

fun main() {
    val colors = arrayOfNulls<String>(5)
    colors[0] = "purple"
    colors[1] = "blue"

    println("Arrays.toString(color) = " + colors.contentToString())

    println("colors[0] = " + colors[0])
    println("colors[1] = " + colors[1])
    println("colors[2] = " + colors[2])
    println("colors[3] = " + colors[3])
    println("colors[4] = " + colors[4])

    colors[2] = "yellow"
    println("Arrays.toString(color) = " + colors.contentToString())

    val numbers = intArrayOf(100, 200)

    for (i in colors.indices) {
        println("colors[" + i + "] = " + colors[i])
    }
    for (i in colors.indices.reversed()) {
        println("colors[" + i + "] = " + colors[i])
    }

    for (color in colors) {
        println("color = " + color)
    }

    colors.forEach { println(it) }
    colors.reversed().forEach { println(it) }
}
