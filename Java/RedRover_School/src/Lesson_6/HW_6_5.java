package Lesson_6;

/*Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел*/

public class HW_6_5 {

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static double getMinus(double a, double b) {
        return a - b;
    }

    public static double getMultiplication(double a, double b) {
        return a * b;
    }

    public static double getDivision(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(20, 10));
        System.out.println(getMinus(20, 10));
        System.out.println(getMultiplication(20, 10));
        System.out.println(getDivision(20, 10));
    }
}
