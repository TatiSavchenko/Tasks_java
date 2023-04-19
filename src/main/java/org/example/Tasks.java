// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i:
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа:
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2




package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {
        int i;
        Random random = new Random();
        i = random.nextInt(0, 2000);
        // int i = new Random.nextInt(0, 2000)
        System.out.println(i);                      //Первая задача
        // ---------------------------------------------------------------------//

        System.out.println(Integer.toBinaryString(i)); // Вывести на печать число в бинарном представлении
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);                      //Вторая задача


        // -------------------------------------------------------//
        StringBuilder arr1 = new StringBuilder();
        for (int j = i; j <= Short.MAX_VALUE; j++)
            if (j % n == 0) {
                arr1.append(j).append(" ");
            }

        if (arr1.length() > 0) {
            String[] strings = arr1.toString().split(" ");
            int[] result = new int[strings.length];

            for (int k = 0; k < strings.length; k++)
                result[k] = Integer.parseInt(strings[k]);
            System.out.println(Arrays.toString(result));  // Решение 3 пункта
        }

        //-----------------------------------------------------------//

        //*
        StringBuilder arr2 = new StringBuilder();
        for (int c = Short.MIN_VALUE; c <= i; c++) {
            if (c % n != 0) {
                arr2.append(c).append(" ");
            }
            if (arr2.length() > 0) {
                String[] strings2 = arr2.toString().split(" ");
                int[] result2 = new int[strings2.length];

                for (int d = 0; d < strings2.length; d++)
                    result2[d] = Integer.parseInt(strings2[d]);
                System.out.println(Arrays.toString(result2));          //Вывод 4 пункта
            }
        }
        // */
    }
}




