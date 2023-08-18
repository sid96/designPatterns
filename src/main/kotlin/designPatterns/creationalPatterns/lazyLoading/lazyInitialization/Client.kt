package designPatterns.creationalPatterns.lazyLoading.lazyInitialization

import designPatterns.creationalPatterns.lazyLoading.lazyInitialization.library.Student

fun main() {
    val student1 = Student("1", "abc")

    println(student1.teachers)
    println(student1.teachers)


    val student2 = Student("2", "efg")

    println(student2.subjects)
    println(student2.subjects)


    val student3 = Student("3", "hij")

    println(student3.getOptionalSubjects())
    println(student3.getOptionalSubjects())

}