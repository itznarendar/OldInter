package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestClassCollections {

	public static void main(String[] args) {
		List<Integer> listOld=new ArrayList();
		listOld.add(1);
		listOld.add(2);
		listOld.add(3);
		listOld.add(4);
		listOld.add(5);
		for(Integer num:listOld) {
			System.out.println(num);
		}

		//new java9 unmodifiable list/immutable not allowing null
		List<Integer> newList=List.of(1, 2, 3, 4, 5);		
		for(Integer num:newList) {
			System.out.println(num);
		}
		//small no.elements use case and threadsafe
		Set<Integer> newSet=Set.of(1,2, 3, 4, 5);
		//newSet.add(7); due to immutable list error java.lang.UnsupportedOperationException
		for(Integer num:newSet) {
			System.out.println(num);
		}
		//null not allowed both key and value
Map<Integer,String> map=Map.of(1, "a", 2, "b", 3, "c", 4, "d", 5, "e");
		
		map.entrySet().forEach( (entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		Map.Entry<Integer, String> entry1=Map.entry(1, "a");
		Map.Entry<Integer, String> entry2=Map.entry(2, "b");
		Map.Entry<Integer, String> entry3=Map.entry(3, "c");
		Map.Entry<Integer, String> entry4=Map.entry(4, "d");
		Map.Entry<Integer, String> entry5=Map.entry(5, "e");
  Map<Integer,String> entrymap=Map.ofEntries(entry1,entry2,entry3,entry4,entry5);
  entrymap.entrySet().forEach(System.out::println );
  
  //unmodifieble
	List<Integer> unmodieableList=List.copyOf(listOld);		
	listOld.add(6);
	//unmodieableList.add(6);
	for(Integer num:unmodieableList) {
		System.out.println(num);
	}

  var s="hhh";
  System.out.println(s);
	}
}
