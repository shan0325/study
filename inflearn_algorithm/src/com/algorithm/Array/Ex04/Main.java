package com.algorithm.Array.Ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int recursive(int depth, int n, int num, int num2) {
        System.out.print(num2 + " ");
        if (depth == n) return num2;
        return recursive(depth + 1, n, num2, num + num2);
    }

    public void solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());

        Main main = new Main();
        main.solution(n);
//        main.recursive(1, n, 0, 1);
    }
}
