package dimik.online.sbmission;

public class Problem3DesendingOrderNumbers {

    public static void main(String[] args) {

        int count=0;

        for(int i=1000; i>=1; i--){
            System.out.print(i+"\t");
            count++;

            if(count%5==0){
                System.out.println();
            }

        }
    }
}
