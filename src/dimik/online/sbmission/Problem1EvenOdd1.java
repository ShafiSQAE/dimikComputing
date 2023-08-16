package dimik.online.sbmission;

import java.util.Scanner;

public class Problem1EvenOdd1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int t= input.nextInt();


        for(int i=0; i<t; i++){

            int value= input.nextInt();
            if(value%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }


    }
}