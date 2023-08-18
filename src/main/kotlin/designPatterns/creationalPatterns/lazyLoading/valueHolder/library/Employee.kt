package designPatterns.creationalPatterns.lazyLoading.valueHolder.library

data class Employee(
    val id: String,
    val name: String,
    val salary: ValueHolder<Int>
)