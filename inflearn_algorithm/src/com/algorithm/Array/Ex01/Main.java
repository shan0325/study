package com.algorithm.Array.Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String solution(int n, int[] arr) {
        String answer = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] < arr[i]) answer += " " + arr[i];
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
