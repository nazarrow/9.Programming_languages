package Lesson_4;

//Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

public class HW_4_2 {

    public static void main(String[] args) {
        for (int i = 5; i < 10000; i = i * 5) {
            System.out.println(i);
        }
    }
}
