/*   Created by IntelliJ IDEA.
 *   Author: Mayank Shrivastava.
 *   Date: 04-11-2020
 *   Time: 20:46
 *   File: CostOfBalloons.java
 */

package hackerearth.basicprogramming;

import java.util.Scanner;

public class CostOfBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int cg = sc.nextInt(), cp = sc.nextInt();
            int noOfParticipants = sc.nextInt();
            int[][] participantsResults = new int[noOfParticipants][2];
            for (int i = 0; i < noOfParticipants; i++) {
                participantsResults[i][0] = sc.nextInt();
                participantsResults[i][1] = sc.nextInt();
            }
            int totalFirstAns = 0, totalSecondAns = 0;
            for (int i = 0; i < noOfParticipants; i++) {
                if (participantsResults[i][0] == 1) totalFirstAns++;
                if (participantsResults[i][1] == 1) totalSecondAns++;
            }
            int x = cp * totalFirstAns + cg * totalSecondAns;
            int y = cp * totalSecondAns + cg * totalFirstAns;
            if (x > y) System.out.println(y);
            else System.out.println(x);
        }
    }
}

