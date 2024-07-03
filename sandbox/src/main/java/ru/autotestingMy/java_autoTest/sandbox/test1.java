package ru.autotestingMy.java_autoTest.sandbox;

public class test1 {

    public static void main(String[] args) {
        hello("world");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + t1(l));
//        double l = 5;
//        t1(5);
//        System.out.println("Площадь квадрата " + l + " = " + t1(l));
        double a = 7;
        double b = 7;
        System.out.println("Площадь прямоугольника сос торонами " + a + " и " + b + " = " + t2(a,b));
    }

    public static void hello(String user) {
        System.out.println("Hello, " +user+ "!");
    }

    public static double t1(double l) {
        return l * l;

    }

    public static double t2(double a, double b) {
        return a * b;
    }
    
}
