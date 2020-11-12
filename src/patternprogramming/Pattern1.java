/*   Created by IntelliJ IDEA.
 *   Author: Mayank Shrivastava.
 *   Date: 12-11-2020
 *   Time: 22:28
 *   File: Pattern1.java
 */

package patternprogramming;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}

