package java8;

import java.util.List;
import java.util.Arrays;

public class SafeVarArgsTest {
    @SafeVarargs
	private void printList(List<String> ...stringList) {
		for(List<String>list  :stringList) {
			System.out.println(list);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeVarArgsTest varArgs=new SafeVarArgsTest();
		varArgs.printList(Arrays.asList("SafeArgslsit"));
	}

}
