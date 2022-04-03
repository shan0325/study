package com.algorithm.Array.Ex09;

import java.util.*;

/**
 * 9. 격자판 최대합
 * <p>
 * 설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * Image1.jpg
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * <p>
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * <p>
 * 출력
 * 최대합을 출력합니다.
 * <p>
 * 예시 입력 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * <p>
 * 예시 출력 1
 * 155
 */
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
            if (temp > rowMax) rowMax = temp;
            if (temp2 > colMax) colMax = temp2;
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