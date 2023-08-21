package designPatterns.structuralPatterns.adapterPattern

class AnalyticsAdapter : ClientInterface {

    //In a production level codebase this probably be injected from outside or passed through a constructor.
    //This has been initialised here to simplify the example
    //This represents a 3rd party Utils library which cannot be changed
    private val analyticsLibraryUtils = AnalyticsLibraryUtils()


    override fun sendEvent(eventName: String, eventTypes: EventTypes) {
        sendAppropriateEvent(eventName, eventTypes)
    }

    private fun sendAppropriateEvent(eventName: String, eventType: EventTypes) {
        when (eventType) {
            EventTypes.Firebase -> analyticsLibraryUtils.sendFirebaseEvent(eventName)
            EventTypes.Clevertap -> analyticsLibraryUtils.sendEventToClevertap(eventName)
            EventTypes.Adobe -> analyticsLibraryUtils.sendEventToAdobe(eventName)
        }
    }
}