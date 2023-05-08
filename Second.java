//Find the sum of element of array using while loop
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int[] num ={2,3,5,6,7};
        int result=0;
        int i;
        for( i=0; i<num.length ; i++){
            result= result + num[i];
            System.out.println("Sum is"+result);

        }

    }


}
