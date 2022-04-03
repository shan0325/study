package com.algorithm.Array.Ex12;

import java.util.*;

public class Main {
    public int solution(int N, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer += search(i, arr);
        }
        return answer;
    }

    public int search(int target, int[][] arr) {
        Boolean[] check = new Boolean[arr[0].length];
        Arrays.fill(check, true);

        for (int i = 0; i < arr.length; i++) {
            boolean isFinded = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (!isFinded) check[arr[i][j] - 1] = false;
                if (arr[i][j] == target) isFinded = true;
            }
        }
        return (int) Arrays.stream(check).filter(b -> b).count();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        int N = Integer.parseInt(a.split(" ")[0]);
        int M = Integer.parseInt(a.split(" ")[1]);

        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            String b = kb.nextLine();
            arr[i] = Arrays.stream(b.split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Main main = new Main();
        System.out.println(main.solution(N, arr));
    }
}
