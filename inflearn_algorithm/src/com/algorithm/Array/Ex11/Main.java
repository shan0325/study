package com.algorithm.Array.Ex11;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        int[] members = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = 0;
            boolean[] tempArr = new boolean[n];
            for (int j = 0; j < arr[i].length; j++) {
                int target = arr[i][j];
                for (int k = 0; k < n; k++) {
                    if(i != k && !tempArr[k] && target == arr[k][j]) {
                        temp++;
                        tempArr[k] = true;
                    }
                }
            }
            members[i] = temp;
        }

        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(temp < members[i]) {
                answer = i;
                temp = members[i];
            }
        }
        return answer + 1;
    }

    public int solution2(int n, int[][] arr) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(kb.next());
            }
        }

        Main main = new Main();
        System.out.println(main.solution2(n, arr));
    }
}
