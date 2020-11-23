package com.company;
/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */

public class Main {
    public static void main(String[] args) {

        for (int Y = 1; Y <= 10; Y++) { //ось Y
            for (int X = 1; X <= 10; X++) //ось X
                System.out.print(" " + Y * X); //печатаем числа через пробел
            System.out.println(); //поставить enter для новой строчки
        }
    }
}
