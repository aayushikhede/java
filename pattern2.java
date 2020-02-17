

public class pattern2 {
  void test(){
	  
	       int i,j,k =1;
	       for(i=0;i<5;i++)
	       {
	    	   for(j=0;j<k;j++)
	    	   {
	    		   
	    		   System.out.print("*");
	    	   }
	    	   k=k+1;
	          System.out.println();
	       }
	       
		}
  public static void main(String args[])
  {
	  pattern2 p = new pattern2();
	  p.test();
  }

	}


