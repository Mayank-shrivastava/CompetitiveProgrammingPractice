/*   Created by IntelliJ IDEA.
 *   Author: Mayank Shrivastava.
 *   Date: 04-11-2020
 *   Time: 22:24
 *   File: SplitHouses.java
 */

package hackerearth.basicprogramming;

import java.util.Scanner;

public class SplitHouses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gridCount = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        int flag = 1;
        char[] stringCharacter = str.toCharArray();
        for (int i = 0; i < stringCharacter.length - 1; i++) {
            if (stringCharacter[i] == 'H' && stringCharacter[i + 1] == 'H') {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            str = str.replace('.', 'B');
            System.out.println(str);
        }
    }
}

