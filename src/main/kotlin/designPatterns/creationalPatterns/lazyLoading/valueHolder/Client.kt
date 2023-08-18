package designPatterns.creationalPatterns.lazyLoading.valueHolder

import designPatterns.creationalPatterns.lazyLoading.valueHolder.library.Employee
import designPatterns.creationalPatterns.lazyLoading.valueHolder.library.ValueHolder

fun main() {

    val employee1 = Employee(
        "1",
        "abc",
        ValueHolder { 1_00_000 }
    )

    val employee2 = Employee(
        "2",
        "def",
        ValueHolder { 2_00_000 }
    )


    println(employee1.name)
    println(employee1.salary.value)
    println(employee1.salary.value)

    println(employee2.salary.value)

}