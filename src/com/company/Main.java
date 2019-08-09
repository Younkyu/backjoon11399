package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int result = 0;

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        Arrays.stream(arr).reduce(0, (p,v) -> {
            int sum = p + v;
            result += sum;
            return sum;
        });

        System.out.println(result);
    }
}
