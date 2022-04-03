package com.algorithm.Array.Ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int n, int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(new StringBuilder(nums[i] + "").reverse().toString());
            if (num == 1) continue;

            int count = 0;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) list.add(num);
        }
        return list;
    }

    public List<Integer> solution2(int n, int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = nums[i];
            int num = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                num = num * 10 + t;
                tmp = tmp / 10;
            }
            if (num == 1) continue;

            int count = 0;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String[] numsStr = kb.nextLine().split(" ");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        Main main = new Main();
        List<Integer> answer = main.solution2(n, nums);
        answer.stream().forEach(s -> System.out.print(s + " "));
    }
}
