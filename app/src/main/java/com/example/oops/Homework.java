package com.example.oops;

public class Homework {

    public static void main(String[] args) {
        Shape s1 = new Triangle(4,5);
        Shape s2 = new Square(4);
        Shape s3 = new Rectangle(5,5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Shape{
    double side;
    double length;
    double breadth;

    Shape(double side){        //For Square
        this.side = side;
    }

    Shape(double length, double breadth){  //For Rectangle and Triangle
        this.length = length;
        this.breadth = breadth;
    }
}

class Square extends Shape{
    Square (double side){
        super(side);
    }

    public double calculateArea(){
        System.out.println("Calculating the area of the square");
        return super.side*super.side;
    }

    public String toString(){
        return "The are of square: "+calculateArea();
    }
}

class Rectangle extends Shape{

    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    public double calculateArea(){
        System.out.println("Priting the Area of Rectangle");
        return super.length * super.breadth;
    }

    public String toString(){
        return "The area of rectangle: "+calculateArea();
    }
}

class Triangle extends Shape{
    Triangle(double height, double base) {
        super(height, base);
    }

    public double calculateArea(){
        System.out.println("Priting the area of Triangle");
        return 0.5 * super.breadth * super.length;
    }

    public String toString(){
        return "The area of Triangle is: "+calculateArea();
    }
}