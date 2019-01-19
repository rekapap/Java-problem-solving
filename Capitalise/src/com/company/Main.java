package com.company;

import java.util.*;
import java.io.*;

class Main {
    private static String LetterCapitalize(String originalString) {
        String[] words = originalString.split("\\b");
        StringBuilder stringBuilder = new StringBuilder();
        for(String word:words) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}
