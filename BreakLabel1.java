

public class BreakLabel1 {

	public static void main(String[] args) {
       int x,y;
       outer:
    	   for(x=0;x<3;x++)
    	   {
    		   System.out.println("outer.. "+x);
    		   inner :
    			   for(y=0;y<5;y++)
    			   {if(y==2)
    				   break inner;
    				   
    				   System.out.println("y :"+y);
    			   }
    	   }
       
	}

}
