package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyDemo 

{

	public static void main(String[] args) 
	
	{
		
		Vector<Integer> v = new Vector<Integer>();
		
	    for(int i=1;i<=10;i++)
	    {
	    	v.add(i);
	    	
	    	System.out.println(v);
	    	
	   Enumeration<Integer> var =v.elements();	
	   
	   while(var.hasMoreElements())
	   {
		   Integer I = var.nextElement();
		   
		   if(I%2==0)
			   System.out.println(I);		   
	   }
	   
	   System.out.println(v);
	    	
	    }

	}

}
