package org.jay.scorekeeper.fish.RefusedBequest.smell

class CaseBClass : InterfaceWithManyFunctions {
    override fun functionNeededInCaseA() {
        //do nothing
    }

    override fun functionNeededInCaseB() {
        doSomeThingForCaseB()
    }

    override fun functionNeededInAllCases() {
        doSomeThingFoAllCases()
    }

    private fun doSomeThingForCaseB() = 45
    private fun doSomeThingFoAllCases() = 90
}