package com.algorithm.String.Ex12;

import java.util.Scanner;

public class Main {
    public String solution(int c, String s) {
        String answer = "";
        String temp = "";

        s = s.replaceAll("\\*", "0").replaceAll("#", "1");
        for (int i = 0; i < s.length(); i++) {
            if((i + 1) % 7 == 0) {
                answer += (char) Integer.valueOf(temp + s.charAt(i), 2).intValue();
                temp = "";
            } else {
                temp += String.valueOf(s.charAt(i));
            }
        }
        return answer;
    }

    public String solution2(int c, String s) {
        String answer = "";
        for (int i = 0; i < c; i++) {
            String temp = s.substring(0, 7).replace("*", "0").replace("#", "1");
            answer += (char) Integer.parseInt(temp, 2);
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int c = kb.nextInt();
        String s = kb.next();

        Main main = new Main();
        System.out.println(main.solution2(c, s));
    }
}
