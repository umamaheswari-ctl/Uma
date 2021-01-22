package com.uma.training;

/* Enter your code here. Read input from STDIN. Print output to STDOUT */

import java.util.Scanner;

public class Solution1 {

    static int reduce(String s) {
        int a = 0, b = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                a++;
            }
            if (ch == 'b') {
                b++;
            }
            if (ch == 'c') {
                c++;
            }
        }
        // System.out.println(a + " " + b + " " + c);
        if ((a + b) == 0) {
            return c;
        }
        if ((a + c) == 0) {
            return b;
        }
        if ((b + c) == 0) {
            return a;
        }

        a &= 1;
        b &= 1;
        c &= 1;

        int x = a + b + c;
        if (x == 0 || x == 3) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);	
//        String line = sc.nextLine();
    	String line="ccccc";
        int count = Integer.parseInt(line, 10);

        for (int i = 0; i < count; i++) {
//            line = sc.nextLine();
            int x = reduce(line);
            System.out.println(x);
        }

    }
}