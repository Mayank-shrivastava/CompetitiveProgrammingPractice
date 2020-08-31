/*   Created by IntelliJ IDEA.
 *   Author: Mayank Shrivastava.
 *   Date: 31-08-2020
 *   Time: 19:11
 *   File: FindNumberOfDigits.java
 */

package Mathematics;

import java.util.Scanner;

// There are two ways of finding the number of digits a number contains:
//    1.counting one by one number and add this to the counter variable until the number is zero. O(digitCount)
//    2.By using formula floor(log(N) + 1). O(1)
public class FindNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        //Method - 1
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        System.out.printf("%d has total number of digits is equals to %d\n", number, digitCount);
        //Method - 2
        double ans = 1 + Math.floor(Math.log10(number));
        int actualAns = (int) ans;
        System.out.println(actualAns);
    }
}

