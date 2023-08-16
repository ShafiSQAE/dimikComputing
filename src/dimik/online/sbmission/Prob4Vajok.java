package dimik.online.sbmission;

import java.util.Scanner;

public class Prob4Vajok {
    public static void main(String[] args) {

        int i, j, t;
        Scanner input = new Scanner(System.in);

        t = input.nextInt();

        if (t <= 10) {

            for (i = 1; i <= t; i++) {
                int n = input.nextInt();
                System.out.print("Case " + i + ":");
                for (j = 1; j <= n; j++) {
                    if (n % j == 0) {
                        System.out.print(" "+j);
                    }
                }
                System.out.println();
            }
        }
        else

        {
            System.out.println("Enter a number between 1-10");
        }
    }

}

