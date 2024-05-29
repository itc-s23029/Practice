package jp.ac.it_college.std.s23029.practice.chap2

fun main() {
    println("----2.10.2----")
    run {
        val list = listOf(1, 2, 3, 4)
        list.forEach { num -> println(num) }
    }
    println("----2.10.3----")
    run {
        val list = listOf(1, 2, 3, 4)
        list.forEach { println(it) }
    }

    println("----2.10.4----")
    run {
        val list = listOf(1, 2, 3, 4)
        val idList = list.map { it * 10 }
        idList.forEach { println(it) }
    }

    println("----2.10.5----")
    run {
        val users = listOf(
            User2(1, 100, "Takehata"),
            User2(2, 100, "Kotlin"),
        )
        val idList = users.map { it.id }
        idList.forEach { println(it) }
    }

    println("----2.10.6----")
    run {
        val user = listOf(
            User2(1, 100, "Takehata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
        )
        val filteredList = user.filter { it.teamId == 100 }
        filteredList.forEach {
            println(it)
        }
    }

    println("----2.10.7----")
    run {
        val user = listOf(
            User2(1, 100, "Takehata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy"),
        )
        println(user.first{ it.teamId ==200 })
        println(user.last{ it.teamId == 100 })
    }

    println("----2.10.9----")
    run {
        val user = listOf(
            User2(1, 100, "Takehata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy"),
        )
        println(user.firstOrNull{ it.teamId ==200 })
        println(user.lastOrNull{ it.teamId == 100 })
        println(user.firstOrNull{ it.teamId == 1000 })
        println(user.lastOrNull{ it.teamId == 2000 })
    }

    println("----2.10.10----")
    run {
        val list = listOf(1, 1, 2, 3, 4, 4, 5)
        val distinctList = list.distinct()
        distinctList.forEach (::println)
    }

    println("----2.10.11----")
    run {
        val users = listOf(
            User2(1, 100, "Takehara"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
        )
        val userMap = users.associateBy(User2::id)
        println(userMap)
    }

    println("----2.10.11+1----")
    run {
        val students = listOf(
            Student("s30001","Kuriyama"),
            Student("s30002","Oohira"),
            Student("s30003","Tokunaga"),
            Student("s30004","Kawase"),
            Student("s30005","Kameda"),
        )
        students.forEach(::println)
        //学籍番号をキーとしてMap型に変換
        val studentMap = students.associateBy(Student::id)
        studentMap.forEach(::println)
    }

    println("----2.10.12----")
    run {
        val list = listOf("Takehata", "Kotlin", "Java")
        val map = list.associateWith(String::length)
        println(map)
        map.forEach(::println)
    }

    println("----2.10.13---")
    run {
        val list = listOf(
            User2(1, 100, "Takehata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy"),
        )
        val map = list.groupBy(User2::teamId)
        println(map)
        println(map[100])
        println(map[200])
    }

    println("----2.10.14---")
    run {
        val list = listOf(1, 2, 3, 4, 5)
        val oddNumberCount = list.count{ it % 2 == 1 }
        println(oddNumberCount)
    }

    println("----2.10.15----")
    run {
        val list = listOf(
            "Takehata",
            "Kotlin",
            "Java",
            "Groovy",
            "Scala",
        )
        val chunkedList = list.chunked(2)
        println(chunkedList)
        chunkedList.forEach(::println)
    }

    println("----2.10.16----")
    run {
        val list = listOf(1, 2, 3, 4, 5)
        val result = list.reduce{ sum, value ->
            println("$sum + $value")
            sum + value
        }
        println(result)
    }

    println("----2.10.17----")
    run {
        val list = listOf(1, 2, 3, 4, 5)
        val result = list.reduce{ sum, value -> sum * value }
        println(result)
    }
}