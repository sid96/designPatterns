package designPatterns.creationalPatterns.abstractFactoryMethod.library

class ButtonForMac: Button {
    override fun click() {
        println("Button click for Mac")
    }
}