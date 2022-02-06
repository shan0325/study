package com.algorithm.String.Ex05;

import java.io.CharArrayWriter;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public String solution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if(Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])) {
                swap(chars, lt, rt);
                lt++;
                rt--;
            } else if(!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(chars[rt])) {
                rt--;
            }
        }
        return String.valueOf(chars);
    }

    public void swap(char[] array, int a, int b) {
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();

        Main main = new Main();
        System.out.println(main.solution(input));
    }
}
