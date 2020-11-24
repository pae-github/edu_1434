package com.company;
/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.
Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = input.nextInt();
        if ( a==10 ) //два знака == ,означает равно. Знак !=, означает НЕ равно
        {
            System.out.println ("Верно");
        }
        else //иначе
        {
            System.out.println ("Неверно");
        }
    }
}
