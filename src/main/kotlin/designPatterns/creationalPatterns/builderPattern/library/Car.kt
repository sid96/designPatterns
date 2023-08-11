package designPatterns.creationalPatterns.builderPattern.library

class Car private constructor(
    builder: Car.Builder
) {

    var engine: String? = null
        private set
    var wheels: String? = null
        private set
    var mirrors: String? = null
        private set

    init {
        engine = builder.engine
        wheels = builder.wheels
        mirrors = builder.mirrors
    }

    class Builder {

        var engine: String? = null
            private set
        var wheels: String? = null
            private set
        var mirrors: String? = null
            private set

        fun engine(engine: String): Builder {
            this.engine = engine
            return this
        }

        fun wheels(wheels: String): Builder {
            this.wheels = wheels
            return this
        }

        fun mirrors(mirrors: String): Builder {
            this.mirrors = mirrors
            return this
        }

        fun build() = Car(this)
    }

}