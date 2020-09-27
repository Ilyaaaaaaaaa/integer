package com.training;
import java.util.Arrays;
import java.util.Scanner;

public class name {

        public static void main(String[] args){

            Scanner inReader = new Scanner(System.in);
            int size = inReader.nextInt();
            inReader.close();

            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){

                    System.out.print("* ");
                    System.out.print("* ");

                }
                System.out.println();
            }
        }
    }

