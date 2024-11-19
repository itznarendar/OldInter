package java11;

interface TestI{
	int add(int a,int b);
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestI test=( a,b)->a+b;
		System.out.println(test.add(1, 2));
		//annoataion support @Notnull for var
		TestI t=( var a, var b)->a+b;
		System.out.println(t.add(1, 2));
int [] arr= {1,2,3,4,5};
for(int i=0;i<arr.length-2;++i) {
	System.out.println(arr[i]);
}
for(int i=0;i<arr.length-2;i++) {
	System.out.println(arr[i]);
}

	}

}
