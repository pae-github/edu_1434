package com.company;

/*
Задание: Даны переменные a и b.
Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления,
иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число 'a': ");
        int a = input.nextInt();
        System.out.print("Введите число 'b': ");
        int b = input.nextInt();

        int c = a % b;// % обозначает вычисление остатка от деления нацело

        if (c == 0) {
            System.out.println("Делится. Результат = " + c);
        }
        else {
            System.out.println("Делится с остатком. Остаток от деления = " + c);
        }
    }
}
