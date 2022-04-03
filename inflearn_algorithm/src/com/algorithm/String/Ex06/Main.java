package com.algorithm.String.Ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public String solution(String str) {
        List<String> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (!list.contains(String.valueOf(c))) {
                list.add(String.valueOf(c));
            }
        }
        return list.stream().collect(Collectors.joining());
    }

    public String solution2(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();

        Main main = new Main();
        System.out.println(main.solution2(input));
    }
}
