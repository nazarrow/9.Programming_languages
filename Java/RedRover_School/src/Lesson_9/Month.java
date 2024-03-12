package Lesson_9;

/* HW_1 Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).*/
public class Month {
    private final String monthName;
    private final int numberOfDays;
    private final int numberOfWorkingDays;

    public Month(String monthName, int numberOfDays, int numberOfWorkingDays) {
        this.monthName = monthName;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }
}
