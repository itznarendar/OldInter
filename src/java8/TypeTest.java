package java8;

import java.util.List;

public class TypeTest {
	
	//var a=8; canno use here aswell as parameters
	 {
		int b=10;
		  System.out.println(b);
			var c=20;
			//var must intialize
			  System.out.println(c);


	}
	 
	 public int getNum() {
		 return 100;
	 }
	public static void main(String[] args) {

	  var s="hhh";
	  System.out.println(s);
	  TypeTest t=new TypeTest();
	  var list=List.of("1", "2", "3");
	  for(var a:list) {
		  System.out.println(a);
	  }

	  var num=t.getNum();
	  System.out.println(num);
}}
