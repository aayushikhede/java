

import java.util.Scanner;

public class Loops {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


