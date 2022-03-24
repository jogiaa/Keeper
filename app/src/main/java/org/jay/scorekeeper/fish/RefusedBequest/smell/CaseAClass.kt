package org.jay.scorekeeper.fish.RefusedBequest.smell

class CaseAClass : InterfaceWithManyFunctions {
    override fun functionNeededInCaseA() {
        doSomeThingForCaseA()
    }

    override fun functionNeededInCaseB() {
        //do nothing
    }

    override fun functionNeededInAllCases() {
        doSomeThingFoAllCases()
    }

    private fun doSomeThingForCaseA() = 45
    private fun doSomeThingFoAllCases() = 90
}