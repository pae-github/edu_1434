package com.company;
/*
Программа запрашивает у пользователя значение в градусах Цельсия.
Программа должена переводить температуру и выводить на экран значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

import java.util.Scanner; //импорт для ввод с клавиатуры

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // input - ввод информации
        // new Scanner(System.in); ввод с клавиатуры
        System.out.print("Введите значение в градусах Цельсия: ");
        // TC - Температура по Цельсию
        // TF - Температура по Фаренгейту
        double TC = input.nextDouble(); // nextDouble () для дробных чисел
        double TF = (9.0/5)*TC+32;
        System.out.print(TC+"°C"+" = "+TF+"°F");
    }
}
