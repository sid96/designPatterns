package designPatterns.creationalPatterns.abstractFactoryMethod

import designPatterns.creationalPatterns.abstractFactoryMethod.library.*

fun main() {
    val windowsFactory: Factory = FactoryProvider.getFactory(FactoryType.Windows)

    val windowsButton: Button = windowsFactory.createButton()
    windowsButton.click()

    val windowsText: Text = windowsFactory.createText()
    windowsText.setText()

    val windowsImage: Image = windowsFactory.createImage()
    windowsImage.setImage()

    val macFactory: Factory = FactoryProvider.getFactory(FactoryType.Mac)

    val macButton: Button = macFactory.createButton()
    macButton.click()

    val macText: Text = macFactory.createText()
    macText.setText()

    val macImage: Image = macFactory.createImage()
    macImage.setImage()
}