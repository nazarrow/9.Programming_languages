package Lesson_7;

/*Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.*/

public class Salary {
    static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }
}
