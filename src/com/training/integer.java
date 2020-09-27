package com.training;

import java.util.Scanner;

public class integer {
    public static void main(java.lang.String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        int count = 0;
        int divider = 1;

        while (divider <= inp) {
            if (inp % divider == 0)
                count++;
            divider++;
        }
        if (count == 2)
            System.out.println(inp + " - простое число");
        else
            System.out.println(inp + " - не простое число");
    }
}