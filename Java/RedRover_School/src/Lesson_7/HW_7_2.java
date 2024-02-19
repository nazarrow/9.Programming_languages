package Lesson_7;

/*
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true,
если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
*/

public class HW_7_2 {

    public static void main(String[] args) {
        Employee Aleksei = new Employee();
        Aleksei.name = "Aleksei Nazarov";
        Aleksei.age = 30;
        Aleksei.sex = 'M';
        Aleksei.salary = 3000;

        Employee Max = new Employee();
        Max.name = "Max Birs";
        Max.age = 36;
        Max.sex = 'm';
        Max.salary = 2000;

        Employee Alex = new Employee();
        Alex.name = "Aleksei Nazarov";
        Alex.age = 30;
        Alex.sex = 'M';
        Alex.salary = 3000;

        System.out.println(Aleksei.isSameName(Aleksei));
        System.out.println(Aleksei.isSameName(Max));
        System.out.println(Aleksei.isSameName(Alex));
    }
}
