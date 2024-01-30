package Lesson_2;

//Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными:
//сложение;
//умножение;
//вычитание;
//деление;
//остаток от деления.
//Так же сделать проверку на четность этих переменных и вывести результат.

public class HW_2_1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 7;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.println("a" + " is even");
        } else {
            System.out.println("a" + " is odd");
        }

        if (b % 2 == 0) {
            System.out.println(b + " is even");
        } else {
            System.out.println(b + " is odd");
        }
    }
}
