package dimik.online.sbmission;

import java.util.Scanner;

public class Prob5BoxSquare {

    public static void main(String[] args) {

        int t, i, j, k;
        Scanner input= new Scanner(System.in);

        t=input.nextInt();

        for(i=1; i<=t; i++) {
            int n=input.nextInt();
            for(j=1; j<=n; j++){
                for(k=1; k<=n; k++){
                    System.out.print("*");
                }
                System.out.println();

            }
            System.out.println();
        }
    }
}
