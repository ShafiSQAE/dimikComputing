package dimik.online.sbmission;

import java.util.Scanner;

public class Prob5SumOfFirstAndLastDigit {

    public static void main(String[] args) {

        int t,sum,first_digit=0,last_digit,i,number;

        Scanner input= new Scanner(System.in);

        t= input.nextInt();

        for(i=1; i<=t; i++){

            number=input.nextInt();
                 last_digit=number%10;
                while(number!=0){
                    first_digit=number%10;
                    number=number/10;
                }

            sum=first_digit+last_digit;
            System.out.println("Sum = "+sum);

            }

    }
}


