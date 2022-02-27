package com.algorithm.TwoPointers.Ex01;

import java.util.Scanner;

public class Main {
    public String solution(int[] arr, int[] arr2) {
        String answer = "";

        int index = 0;
        int index2 = 0;
        int index3 = 0;
        while(index3 < arr.length + arr2.length) {
            int n = index < arr.length ? arr[index] : Integer.MAX_VALUE;
            int n2 = index2 < arr2.length ? arr2[index2] : Integer.MAX_VALUE;
            if(n < n2) {
                answer += n + " ";
                index++;
            } else {
                answer += n2 + " ";
                index2++;
            }
            index3++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(kb.next());
            arr[i] = num;
        }

        n = Integer.parseInt(kb.next());
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(kb.next());
            arr2[i] = num;
        }

        Main main = new Main();
        System.out.println(main.solution(arr, arr2));
    }
}
