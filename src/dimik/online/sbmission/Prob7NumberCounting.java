package dimik.online.sbmission;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob7NumberCounting {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int t=input.nextInt();

        for(int i=1; i<=t; i++){

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int j = 1; j <= 10 ; j++) {
                numbers.add(j); // Add elements to the ArrayList using the add() method
                int len= numbers.size();
                System.out.println(len);

            }



        }
    }

}
