package prime;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter range : from 2 to ?");
         int max = kb.nextInt();
         int[] arr = new int[max -1];

         for(int k = 0 ; k < arr.length; k++)
         {
        	 arr[k]= k+2;
         }
         
         
         int count = 0;
         for(int k = 0; k < arr.length; k++)
         { 	    
        	 boolean isPrime = true;
           	 for(int i=2 ; i< arr[k] ;i++) 
               {
        	      if(arr[k]%i == 0)
        	     {
        		 isPrime = false;
        	     }
               }
		     if(isPrime == true)
		     {
		    	  count++;
		    	  if(count % 10 == 0)
		    	  {
		    		  System.out.println();
		    	  }
		    	  else {
		    		  System.out.print(arr[k] + "\t");
		    	  }
		    	
		     }
           	 
         }
         System.out.println("Total prime is:" + count);
	}

}
