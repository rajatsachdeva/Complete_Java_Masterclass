package com.rajatsachdeva;

//Java Loops II

import java.util.Scanner;

/**
 *
 *
 *
 Sample Input

 2
 0 2 10
 5 3 5
 Sample Output

 2 6 14 30 62 126 254 510 1022 2046
 8 14 26 50 98
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); // get q from user
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // print the series
            // get first element, sum in series
            int sum = (a + b);
            System.out.print(String.format("%d ", sum));

            for(int j = 1, z = 0; j < n; j++, z++) {
                // calculate next sum and add to previous
                sum += (int) (b * (Math.pow(2, j)));
                System.out.print(String.format("%d ", sum));
            }
            System.out.println();
        }
        in.close();
    }
}
