package newArray;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
 public class NewArray {
	public static void main(String[]args) {
		/* Scanner kb = new Scanner(System.in);
		 System.out.println("Please enter amount of elements");
		 int amount = kb.nextInt();
		 int[] arr = new int[amount];
		 Random ran = new Random();
		 
		 for(int i = 0 ; i< arr.length; i++)
		 {
			 arr[i] = ran.nextInt(100);
			 
		 }
		 System.out.println(" All the elements is:" + Arrays.toString(arr));
		 int min = arr[0];
		 for(int i = 0 ; i< arr.length; i++)
		 {
			 if(min > arr[i])
			 {
				 min = arr[i];
			 }
		 }
		System.out.println("The smallest number is " + min);
		
		int [] newArray = new int[arr.length +1];
		System.arraycopy(arr, 0, newArray, 1, newArray.length -1  );
		
		 newArray[0] = min;
		 System.out.println("The new array is" + Arrays.toString(newArray));
		*/
		Scanner kb = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Please enter amount of elements");
		int amount = kb.nextInt();
		int [ ]arr = new int[amount];
		for(int i = 0 ; i<arr.length ; i++)
		{
			arr[i] = ran.nextInt(100);
		}
		System.out.println("The arrays is:" + Arrays.toString(arr));
		int min = arr[0];
		
		for(int i = 1; i <arr.length; i++ )
		{
		     if(min > arr[i])
		     {
		    	 min = arr[i];
		     }
		     
		}
		System.out.println("The smallest number is:" + min);
		
		int [] newArray = new int[arr.length + 1];
		System.arraycopy(arr, 0, newArray, 1, newArray.length -1 );
		newArray[0] = min;
		System.out.println("The new array is :" + Arrays.toString(newArray));
		
		
		
	}

}
