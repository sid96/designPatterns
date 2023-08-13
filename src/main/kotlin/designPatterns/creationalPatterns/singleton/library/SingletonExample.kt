package designPatterns.creationalPatterns.singleton.library


//In Kotlin, object keyword can be used to create a singleton.
class SingletonExample private constructor() {
    companion object {

        private var instance: SingletonExample? = null
        fun getInstance(): SingletonExample {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = SingletonExample()
                    }
                }
            }

            return instance!!
        }
    }
}