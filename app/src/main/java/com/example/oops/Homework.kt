object Homework {
    @JvmStatic
    fun main(args: Array<String>) {
        val s1: Shape = Triangle(4.0, 5.0)
        val s2: Shape = Square(4.0)
        val s3: Shape = Rectangle(5.0, 5.0)

        println(s1)
        println(s2)
        println(s3)
    }
}

open internal class Shape {
    var side: Double = 0.0
    var length: Double = 0.0
    var breadth: Double = 0.0

    constructor(side: Double) {        //For Square
        this.side = side
    }

    constructor(length: Double, breadth: Double) {  //For Rectangle and Triangle
        this.length = length
        this.breadth = breadth
    }
}

internal class Square(side: Double) : Shape(side) {
    fun calculateArea(): Double {
        println("Calculating the area of the square")
        return super.side * super.side
    }

    override fun toString(): String {
        return "The are of square: " + calculateArea()
    }
}

internal class Rectangle(length: Double, breadth: Double) : Shape(length, breadth) {
    fun calculateArea(): Double {
        println("Priting the Area of Rectangle")
        return super.length * super.breadth
    }

    override fun toString(): String {
        return "The area of rectangle: " + calculateArea()
    }
}

internal class Triangle(height: Double, base: Double) : Shape(height, base) {
    fun calculateArea(): Double {
        println("Priting the area of Triangle")
        return 0.5 * super.breadth * super.length
    }

    override fun toString(): String {
        return "The area of Triangle is: " + calculateArea()
    }
}