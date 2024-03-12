package Lesson_9;

/* HW_1 Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).*/
public class MonthUtils {
    public static Month JAN = new Month("January", 31, 21);
    public static Month FEB = new Month("February", 28, 20);
    public static Month MAR = new Month("March", 31, 22);
    public static Month APR = new Month("April", 30, 22);
    public static Month MAY = new Month("May", 31, 18);
    public static Month JUN = new Month("June", 30, 21);
    public static Month JUL = new Month("July", 31, 20);
    public static Month AUG = new Month("August", 31, 20);
    public static Month SEP = new Month("September", 30, 19);
    public static Month OCT = new Month("October", 31, 22);
    public static Month NOV = new Month("November", 30, 19);
    public static Month DES = new Month("December", 31, 21);

    public static Month[] ALL_MONTHS = {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DES
    };
}
