package Lesson_6;

/*Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)*/

public class HW_6_1 {

    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            char findLetter = s.charAt(i);
            if (findLetter == 'о') {
                System.out.print(findLetter);
            }
        }
    }
}


