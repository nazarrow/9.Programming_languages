package Lesson_3;

//Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
//больше 10 - если переменная больше 10
//меньше 100 - если переменная меньше 100
//результат деления на 2 больше 20 - если это соответствует истине
//значение переменной между 5 и 40 включительно - если это правда
//значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

public class HW_3_3 {
    public static void main(String[] args) {
        int i = 41;

        if (i > 10) {
            System.out.println("a > 10");
        }
        if (i < 100) {
            System.out.println("i < 100");
        }
        if (i * 1.0 / 2 > 20) {
            System.out.println("i / 2 > 20");
        }
        if (i >= 5 && i <= 40) {
            System.out.println("i >= 5 && i <= 40");
        } else if (i < 5 || i > 40) {
            System.out.println("i < 5 || i > 40");
        }
    }
}
