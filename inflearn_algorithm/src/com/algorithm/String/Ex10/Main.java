package com.algorithm.String.Ex10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public int[] solution(String s, char t) {
        int[] numbers = new int[s.length()];
        Arrays.fill(numbers, Integer.MAX_VALUE);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == t) {
                    int num = Math.abs(i - j);
                    if (numbers[i] > num) {
                        numbers[i] = num;
                    }
                }
            }
        }

        return numbers;
    }

    public int[] solution2(String s, char t) {
        int[] numbers = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                numbers[i] = 0;
            } else {
                p++;
                numbers[i] = p;
            }
        }

        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                numbers[i] = Math.min(numbers[i], p);
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();

        Main main = new Main();
        int[] numbers = main.solution2(s, t.charAt(0));
        IntStream.of(numbers).forEach(i -> System.out.print(i + " "));
    }
}
