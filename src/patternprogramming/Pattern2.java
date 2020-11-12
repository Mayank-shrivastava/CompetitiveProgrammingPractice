/*   Created by IntelliJ IDEA.
 *   Author: Mayank Shrivastava.
 *   Date: 12-11-2020
 *   Time: 22:45
 *   File: Pattern2.java
 */

package patternprogramming;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= ((rows + 1) - i); j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}

