package com.company;

import java.util.*;
import java.io.*;

class Main {
    private static String LetterCapitalize(String originalString) {
        String[] words = originalString.split("\\b");
        StringBuilder builder = new StringBuilder();
        for(String w:words) {
            w = w.substring(0, 1).toUpperCase() + w.substring(1);
            builder.append(w);
        }
        return builder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}
