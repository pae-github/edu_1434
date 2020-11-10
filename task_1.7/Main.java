package com.company;
/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода: ТОЛЬКО ТУТ 250,0 литров!!!
250000   */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //вводим размеры с клавиатуры
        Scanner Size = new Scanner(System.in);
        System.out.print("Введите размеры бассейна: \n"); // \n - перенос на новую строку !!!
        System.out.print("размер a = "); 
        //println - ввод сновой строки, а если просто print, то на этой же !!!
        double a = Size.nextDouble();
        System.out.print("размер b = ");
        double b = Size.nextDouble();
        System.out.print("размер c = ");
        double c = Size.nextDouble();
        double volume = a * b * c;
        System.out.print("количество воды, которое нужно для наполнения бассейна = "+volume+" литров");
    }
}
