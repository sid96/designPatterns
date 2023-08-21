package designPatterns.structuralPatterns.adapterPattern

class AnalyticsLibraryUtils {

    fun sendFirebaseEvent(eventName: String) {
        println("Sending $eventName event to firebase!")
    }

    fun sendEventToClevertap(eventName: String) {
        println("Sending $eventName event to clevertap!")
    }

    fun sendEventToAdobe(eventName: String) {
        println("Sending $eventName event to adobe!")
    }

}