package com.algorithm.String.Ex02;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();

        Main main = new Main();
        System.out.println(main.solution(input));
    }
}
