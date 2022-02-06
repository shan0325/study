package com.algorithm.String.Ex09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public int solution(String str) {
        String number = str.chars()
                            .filter(i -> !Character.isAlphabetic(i))
                            .mapToObj(i -> Character.toString((char) i))
                            .collect(Collectors.joining());
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();

        Main main = new Main();
        System.out.println(main.solution(input));
    }
}
