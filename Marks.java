

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int maths,physics,chem,english,total,avg;
				Scanner input = new Scanner(System.in);
			
					System.out.println("enter a number of maths out of 100 ");
					maths = input.nextInt();
					
					
					System.out.println("enter a number of physics physout of 100 ");
					physics = input.nextInt();
					
					
					System.out.println("enter a number of chem out of 100 ");
					chem = input.nextInt();
					
					
					System.out.println("enter a number of english out of 100 ");
					english = input.nextInt();
					
                  total= maths+physics+chem+english;
                  System.out.println("total marks are "+total);
                  
                  avg= (total*100)/400;
                  System.out.println("percentage is :" +avg);
                  
                  if(avg<50)
                  {
                	  System.out.println("grade is D");
                  }
                  else if(avg>50 && avg<60)
                  {
                	  System.out.println("grade is C");
                  }
                  else if(avg>60 && avg<70)
                  {
                	  System.out.println("grade is B");
                  }
                  else if(avg>70 && avg<80)
                  {
                	  System.out.println("grade is B+");
                  }
                  else if(avg>80 && avg<90)
                  {
                	  System.out.println("grade is A");
                  }
                  else
                  {
                	  System.out.println("grade is A+");
                  }
	}

}
