package Lesson_3;

//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//a == b - если переменные равны
//a < b - если переменная a меньше b
//a > b - если переменная b меньше a

public class HW_3_1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 66;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}
