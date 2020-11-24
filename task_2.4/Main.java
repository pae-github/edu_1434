package com.company;

/*
Задание: Пользователь вводит сумму вклада и процент,
который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner; //импорт для ввода с клавиатуры !
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //ввод с клавиатуры значений

        System.out.print("Введите сумму первоначального взноса: ");
        double PresentValue = input.nextDouble(); //Present Value (Сумма вклада сегодня)

        System.out.print("Введите годовой %: ");
        double Interest = input.nextDouble(); //годовой %

        System.out.print("Введите период размещения вклада: ");
        double Period = input.nextDouble(); //Срок размещения вклада

        double FutureValue = PresentValue; 
        // FutureValue 0  = PresentValue 0
        // FutureValue 1  = PresentValue 0 + сумма % за год (PresentValue 0 * %)
        // FutureValue 2  = FutureValue 1 + сумма % за год (FutureValue 1 * %)
        // ... FutureValue 5  = FutureValue 4 + сумма % за год (FutureValue 4 * %)
        for (int i = 1; i <= Period; i++) { //числовая переменная i считает количество строк (лет)
            FutureValue = FutureValue + (FutureValue * Interest / 100);
            System.out.println("Сумма за " + i + " год будет равна " + FutureValue);
        }
    }
}
