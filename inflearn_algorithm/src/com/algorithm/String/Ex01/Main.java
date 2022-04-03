package com.algorithm.String.Ex01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String next1 = in.next();
        String next2 = in.next();

        int count = 0;
        for (Character c : next1.toCharArray()) {
            if (c.toString().toLowerCase().equals(next2.toLowerCase()))
                count++;
        }

        System.out.println(count);
        return;
    }
}