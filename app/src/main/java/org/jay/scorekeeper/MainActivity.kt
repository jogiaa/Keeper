package org.jay.scorekeeper

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.jay.scorekeeper.fish.FeatureEnvy.smell.ContactInfo
import org.jay.scorekeeper.fish.FeatureEnvy.smell.User
import org.jay.scorekeeper.fish.RefusedBequest.smell.CaseAClass
import org.jay.scorekeeper.fish.RefusedBequest.smell.CaseBClass
import org.jay.scorekeeper.fish.bloaters.LongParams.smell.ClassWithLongParamsForMethod
import org.jay.scorekeeper.fish.bloaters.longmethod.smell.FishyFish
import org.jay.scorekeeper.fish.bloaters.longmethod.smell.Geners
import org.jay.scorekeeper.fish.dataclump.smell.Booking
import org.jay.scorekeeper.fish.dataclump.smell.Flight
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    var TAG: String = "MainActivity"
    lateinit var model: AlphaDialogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger(TAG, "onCreate")
//
//        stringTemplate()
//        val aVal = 23
//        val bVal = 45
//        Logger(TAG, "${maxOf(aVal, bVal)}")
//        Logger(TAG, "${maxOfExpression(aVal, bVal)}")
//        Logger(TAG, "${maxValIfBlock(aVal, bVal)}")

        val caseA = CaseAClass()
        val caseB = CaseBClass()

        caseA.functionNeededInAllCases()
        caseA.functionNeededInCaseA()
        caseA.functionNeededInCaseB()

        caseB.functionNeededInAllCases()
        caseB.functionNeededInCaseA()
        caseB.functionNeededInCaseB()

        val fromDateTiem = LocalDateTime.now()
        val toDateTime: LocalDateTime? = null
        val flight = Flight(destination = "Lahore", from = fromDateTiem, to = toDateTime)
        flight.getDetails()

        val booking =
            Booking(destination = "Multan", passengers = 4, from = fromDateTiem, to = toDateTime)
        booking.getItinerary()
        val p1 = 23
        val p2 = false
        val p3 = "abc"

        booking.functionOneWithSameThreeParams(p1, p2, p3)
        booking.functionTwoWithSameThreeParams(p1, p2, p3)
        booking.functionThreeWithSameThreeParams(p1, p2, p3, false)


    }


    override fun onStart() {
        super.onStart()
        Logger(TAG, "onStart")
        findViewById<TextView>(R.id.pinaclada).text = "Alpha!"
        findViewById<Button>(R.id.button_id).setOnClickListener {
            AlphaDialog().show(supportFragmentManager, AlphaDialog.TAG)
        }
    }

    //    val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    override fun onResume() {
        super.onResume()
        Logger(TAG, "onResume")
        val getSorted = GetSorted()
        Logger(TAG, "Evens == ${getSorted.getListOfEvenNumbers(10)}")

        Logger(TAG, "Square == ${getSorted.getSquare(45)}")
        findViewById<TextView>(R.id.pinaclada).text = "********Omega*********"

//        scope.launch {
//            Logger(TAG, "Odds == ${getSorted.getListOfOddNumbers(10)}")
//        }

        val fishy = FishyFish()
        fishy.recomendations(Geners.Pop)
        fishy.recomendations(Geners.Rock)
        fishy.recomendations(Geners.Bhangra)

        ClassWithLongParamsForMethod().functionWithLongListOfParams(
            paramOne = 123,
            paramTwo = "Helo",
            paramThree = 2.3f,
            paramFour = "Hello",
            paramFive = false,
            paramSix = 345,
            paramSeven = true,
            paramEight = "Hello",
            paramNine = false
        )
        val contactInfo = ContactInfo()
        User(null).getFullAddress(contactInfo)

        val caseA = CaseAClass()
        val caseB = CaseBClass()

        caseA.functionNeededInAllCases()
        caseA.functionNeededInCaseA()
        caseA.functionNeededInCaseB()

        caseB.functionNeededInAllCases()
        caseB.functionNeededInCaseA()
        caseB.functionNeededInCaseB()

    }

    fun stringTemplate() {
        val value: String = "Good Luck"
        Logger(TAG, "$value son!!")
    }


    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOfExpression(a: Int, b: Int): Int = if (a > b) a else b

    fun maxValIfBlock(a: Int, b: Int): Int {
//        if branches can be blocks, and the last expression is the value of a block:
        val result = if (a > b) {
            Logger(TAG, "Inside if Block: ${a}")
            a
        } else {
            Logger(TAG, "Inside if Block: ${b}")
            b
        }
        return result
    }

    fun testingWhen(x: Float, a: Int, b: Any) {
        Logger(TAG, "Part 1")
        when (x) {
            1f -> print("x == 1")
            2f -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }


        Logger(TAG, "Part II")
        when {
            a % 2 == 0 -> Logger(TAG, "Prime ${a}")
            a % 3 == 0 -> Logger(TAG, "Threeee ${a}")
            else -> Logger(TAG, "None")
        }

        Logger(TAG, "Part III")

        val w = when {
            a % 2 == 0 -> {
                Logger(TAG, "Prime ${a}")
                "Prime"
            }
            a % 3 == 0 -> {
                Logger(TAG, "Threeee ${a}")
                "Three"
            }
            else -> {
                Logger(TAG, "None")
                "None"
            }
        }

        Logger(TAG, "Part III Result:: ${w}")

        Logger(TAG, "Part IV")
        val y: String = when (b) {
            is String -> "String Value"
            in 0..2 -> "Int Value"
            5, 7 -> "5 or 7"
            else -> "None"
        }
        Logger(TAG, "Part IV Result:: ${y}")


    }


    fun isPrime(a: Int): Boolean = a % 2 == 0

}
