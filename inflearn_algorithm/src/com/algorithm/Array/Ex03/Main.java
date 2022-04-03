package com.algorithm.Array.Ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<String> solution(int n, int[] aArr, int[] bArr) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String result = "";
            if (aArr[i] == bArr[i]) {
                result = "D";
            } else if (aArr[i] == 1) {
                result = bArr[i] == 2 ? "B" : "A";
            } else if (aArr[i] == 2) {
                result = bArr[i] == 3 ? "B" : "A";
            } else if (aArr[i] == 3) {
                result = bArr[i] == 1 ? "B" : "A";
            }
            answer.add(result);
        }
        return answer;
    }

    public List<String> solution2(int n, int[] aArr, int[] bArr) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String result = "";
            if (aArr[i] == bArr[i]) {
                result = "D";
            } else if (aArr[i] == 1 && bArr[i] == 3) {
                result = "A";
            } else if (aArr[i] == 2 && bArr[i] == 1) {
                result = "A";
            } else if (aArr[i] == 3 && bArr[i] == 2) {
                result = "A";
            } else {
                result = "B";
            }
            answer.add(result);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String a = kb.nextLine();
        String b = kb.nextLine();

        Main main = new Main();
        int[] aArr = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bArr = Arrays.stream(b.split(" ")).mapToInt(Integer::parseInt).toArray();
        main.solution2(n, aArr, bArr).stream().forEach(System.out::println);
    }
}
