package com.company;
/*
Задание: Дан массив с элементами [2, 3, 4, 5].
С помощью цикла for найдите произведение элементов этого массива.
*/
public class Main {
        public static void main(String[] args) {
            //2*3*4*5 ?
            int nums [] = {2, 3, 4, 5};

            int Произведение = 2;
            for (int i = 1; i < nums.length; i++){
                Произведение *= nums[i];
            }
            System.out.println("произведение элементов массива = "+Произведение);
        }
    }
