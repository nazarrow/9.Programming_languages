package Lesson_7;

/*Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.*/

public class HW_7_3 {

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
        Alex.salary = 5000;

        Employee[] employees = {Aleksei, Max, Alex};
        System.out.println(Salary.getSum(employees));
    }
}
