package designPatterns.creationalPatterns.lazyLoading.kotlin

import designPatterns.creationalPatterns.lazyLoading.kotlin.library.HeavyLibraryClass


fun main() {

    val heavyLibraryInstance by lazy { HeavyLibraryClass() }

    println("Perform client function 1")
    println("Perform client function 2")
    println("Perform client function 3")
    println("Perform client function 4")


    heavyLibraryInstance.callLibraryFunction1()

    heavyLibraryInstance.callLibraryFunction2()
}