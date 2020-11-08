/* 
Напиши программу, которая в методе main объявляет такие переменные:
name типа String, age типа int и city типа String.
Примечание: "объявить переменную" - значит то же, что и "создать переменную".
Требования:
•
Объяви переменную name типа String.
•
Объяви переменную age типа int.
•
Объяви переменную city типа String.
•
Должны быть объявлены 3 переменные.
*/

package com.company;
public class Main {
    public static void main(String[] args) {
        String Name = "Andrey";
        String Surname = "Pavlovskiy";
        int Age = 45;
        String City = "Moscow";
        System.out.println(Name+" "+Surname);
        System.out.println("Age "+Age);
        System.out.println("From "+City);
    }
}

