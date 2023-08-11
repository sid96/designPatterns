package designPatterns.creationalPatterns.abstractFactoryMethod.library

class ButtonForWindows: Button {
    override fun click() {
        println("Button click for Windows")
    }
}