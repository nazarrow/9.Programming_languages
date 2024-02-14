package Lesson_6;

/*Экстра задача

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.*/

public class HW_6_4 {

    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        for (int i = 0; i <= s.length() - 3; i++) {
            String subStr = s.substring(i, i + 3);
            if (subStr.equals("рит")) {
                System.out.println(i);
            }
        }
    }
}
