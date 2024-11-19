package arrays;

public class RomanToInt {
	
	
	
	//xii ->12
	//xxiv
	//I, II, III, IV, V, VI, VII, VIII, IX, X
	
	static int getIntVal(char s) {
		if(s=='X') {
			return 10;
		}
		if(s=='V') {
			return 5;
		}
		if(s=='I') {
			return 1;
		}
		
		
		return 0;
	}
	
	static int getIntfromRoman(String roman) {
		int oneSum=0;
		 
		int tensCount=0;
		int fiveCount=0;
		for(int i=0;i<roman.length();i++) {
			if(roman.charAt(i)=='X'&&roman.charAt(0)=='X'){
				tensCount++;
			}
			if(roman.charAt(i)=='V'){
				fiveCount++;
			}
			if(roman.charAt(i)=='I'&&(roman.charAt(i+1)=='X'||roman.charAt(i+1)=='V')) {
				oneSum-=1;
			}
			else if(roman.charAt(i)=='I') {
				oneSum+=1;
			}
			
			return oneSum+(tensCount*10)+(fiveCount*5);
			
			
		}
		
		
		return 0;
	}
	static int getIntfromRoman2(String roman) {
		int sum = 0;
		for( int i=0;i<roman.length();i++) {
			int s1=getIntVal(roman.charAt(i));
			if(i+1<roman.length()) {
				int s2=getIntVal(roman.charAt(i+1));
				if(s1>=s2) {
					sum+=s1;
				}
				else {
					sum+=s2-s1; 
					i++;

				}
			}
			else {
			sum+=s1;}
			 
		}
		return sum;
		
	}
	
	 public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
            case 'M': num = 1000; break;
            } 
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;

}
	    public String intToRoman(int num) {
	         int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    final String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	StringBuffer ans=new StringBuffer();
	        

	        for (int i=0;num>0;i++){
	    while(num>=val[i]){
	        ans.append(rom[i]);
	            num-=val[i];
	    }
	} 
	 return ans.toString()      ; 
	    } 

}
