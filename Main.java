//WAP to find whether the number is prime or not
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,i,count =0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=s.nextInt();

        for(i=2 ; i<num ; i++) {
            if(num%i == 0){
                count++;
                break;
            }
        }
        if (count==0)
            System.out.println("\n <<<< It is a Prime Number >>>>");
        else
            System.out.println("\n >>>> It is not Prime Number <<<<");
            {

        }





    }
}