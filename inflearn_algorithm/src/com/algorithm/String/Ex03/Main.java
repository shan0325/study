package com.algorithm.String.Ex03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public String solution2(String str) {
        return Stream.of(str.split(" ")).reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
    }

    public String solution(String str) {
        String[] s = str.split(" ");
        OptionalInt max = Arrays.stream(s).mapToInt(c -> c.length()).max();
        return Arrays.stream(s).filter(c -> c.length() == max.getAsInt()).findFirst().get();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Main main = new Main();
        System.out.println(main.solution2(input));
    }
}
