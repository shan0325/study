package com.algorithm.Array.Ex09;

import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int rowMax = 0, colMax = 0, dia1 = 0, dia2 = 0;

        for (int i = 0; i < n; i++) {
            int temp = 0;
            int temp2 = 0;
            for (int j = 0; j < n; j++) {
                temp += arr[i][j];
                temp2 += arr[j][i];
            }
            if(temp > rowMax) rowMax = temp;
            if(temp2 > colMax) colMax = temp2;
            dia1 += arr[i][i];
            dia2 += arr[i][n - (i + 1)];
        }
        return Arrays.asList(rowMax, colMax, dia1, dia2).stream().mapToInt(x -> x).max().orElse(0);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(kb.next());
            }
        }

        Main main = new Main();
        System.out.println(main.solution(n, arr));
    }
}
