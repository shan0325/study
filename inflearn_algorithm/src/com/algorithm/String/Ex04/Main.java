package com.algorithm.String.Ex04;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public void solution4(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            int lt = 0;
            int rt = chars.length - 1;
            while (lt < rt) {
                swap(chars, lt, rt);
                lt++;
                rt--;
            }
            strs[i] = String.valueOf(chars);
        }
    }

    public void solution3(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            strs[i] = sb.reverse().toString();
        }
    }

    public void solution2(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            String temp = "";
            for (int j = strs[i].length() - 1; j >= 0; j--) {
                temp += strs[i].charAt(j);
            }
            strs[i] = temp;
        }
    }

    public void solution(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < chars.length / 2; j++) {
                int endIndex = (chars.length - 1) - j;
                swap(chars, j, endIndex);
            }
            strs[i] = String.valueOf(chars);
        }
    }

    public void swap(char[] array, int a, int b) {
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] inputs = new String[num];
        for (int i = 0; i < num; i++) {
            inputs[i] = scanner.next();
        }

        Main main = new Main();
        main.solution4(inputs);
        Stream.of(inputs).forEach(System.out::println);
    }
}
