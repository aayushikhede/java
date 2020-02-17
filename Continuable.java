

public class Continuable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      outer: for(int i=0;i<10;i++)
      {
    	  for(int j=0;j<10;j++)
    	  {
    		  if(j>i)
    		  {
    			  System.out.println();
    			  continue outer;
    		  }
    		  System.out.println(" "+(i*j));
    	  }
    	  
      }
	}

}
