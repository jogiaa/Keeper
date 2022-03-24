package org.jay.scorekeeper.fish.dataclump.smell

import java.time.LocalDateTime

class Booking(
    private val destination: String,
    private val passengers: Int,
    private val from: LocalDateTime?,
    private val to: LocalDateTime?
) {
    fun getItinerary() = "$passengers going to $destination from $from to $to"

    fun functionOneWithSameThreeParams(paramOne: Int, paramTwo: Boolean, paramThree: String) =
        "$paramOne $paramTwo $paramThree"

    fun functionTwoWithSameThreeParams(paramOne: Int, paramTwo: Boolean, paramThree: String) =
        "${paramOne * 3} $paramTwo ${paramThree.uppercase()}"

    fun functionThreeWithSameThreeParams(
        paramOne: Int,
        paramTwo: Boolean,
        paramThree: String,
        paramFour: Boolean
    ) =
        "${paramOne * 3} $paramTwo ${paramThree.uppercase()} $paramFour"
}