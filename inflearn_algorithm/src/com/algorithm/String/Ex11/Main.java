package com.algorithm.String.Ex11;

import java.util.Scanner;

public class Main {
    public String solution(String s) {
        String answer = "";
        int su = 1;
        char beforeChar = s.charAt(0);
        for (int i = 1; i < s.toCharArray().length; i++) {
            if(beforeChar != s.charAt(i)) {
                answer += su > 1 ? String.valueOf(beforeChar) + su : String.valueOf(beforeChar);
                su = 0;
            }
            beforeChar = s.charAt(i);
            su++;
        }
        answer += su > 1 ? String.valueOf(beforeChar) + su : String.valueOf(beforeChar);
        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        s += " ";
        int su = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) {
                answer += s.charAt(i);
                if(su > 1) {
                    answer += su;
                }
                su = 1;
            } else {
                su++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();

        Main main = new Main();
        System.out.println(main.solution2(s));
    }
}
