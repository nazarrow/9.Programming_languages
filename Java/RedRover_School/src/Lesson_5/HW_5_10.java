package Lesson_5;

/*Вывести следующие строки с соответствующим форматированием (как пирамиды):
        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
              6 5 4 3 2 1 0 1 2 3 4 5 6
                5 4 3 2 1 0 1 2 3 4 5
                  4 3 2 1 0 1 2 3 4
                    3 2 1 0 1 2 3
                      2 1 0 1 2
                        1 0 1
                          0*/

public class HW_5_10 {

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
