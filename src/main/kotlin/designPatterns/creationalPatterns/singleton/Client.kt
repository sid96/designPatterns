package designPatterns.creationalPatterns.singleton

import designPatterns.creationalPatterns.singleton.library.SingletonExample

fun main() {

    val instance1 = SingletonExample.getInstance()
    val instance2 = SingletonExample.getInstance()
    val instance3 = SingletonExample.getInstance()

    println(instance1)
    println(instance2)
    println(instance3)
}