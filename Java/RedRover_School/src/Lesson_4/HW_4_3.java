package Lesson_4;

//Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//        Реализовать 2 варианта:
//использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//без использования конструкции if (шаг цикла на ваше усмотрение).

public class HW_4_3 {

// variant 1

    public static void main(String[] args) {
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");

        // variant 2x\

        for (int b = 40; b <= 60; b += 4) {
            System.out.println(b);
        }
    }
}
