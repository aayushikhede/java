

import java.util.Scanner;

public class Dowhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number ,sum=0;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("enter a number ");
			number = input.nextInt();
			sum += number;
			
		}while(number!=0);
		System.out.println("sum "+sum);

	}

}
