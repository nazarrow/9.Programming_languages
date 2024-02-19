package Lesson_7;

/*Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/
public class Person {

    String name;
    int age;
    char sex;

    String getName() {
        String findPref = "";
        if (Character.toLowerCase(sex) == 'm') {
            findPref = "Mr. ";
        } else if (Character.toLowerCase(sex) == 'f') {
            findPref = "Mrs. ";
        }
        return findPref + name;
    }
}
