package dimik.online.sbmission;

import java.util.Arrays;
import java.util.Scanner;

public class Prob8MinToMaxNumbers {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] numbers= new int[3];

        int t=input.nextInt();
        for(int i=1; i<=t; i++) {

            for (int j = 0; j < 3; j++) {
                numbers[j] = input.nextInt();

            }
            Arrays.sort(numbers);
            System.out.printf("Case "+i+":");
            System.out.println(Arrays.toString(numbers));
        }
    }
}
