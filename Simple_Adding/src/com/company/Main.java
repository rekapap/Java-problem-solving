package com.company;

import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Main {
    private static int SimpleAdding(int num) {
        // if (num <= 0) return num;

        int startNumber = 1;
        int sum = 0;

        while (startNumber <= num)
        {
            sum += startNumber;
            startNumber++;
        }

        return sum;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        s.nextLine();
        System.out.print(SimpleAdding(number));
    }

}
