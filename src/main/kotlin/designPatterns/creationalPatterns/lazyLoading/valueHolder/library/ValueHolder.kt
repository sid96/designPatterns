package designPatterns.creationalPatterns.lazyLoading.valueHolder.library

class ValueHolder<T>(private val valueSupplier: () -> T) {
    val value by lazy {
        println("Value computed")
        valueSupplier()
    }
}