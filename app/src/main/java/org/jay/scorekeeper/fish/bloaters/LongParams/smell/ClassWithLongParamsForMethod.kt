package org.jay.scorekeeper.fish.bloaters.LongParams.smell

class ClassWithLongParamsForMethod {

    fun functionWithLongListOfParams(
        paramOne: Int,
        paramTwo: String,
        paramThree: Float,
        paramFour: String,
        paramFive: Boolean,
        paramSix: Int,
        paramSeven: Boolean,
        paramEight: String,
        paramNine: Boolean
    ) = "Params passed $paramOne $paramTwo " +
            "$paramThree $paramFour " +
            "$paramFive $paramSix " +
            "$paramSeven $paramEight $paramNine"
}