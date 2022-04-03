package com.algorithm.Array.Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                answer++;
                temp = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String s = kb.nextLine();

        Main main = new Main();
        System.out.println(main.solution(n, Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()));
    }
}
