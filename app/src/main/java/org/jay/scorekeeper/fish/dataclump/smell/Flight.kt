package org.jay.scorekeeper.fish.dataclump.smell

import java.time.LocalDateTime

class Flight(
    private val destination: String,
    private val from: LocalDateTime?,
    private val to: LocalDateTime?
) {
    fun getDetails() = "Fly to $destination from $from to $to"
}