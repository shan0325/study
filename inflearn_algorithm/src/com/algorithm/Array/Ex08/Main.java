package com.algorithm.Array.Ex08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int n, int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if(nums[j] > nums[i]) {
                    rank++;
                }
            }
            list.add(rank);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String[] numsStr = kb.nextLine().split(" ");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        Main main = new Main();
        List<Integer> answer = main.solution(n, nums);
        answer.stream().forEach(s -> System.out.print(s + " "));
    }
}
