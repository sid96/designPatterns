package designPatterns.creationalPatterns.abstractFactoryMethod.library

class WindowsViewFactory : Factory {
    override fun createButton(): Button {
        return ButtonForWindows()
    }

    override fun createText(): Text {
        return TextForWindows()
    }

    override fun createImage(): Image {
        return ImageForWindows()
    }
}