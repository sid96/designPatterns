package designPatterns.structuralPatterns.adapterPattern

fun main() {

    val analyticsAdapter: ClientInterface = AnalyticsAdapter()

    analyticsAdapter.sendEvent("Firebase Event", EventTypes.Firebase)
    analyticsAdapter.sendEvent("Clevertap Event", EventTypes.Clevertap)
    analyticsAdapter.sendEvent("Adobe Event", EventTypes.Adobe)
}