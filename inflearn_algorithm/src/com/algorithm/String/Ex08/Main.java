package com.algorithm.String.Ex08;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public String solution(String str) {
        String answer = "NO";
        String collect = str.chars().filter(c -> Character.isAlphabetic(c)).mapToObj(c -> Character.toString((char) c)).collect(Collectors.joining());
        String reverseStr = new StringBuilder(collect).reverse().toString();
        if(collect.equalsIgnoreCase(reverseStr)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();

        Main main = new Main();
        System.out.println(main.solution(input));
    }
}
