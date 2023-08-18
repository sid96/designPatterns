package designPatterns.creationalPatterns.lazyLoading.kotlin.library

class HeavyLibraryClass {

    init {
        heavyInitialization()
    }
    private fun heavyInitialization() {
        println("Perform heavy initialization")
    }

    fun callLibraryFunction1() {
        println("Heavy library function 1 called!")
    }

    fun callLibraryFunction2() {
        println("Heavy library function 2 called!")
    }
}