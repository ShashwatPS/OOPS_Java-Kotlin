package com.example.oops

object Story1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val e1: Employee = Contracter("Shashwat", "Contractor", 1)
        val e2: Employee = Intern("Shashwat", "Intern", 2)
        val e3: Employee = FullTime("Shashwat", "FullTime", 3)
        println(e1)
        println(e2)
        println(e3)
    }
}

open class Employee(
    var employeeName: String,
    var employeeType: String,
    var employeeId: Int,
) {
    override fun toString(): String {
        return "Name: $employeeName Type: $employeeType ID: $employeeId"
    }
}

class Contracter(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary: String = "$100,000"
    override fun toString(): String {
        return super.toString() + " Salary: " + salary
    }
}

class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary: String = "$50,000"

    override fun toString(): String {
        return super.toString() + " Salary: " + salary
    }
}

class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary: String = "$200,000"
    override fun toString(): String {
        return super.toString() + " Salary: " + salary
    }
}