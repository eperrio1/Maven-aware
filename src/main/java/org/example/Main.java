package org.example;
//import Student.Student;

public class Main {
    public static void main(String[] args){
        Student sum = new Student(1, 2);
        System.out.println("Addition: " + sum.add());
        System.out.println("Subtraction: " + sum.subtract());
        System.out.println("Multiplication: " + sum.multiply());
    }


}