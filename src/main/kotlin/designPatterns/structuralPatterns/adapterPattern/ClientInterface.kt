package designPatterns.structuralPatterns.adapterPattern

interface ClientInterface {

    fun sendEvent(eventName: String, eventTypes: EventTypes)

}