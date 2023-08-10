package designPatterns.creationalPatterns.abstractFactoryMethod.library

class MacViewFactory : Factory {
    override fun createButton(): Button {
        return ButtonForMac()
    }

    override fun createText(): Text {
        return TextForMac()
    }

    override fun createImage(): Image {
        return ImageForMac()
    }
}