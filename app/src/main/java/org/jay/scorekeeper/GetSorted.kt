package org.jay.scorekeeper

import java.time.Instant
import java.time.ZoneId
import java.util.stream.Collectors
import java.util.stream.Stream

class GetSorted {

    companion object {
        const val TAG = "GetSorted"
    }

    fun getSquare(number: Int): Int {
        Logger(TAG, "getSquare->$number")
        Thread.sleep(100)
        return number * number
    }

    fun getListOfOddNumbers(number: Int = 100): List<Int> {
        val seq = generateSequence<Int>(seed = 1) { start ->
            val r = start + 2
            Thread.sleep(100)
            Logger(TAG, "OddNumbers->$r")
            return@generateSequence r
        }
        return seq.take(number).toList()
    }

    fun getListOfEvenNumbers(number: Int = 100): List<Int> {
        val result = mutableListOf<Int>()
        for (idx in 1..number) {
            Thread.sleep(100)
            if (idx.rem(2) == 0) {
                Logger(TAG, "EvenNumber->$idx")
                result.add(idx)
            }
        }
        return result
    }

    fun getTimedRange(start: Long = 1646006400000, end: Long = 1646023090000): List<Int> {
        Logger(TAG, "Starting time ${Instant.ofEpochMilli(start)}")
        Logger(TAG, "Ending time ${Instant.ofEpochMilli(end)}")

        val result = (start..end step 300000).toList().stream().map {
            Logger(TAG, "Inloop time ${Instant.ofEpochMilli(it)}")
            Instant.ofEpochMilli(it).atZone(ZoneId.systemDefault()).minute
        }.collect(Collectors.toList())

        result.forEach {
            Logger(TAG, "------------------------->>>>>>>>>>>$it")
        }
        return result
    }

}