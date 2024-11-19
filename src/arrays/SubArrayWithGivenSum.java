   package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
	
	public static void subArraySum(int [] arr,int sum) {
		int start=0;
		int currSum=arr[0];
		for(int i=1;i<=arr.length;i++) {
			while(currSum>sum&start< i-1) {
				currSum=-arr[start];
				start++;
			}
			 if(currSum==sum) {
				int p=i-1;
				System.out.println(start+"   bw "+p);
			}
			if(i<arr.length) {
				currSum=+arr[i];
			}
 
		}  
		
	}
	   static int maxProfit(int prices[], int size)
	    {      
	  
	        // maxProfit adds up the difference between
	        // adjacent elements if they are in increasing order
	        int maxProfit = 0;
	  
	        // The loop starts from 1
	        // as its comparing with the previous
	        for (int i = 1; i < size; i++)
	            if (prices[i] > prices[i - 1])
  	                maxProfit += prices[i] - prices[i - 1];
	        return maxProfit;
	    }
	   static void longsetCommonString(String[] s)
	   {
		   String prefix=s[0];
		   for( int i=1;i<s.length;i++) {
			   while(s[i].indexOf(prefix)!=0) {
				   prefix=prefix.substring(0,prefix.length()-1);
			   }
		   }
		   System.out.println(prefix);;
	   }   
	   //nlogn time  space 01    
	   static void pairSum(int[] s,int sum)
	   {
		   int lo=0;
		   int hi=s.length-1;
		   
		  while(lo<hi) {
			 int k= s[lo]+s[hi];
			  if(k==sum) {
				  System.out.println(s[lo]+" "+s[hi]);
			  }
			  else if(k>sum) {
				 hi--;
			  }
			  else if(k<sum) {
					 lo++;
				  }
		  }
		   System.out.println();
	   }
	   //o(n) both time and space
	   public static void printPairs(int[] arr, int n, int sum) {
	        Set<Integer> s = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            int temp = sum - arr[i];//if index required will use map
	            if (s.contains(temp)) {
	                System.out.println("(" + temp + ", " + arr[i] + ")");
	            }
	            s.add(arr[i]);
	        }
	    }
	   
	   
	public static void main(String[] args) {
		
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, sum);
        String [] strs = {"flower","flow","flight"};
        longsetCommonString(strs); 
	}
}
