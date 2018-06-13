import java.util.Scanner;

public class SubArray {
	
	public static void main(String args[]) {
		
		int n;
	    Scanner s = new Scanner(System.in);
	     System.out.println("Enter number of elements in the array:");
	     n = s.nextInt();
	     int a[] = new int[n];
	     
	     System.out.println("Enter elements of array: ");
	     for(int i = 0; i < n; i++)
	     {
	         a[i] = s.nextInt();
	     }
	     s.close();
	     
	     /*
	      int arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2};
            int n = arr.length; 
	 
	      */
	   
	        int count=1, max=1;
	        for(int i=0;i<n-1;i++)
	        {
	            if(a[i+1]>a[i])
	            {
	                count++;
	                if(count>max)
	                    max=count;
	            } 
	            else {
	                count = 1;
	            }
	        }
	     
	            System.out.println("Largest length of longest increasing sub array :"+max);
	     
	}

}
