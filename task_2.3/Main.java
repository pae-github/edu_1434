package com.company;

/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Main {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) { //числовая переменная a считает количество строк

            for (int n = 0; n < a; n++) { // печатаем n раз в строке

                System.out.print("8"); // на экран
                } 
                System.out.println(); // перенос на новую строку ПОСЛЕ цикла
                }
    }
}

