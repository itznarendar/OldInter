package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LengthLargestSubString {
public static int length(String s) {
	 Set<Character> set=new HashSet<Character>();
	 int j=0;
	 int i=0;
	 int max=0;
	 while(j<s.length()) {
		 System.out.println(j+"===="+s.charAt(i));

		 if(!set.contains(s.charAt(j))){
			 set.add(s.charAt(j++));
			 max=Math.max(max,set.size());
			 System.out.println(j+"===="+set.size());

			//j++;		  
		 }
		 else { 
			 System.out.println(j+"=remove==="+s.charAt(i));

			set.remove(s.charAt(i++));
			//i++;
		 }
		 
	 }
	 System.out.println(max+"=???===");
	
	return max;
	
	
}

public static String reduced_String(int k, String s) {
	 Stack<Character> stk = new Stack<Character>();
     int i = 0;
     while (i < s.length()) {
         char ch = s.charAt(i++);
         stk.push(ch);             
         int count = 0;
         while ((stk.size() > 0) && (stk.peek() == ch)) {
             count++;
             stk.pop();
         }
         if (count == k)
             continue;
         else {
             while (count > 0) {
                 stk.push(ch);  
                 count--;
             }
         }
     }
     StringBuilder sb = new StringBuilder();
     for (char ch : stk)
         sb = sb.append(ch);
     return sb.toString();

	
	
}

public static void removeConsecutiveDuplicates(String str) {
    StringBuilder result = new StringBuilder();
    
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i-1)) {
            str = str.substring(0, i-1) + str.substring(i+1);
            i = 0;
        }
    }
    if (str.length() == 0) {
        System.out.println("Empty String");
    } else {
        System.out.println (str);
    }
}

public static String reduced_String2(int k, String s) {
	 Stack<Character> stk = new Stack<Character>();
   // int i = 0;
    for  (int i=0;i < s.length();i++) {
        char ch = s.charAt(i);
        stk.push(ch);
        int count = 0;
        while ((stk.size() > 0) && (stk.peek() == ch)) {
            count++;
            stk.pop();
        }
        if (count == k)
            continue;
        else {
            while (count > 0) {
                stk.push(ch);
                count--;
            }
        }
    }
    StringBuilder sb = new StringBuilder();
    for (char ch : stk)
        sb = sb.append(ch);
    return sb.toString();

	
	
}


public static void  reverseWord(String s) {
	String [] words=s.split("//s");
	String rev="";
	for(int i=0;i<words.length;i++) {
	String curr=words[i];
     String revWord="";
	for(int j=0;j<curr.length();j++){
		revWord=curr.charAt(j)+revWord;
	}
	rev=revWord+rev;
	}
	System.out.println(rev);
    int len = s.length();
     IntStream.range(0, len)
             .map(i -> len - 1 - i)
             .mapToObj(j->s.charAt(j))
             .forEach(System.out::print);
     StringBuilder b=new StringBuilder(s);
 	System.out.println("==="+ b.reverse()+"===========");
 	
}
public static void uniqueCharacters(String test) {
	test.chars().distinct().mapToObj(c -> String.valueOf((char)c)).findFirst();
    System.out.println(test.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining()));
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max length f sub string"+length("abcaadpuyt"));
length("abcaadpuyt");
String input=  "abc200def150ghi200hyt";
Integer number=input.chars().filter(c->c>'0'&&c<'9').boxed().sorted(Collections.reverseOrder()).skip(1).map(i->i-'0').findFirst().orElse(1);
System.out.println("number ===  "+number);

ArrayList<Integer>num= new ArrayList<Integer>();
Set<Integer>num2= new HashSet<Integer>();
 
String str="143dja321kk5vas";
StringBuilder sb = new StringBuilder();
for(char c : input.toCharArray()){
    if(Character.isDigit(c)){
        sb.append(c);
        int value = Character.getNumericValue(c);
        num.add(value);

    } 
    else {
    	if(sb.length()>0)
    	num2.add(Integer.parseInt(sb.toString()));
    	sb.delete(0, sb.length());
    }
    
}


System.out.println(num);
System.out.println("=="+num2.stream().sorted(Collections.reverseOrder()).skip(1).findFirst());

Set<Integer> hs = new HashSet<Integer>();
hs.addAll(num);
num.clear();
num.addAll(hs);

Collections.reverse(num);
System.out.println(num);
System.out.println(num.get(num.size()-1));

String listString = "";

for (Integer s : num)
{
    listString += s ;
}

System.out.println(listString); 

long max = Stream.of("abc200def150ghi200hyt".replaceAll("^\\D+","").split("\\D+"))
.mapToLong(Long::parseLong)
.max().orElse(-1);
	
	System.out.println(" max "+listString);
	reverseWord("hello how are you");
	uniqueCharacters("hello how are you");
	
	
	System.out.println("=====reduced_String  "+reduced_String(3,"aabbcccbad"));
	System.out.println("=====reduced_String2  "+reduced_String2(3,"aabbcccbad"));

	}
	
}
