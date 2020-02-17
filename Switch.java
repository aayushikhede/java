

public class Switch {
	public static void main(String[] args)
	{
      int  month=7;
      java.lang.String season = null;
      switch(month)
      {
    	  case 12:
    	  case 1:
    	  case 2:
    	  season="winter";
    	  break;

    	  case 3:
    	  case 4:
    	  case 5:
    	  season="spring";
    	  break;

    	  case 6:
    	  case 7:
    	  case 8:
    	  season="summer";
    	  break;
    	  
    	  default:
    		 season="nothing";
      }
      System.out.println("the month is :"+season);
	}	
}


