package org.jay.scorekeeper

import androidx.lifecycle.ViewModel
import java.util.stream.Collectors
import java.util.stream.Stream

class AlphaDialogViewModel : ViewModel() {
    private val getSorted = GetSorted()

    companion object {
        const val TAG = "AlphaDialogViewModel"
    }

    fun operations(number: Int) {
//        viewModelScope.launch {
        Logger(TAG, "operations $number")
        val squares = (0..number).toList().parallelStream().map {
            getSorted.getSquare(it)
        }.collect(Collectors.toList())

        val odds = getSorted.getTimedRange()
        val finalList = mutableListOf<Int>()
        Stream.of(squares, odds).forEach {
            finalList.addAll(it)
        }
//        coroutineScope {
//            launch {
//
//            }
//        }
        finalList.sort()
        finalList.forEach {
            Logger(TAG, "Simple=====>>$it")
        }
        finalList.chunked(size = 6).forEach {
            Logger(TAG, "windowed-------->$it")
        }
    }
}