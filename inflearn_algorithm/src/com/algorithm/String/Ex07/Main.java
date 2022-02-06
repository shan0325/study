package com.algorithm.String.Ex07;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "No";

        String reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverseStr)) {
            answer = "YES";
        }
        return answer;
    }

    public String solution2(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if(!String.valueOf(str.charAt(i)).toLowerCase().equals(String.valueOf(str.charAt(str.length() - 1 - i)).toLowerCase())) {
                return "NO";
            }
        }
        return "YES";
    }

    public String solution3(String str) {
        String answer = "YES";

        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if(!String.valueOf(str.charAt(lt)).toLowerCase().equals(String.valueOf(str.charAt(rt)).toLowerCase())) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
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
