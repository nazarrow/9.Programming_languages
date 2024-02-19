package Lesson_7;

/*Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/

public class HW_7_1 {

    public static void main(String[] args) {
        Person man = new Person();
        man.name = "Aleksei Nazarov";
        man.age = 30;
        man.sex = 'M';
        System.out.println(man.getName());

        Person woman = new Person();
        woman.name = "Viktoria N";
        woman.age = 28;
        woman.sex = 'f';
        System.out.println(woman.getName());

        Person unknown = new Person();
        unknown.name = "Rabbit";
        unknown.age = 45;
        unknown.sex = 'S';
        System.out.println(unknown.getName());
    }
}
