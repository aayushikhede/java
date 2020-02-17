

import java.util.Scanner;

public class Dowhile2{
 public static void main(String args[]) {
       int number,sum =0;
       Scanner s = new Scanner(System.in);
       do{
    	   System.out.println("enter a number :");
    	   number = s.nextInt();
    	   sum += number;
       }while(number!=0 );
       {
    	   System.out.println("Sum =" +sum);
       }
	}

}
