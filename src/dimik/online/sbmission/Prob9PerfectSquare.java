package dimik.online.sbmission;

import java.util.Scanner;

public class Prob9PerfectSquare {
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {

            // Find floating point value of
            // square root of x.
            int sr = (int)Math.sqrt(x);

            // if product of square root
            // is equal, then
            // return T/F

            return ((sr * sr) == x);
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int x = input.nextInt();
            if (isPerfectSquare(x))
                System.out.print("Yes");
            else
                System.out.print("No");
        }

    }
}

