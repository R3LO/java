package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
    public static long max(long x, long y) {
        return (x > y) ? x : y;
    }
    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }

}


/*Три метода и максимум
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.


4. Метод int max(int, int) должен возвращать максимальное из двух чисел типа int.
5. Класс Solution должен содержать статический метод long max(long, long).
6. Метод long max(long, long) должен возвращать максимальное из двух чисел типа long.
7. Класс Solution должен содержать статический метод double max(double, double).
8. Метод double max(double, double) должен возвращать максимальное из двух чисел типа double.*/
