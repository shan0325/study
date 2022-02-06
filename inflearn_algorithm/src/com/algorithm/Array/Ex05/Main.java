package com.algorithm.Array.Ex05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0;

        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
        System.out.println(Arrays.toString(prime));
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        Main main = new Main();
        System.out.println(main.solution(n));
    }
}
