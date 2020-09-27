package com.training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inReader = new Scanner(System.in);
        int size = inReader.nextInt();
        inReader.close();

        int [] mas1 = new int[size];
        int [] mas2 = new int[size];

        for (int i = 0; i < size; i++) {
            mas1[i] = (int)(Math.random()*100);
            mas2[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < size; i++) {
            average1 += mas1[i];//a += b -> a = a + b
            average2 += mas2[i];
        }
        average1 /= mas1.length;
        average2 /= mas2.length;

        if(average1 > average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+ average1 +")");
        }

    }
}