package com.company;

import java.util.Scanner;

public class Main {

    public static StringBuilder reverseString(String word){
        StringBuilder newWord = new StringBuilder();
        for (int i=word.length()-1; i>=0; i--){
            newWord.append(word.charAt(i));
      }
      return newWord;
    }

    public static String reverseString2(String word){
        String newWord = new StringBuilder(word).reverse().toString();
        return newWord;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String word = scanner.next();
        System.out.println("Słowo odwrócone to: "+reverseString(word));
        System.out.println("Słowo odwrócone to: "+reverseString2(word));
    }
}
