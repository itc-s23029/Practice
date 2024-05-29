package jp.ac.it_college.std.s23029.practice.chap2

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("----2.7.1----")
    val list = mutableListOf<Int>()
    for (i in 1 .. 10) {
        if (i % 2 == 1) {
            list.add(i)
        }
    }
    val oddNumbers = list.joinToString(" ")
    println(oddNumbers)

    println("----2.7.2--2.7.3----")
    val oddNumbers2 = with(mutableListOf<Int>()) {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(oddNumbers2)

    println("----2.7.4----")
    val oddNumbers3 = mutableListOf<Int>().run {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(oddNumbers3)

    println("----2.7.おまけ1----")
    randomGenerateObject()?.run {
        println("1回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
    randomGenerateObject()?.run {
        println("2回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
    randomGenerateObject()?.run {
        println("3回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
    randomGenerateObject()?.run {
        println("4回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }

    println("----2.7.6----")
    val oddNumbers6 = mutableListOf<Int>().let { list ->
        for (i in 1 ..10) {
            if (i % 2 == 1) {
                list.add(i)
            }
        }
        list.joinToString(separator = " ")
    }
    println(oddNumbers6)

    println("----2.7.7--2.7.8-----")
    println(createUser("Takehata"))
    println(createUser(null))

    println("----2.7.11----")
    val addNumbers11 = mutableListOf<Int>().apply {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(separator = " ")
    }
    println(addNumbers11)

    println("----2.7.12--2.7.13----")
    updateUser(100, "Kotlin", "Nagoya")
}

fun randomGenerateObject(): Int? {
    return if (Random.nextBoolean()) Random.nextInt(1 ..10) else null
}