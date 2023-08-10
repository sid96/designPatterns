package designPatterns.creationalPatterns.abstractFactoryMethod.library

class FactoryProvider {

    companion object {
        fun getFactory(type: FactoryType): Factory {
            return when(type) {
                FactoryType.Windows -> WindowsViewFactory()
                FactoryType.Mac -> MacViewFactory()
            }
        }
    }
}