package com.company;
/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner; //импорт для ввод с клавиатуры

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input - ввод информации
        // new Scanner(System.in); ввод с клавиатуры
        System.out.print("Введите число: ");
        double Number = input.nextDouble(); // nextDouble () для дробных чисел
        double Result = Number + (Number * (15.0/100));
        System.out.print(Number+" + 15% = "+Result);
    }
}
