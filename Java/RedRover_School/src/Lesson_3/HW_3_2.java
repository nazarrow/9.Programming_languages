package Lesson_3;

//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//maybe a and b are even - если сумма переменных четная
//some variable is odd - если сумма переменных нечетная

public class HW_3_2 {
    public static void main(String[] args) {
        int a = 1012;
        int b = 333;
        boolean isEven = (a + b) % 2 == 0;

        if (isEven) {
            System.out.println("maybe a and b are even");
        } else if (!isEven) {
            System.out.println("some variable is odd");
        }
    }
}
