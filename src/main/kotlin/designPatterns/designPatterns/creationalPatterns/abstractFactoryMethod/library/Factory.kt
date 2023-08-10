package designPatterns.creationalPatterns.abstractFactoryMethod.library

interface Factory {
    fun createButton(): Button
    fun createText(): Text
    fun createImage(): Image
}