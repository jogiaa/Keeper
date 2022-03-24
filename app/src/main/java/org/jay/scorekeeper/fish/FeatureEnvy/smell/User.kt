package org.jay.scorekeeper.fish.FeatureEnvy.smell

class User(contactInfo: ContactInfo?) {
    fun getFullAddress(info: ContactInfo) =
        "${info.getCity()} ${info.getState()} ,${info.getStreetName()}"
}