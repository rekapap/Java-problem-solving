package com.company;

import java.util.*;
import java.io.*;

class Main {
    private static long FirstFactorial(int number) {
        long sum = 1L;

        while(number >= 1)
        {
            sum*= number;
            number--;
        }

        return sum;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print(FirstFactorial(number));
    }

}
