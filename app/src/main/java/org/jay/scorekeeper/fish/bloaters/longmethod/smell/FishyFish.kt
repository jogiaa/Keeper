package org.jay.scorekeeper.fish.bloaters.longmethod.smell

import android.util.Log
import java.time.Instant
import java.time.temporal.ChronoField


class FishyFish {
    lateinit var base: String
    fun recomendations(type: Geners) {
        when (type) {
            Geners.Pop -> playPop()
            Geners.Rock -> playRock()
            Geners.SoftRock -> playSoftRock()
            Geners.Classical -> playClassical(type)
            Geners.Folk -> playFolk()
            Geners.Jazz -> playJazz()
            Geners.ClassicalRock -> playClassicalRock()
            Geners.Indie -> playIndie()
            Geners.Bhangra -> playBhangra()
            Geners.Filmi -> playFilmi()
            Geners.Tragic -> playTragic()
        }
    }

    private fun playPop() {
        Log.e("FishyFish", "Playing playPop")
        val now = Instant.now()
        if (now.get(ChronoField.MONTH_OF_YEAR) == 1) {
            Log.e("FishyFish", "Playing pop for Jan")
            val arrayname = arrayOf(1, 2, 3, 4, 5)
            for (i in 0..arrayname.size - 1) {
                print(" " + arrayname[i])
            }
            println()
            // declaring an array using arrayOf<Int>
            val arrayname2 = arrayOf<Int>(10, 20, 30, 40, 50)
            for (i in 0..arrayname2.size - 1) {
                print(" " + arrayname2[i])
            }
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 2) {
            Log.e("FishyFish", "Playing pop for Feb")
            val shipments = listOf(
                IceCreamShipment("Chocolate", 3),
                IceCreamShipment("Strawberry", 7),
                IceCreamShipment("Vanilla", 5),
                IceCreamShipment("Chocolate", 5),
                IceCreamShipment("Vanilla", 1),
                IceCreamShipment("Rocky Road", 10),
            )
            val iceCreamInventory = mutableMapOf<String, Int>()

            for (shipment in shipments) {
                val currentQuantity = iceCreamInventory[shipment.flavor] ?: 0
                iceCreamInventory[shipment.flavor] = currentQuantity + shipment.quantity
            }
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 3) {
            Log.e("FishyFish", "Playing pop for March")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 4) {
            Log.e("FishyFish", "Playing pop for April")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 5) {
            Log.e("FishyFish", "Playing pop for May")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 6) {
            Log.e("FishyFish", "Playing pop for June")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 7) {
            Log.e("FishyFish", "Playing pop for July")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 8) {
            Log.e("FishyFish", "Playing pop for Aug")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 9) {
            Log.e("FishyFish", "Playing pop for Sep")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 10) {
            Log.e("FishyFish", "Playing pop for Oct")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 11) {
            Log.e("FishyFish", "Playing pop for Nov")
        } else if (now.get(ChronoField.MONTH_OF_YEAR) == 12) {
            Log.e("FishyFish", "Playing pop for Dec")
        }
    }

    fun playRock() {
        Log.e("FishyFish", "Playing playRock")
        base = "989"
    }

    fun playSoftRock() {
        Log.e("FishyFish", "Playing playSoftRock")
    }

    fun playClassical(type: Geners) {
        val listA = listOf<String>("Example", "Program", "Tutorial")
        println(listA[0])
        println(listA.get(2))

        val changeAblesList = mutableListOf<String>()
        changeAblesList.addAll(listA)
        println(changeAblesList)

        val b = listA.contains("Program")

        //based on the result of contains(), print a message
        if (b) {
            print("Program is present in the list.")
        } else {
            print("Program is not present in the list.")
        }

        val c = listA.find { it.contains("am") }

        //print the element
        print(c)

        val d = listA.filter { it.contains("am") }
        println(d)

        for (item in changeAblesList) {
            println(item)
        }

        changeAblesList.stream().map {
            print(it)
        }

        val originalList = listOf<Int>(1, 2, 3, 4, 5, 6)
        print(originalList.filter { it % 2 == 0 })
        print(originalList.firstOrNull { it > 4 })
        print(originalList.getOrElse(12) { 12 })

        print(originalList.dropWhile { it < 5 })
        val result = originalList
            .dropWhile { it < 5 }
            .find { it < 7 }
        print(result)
        for (i in 1..10)
            print("$i,")

        println("")

        for (i in 'A'..'z')
            print("$i,")
        var calulations = 0
        calulations += 89
        calulations = Math.abs(-98)

        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }

        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }

        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }

        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }

        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }


        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }


        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }

        calulations += when (type) {
            Geners.Pop -> 1
            Geners.Rock -> 2
            Geners.SoftRock -> 3
            Geners.Folk -> 4
            Geners.Jazz -> 5
            Geners.ClassicalRock -> 6
            Geners.Indie -> 7
            Geners.Bhangra -> 8
            Geners.Filmi -> 9
            Geners.Tragic -> 10
            else -> 9
        }

        print(calulations)
        val Items = listOf<Item>()
        for (i in 0 until Items.size) {
            if (Items.get(i).Name !== "Aged Brie" && Items.get(i).Name !== "Backstage passes to a TAFKAL80ETC concert") {
                if (Items.get(i).Quality > 0) {
                    if (Items.get(i).Name !== "Sulfuras, Hand of Ragnaros") {
                        Items.get(i).Quality = Items.get(i).Quality - 1
                    }
                }
            } else {
                if (Items.get(i).Quality < 50) {
                    Items.get(i).Quality = Items.get(i).Quality + 1
                    if (Items.get(i).Name === "Backstage passes to a TAFKAL80ETC concert") {
                        if (Items.get(i).SellIn < 11) {
                            if (Items.get(i).Quality < 50) {
                                Items.get(i).Quality = Items.get(i).Quality + 1
                            }
                        }
                        if (Items.get(i).SellIn < 6) {
                            if (Items.get(i).Quality < 50) {
                                Items.get(i).Quality = Items.get(i).Quality + 1
                            }
                        }
                    }
                }
            }
            if (Items.get(i).Name !== "Sulfuras, Hand of Ragnaros") {
                Items.get(i).SellIn = Items.get(i).SellIn - 1
            }
            if (Items.get(i).SellIn < 0) {
                if (Items.get(i).Name !== "Aged Brie") {
                    if (Items.get(i).Name !== "Backstage passes to a TAFKAL80ETC concert") {
                        if (Items.get(i).Quality > 0) {
                            if (Items.get(i).Name !== "Sulfuras, Hand of Ragnaros") {
                                Items.get(i).Quality = Items.get(i).Quality - 1
                            }
                        }
                    } else {
                        Items.get(i).Quality = Items.get(i).Quality - Items.get(i).Quality
                    }
                } else {
                    if (Items.get(i).Quality < 50) {
                        Items.get(i).Quality = Items.get(i).Quality + 1
                    }
                }
            }
        }
    }

    fun playFolk() {

    }

    fun playJazz() {
        Log.e("FishyFish", "Playing playJazz")
    }

    fun playClassicalRock() {
        Log.e("FishyFish", "Playing playClassicalRock")
    }

    fun playIndie() {
        Log.e("FishyFish", "Playing playIndie")
    }

    fun playBhangra() {
        Log.e("FishyFish", "Playing playBhangra")
    }

    fun playFilmi() {
        Log.e("FishyFish", "Playing playFilmi")
    }

    fun playTragic() {
        Log.e("FishyFish", "Playing playTragic")
    }
}