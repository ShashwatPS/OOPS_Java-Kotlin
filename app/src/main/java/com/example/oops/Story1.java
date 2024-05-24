package com.example.oops;

public class Story1 {
    public static void main(String[] args) {
        Employee e1 = new Contracter("Shashwat", "Contractor", 1);
        Employee e2 = new Intern("Shashwat", "Intern", 2);
        Employee e3 = new FullTime("Shashwat", "FullTime", 3);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}

class Employee {
    String employeeName;
    String employeeType;
    int employeeId;

    Employee(String employeeName, String employeeType,int employeeId){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeType = employeeType;
    }

    public String toString(){
        return "Name: "+employeeName+" Type: "+employeeType+" ID: "+employeeId;
    }
}

class Contracter extends Employee{
    String salary = "$100,000";
    Contracter(String employeeName, String employeeType, int employeeId) {
        super(employeeName, employeeType, employeeId);
    }

    public String toString(){
        return super.toString() + " Salary: "+salary;
    }

}

class Intern extends Employee{

    String salary = "$50,000";

    Intern(String employeeName, String employeeType, int employeeId) {
        super(employeeName, employeeType, employeeId);
    }

    public String toString(){
        return super.toString() + " Salary: "+salary;
    }
}

class FullTime extends Employee{

    String salary = "$200,000";
    FullTime(String employeeName, String employeeType, int employeeId) {
        super(employeeName, employeeType, employeeId);
    }

    public String toString(){
        return super.toString() + " Salary: "+salary;
    }
}