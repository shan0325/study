package com.algorithm.Array.Ex05;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0;

        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if(prime[i] == 0) answer++;
            else continue;

            for (int j = i; j <= n; j = j + i) {
                prime[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        Main main = new Main();
        System.out.println(main.solution(n));
    }
}
