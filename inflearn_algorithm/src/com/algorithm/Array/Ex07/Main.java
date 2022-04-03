package com.algorithm.Array.Ex07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int[] nums) {
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                temp = 0;
            }
            answer += temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String[] numsStr = kb.nextLine().split(" ");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        Main main = new Main();
        System.out.println(main.solution(n, nums));
    }
}
