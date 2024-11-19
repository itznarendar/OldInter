package Strings;


public class BinaryAddSolution {
	//sdd two binary nums
	static String solutionbinary(String a, String b) {
		int i=a.length()-1;
		int j=b.length()-1;
		int rem=0;
		StringBuilder builder=new StringBuilder();

		while(i>=0||j>=0){ 
		    int sum=rem;
		    if(j>=0) sum+=Character.getNumericValue(b.charAt(j--));
		        if(i>=0) sum+=Character.getNumericValue(a.charAt(i--));
		        builder.append(sum%2);
		rem=sum/2;
		}
		if(rem!=0) builder.append(rem);
		String res=builder.reverse().toString();
		System.out.println(res);
		return res;


		}


	static String solutionbinary2(String a, String b) {
	    int i = a.length() - 1;
	    int j = b.length() - 1;
	    int rem = 0;  // rem is used for carry
	    StringBuilder builder = new StringBuilder();

	    // Loop while either string has digits left to process
	    while (i >= 0 || j >= 0) { 
	        int sum = rem;  // Start with the carry

	        // Add digits from string b if any left
	        if (j >= 0) sum += Character.getNumericValue(b.charAt(j--));
	        
	        // Add digits from string a if any left
	        if (i >= 0) sum += Character.getNumericValue(a.charAt(i--));
	        
	        // Append the result of sum % 2 (either 0 or 1, the current binary digit)
	        builder.append(sum % 2);
	        
	        // Calculate carry for the next iteration
	        rem = sum / 2;
	    }

	    // If there is a carry left, append it
	    if (rem != 0) builder.append(rem);
	    
	    // Reverse to correct the order (since we appended from least significant bit to most)
	    return builder.reverse().toString();
	}

	        
	
	// Returns sum of two numbers
	static String add(String a, String b) {
		Long sum=0L;
		int count=0;

		if(a.length()>b.length())
		{
			
			for(int i=a.length()-1;i>=0;i--) {
				int counter=count==0?1:count*10;
			    var sum1=convertCharToNum(b.charAt(i))+(i<a.length()?convertCharToNum(a.charAt(i)):0L); 
 
				sum+=convertCharToNum(a.charAt(i))+(i<b.length()?convertCharToNum(b.charAt(i)):0L);
				sum+=counter==0?sum*1:sum1*counter;
count++;
			}
		
		}
		else {
			for(int i=b.length()-1;i>=0;i--) {
				int counter=count*10;
			    var sum1=convertCharToNum(b.charAt(i))+(i<a.length()?convertCharToNum(a.charAt(i)):0L);
			    System.out.println(sum+"====");
				sum+=counter==0?sum1*1:sum1*counter;
				count++;
			    System.out.println(sum+" sum"+sum1+" counter"+counter);
 
			}
		}
		System.out.println("sum adddd :::::"+sum);
		 return sum.toString();
	}
	
	static String add1(String a, String b) {
	    Long sum = 0L;  // To hold the total sum
	    int count = 0;  // To track the current digit place

	    // Make sure a is the longer string; if not, swap them
	    if (a.length() < b.length()) {
	        String temp = a;
	        a = b;
	        b = temp;
	    }

	    // Start iterating from the last digit
	    for (int i = 0; i < a.length(); i++) { 
	        int counter = (int) Math.pow(10, count); // 1, 10, 100, 1000, etc.
	        long digitA = convertCharToNum(a.charAt(a.length() - 1 - i)); // Get digit from a
	        long digitB = (i < b.length()) ? convertCharToNum(b.charAt(b.length() - 1 - i)) : 0; // Get digit from b or 0 if out of bounds
	        
	        // Update the sum based on the current digits and their place value
	        sum += (digitA + digitB) * counter;
	        count++;  // Move to the next place value
	    }
		System.out.println("sum111 adddd :::::"+sum);

	    return sum.toString();  // Return the sum as a string
	}

	// Helper method to convert a character to a number
	static long convertCharToNum1(char c) {
	    return c - '0'; // Converts '0' to 0, '1' to 1, ..., '9' to 9
	}

	
	static Long convertCharToNum(char a) {
		System.out.println(a);
		String s=a+"";
		Long num=Long.parseLong(s);
		
		return num;
		
		
	}
	public static void main(String [] args) {
		System.out.println(solutionbinary("100","101 "));
		System.out.println(solutionbinary2("100","101 "));

		System.out.println(add("12","20"));
		System.out.println(add1("12","20"));


	}
	
}

