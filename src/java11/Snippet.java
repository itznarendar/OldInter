package java11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Snippet {
	class Name{
		String a,b;
		Name(String a,String b){
			this.a=a;
			this.b=b;
		}
		public String getFirstName() {
			return a;
		}
		public String getLname() {
			return b;
		}
	}
	
	
	
	public static void main(String[] args) {
	        HashMap<Integer, Name> hmap = new HashMap<Integer, Name>();
	        Name name1 = new Name("Jayant", "Verma");
	        Name name2 = new Name("Ajay", "Gupta");
	        Name name3 = new Name("Mohan", "Sharma");
	        Name name4 = new Name("Rahul", "Dev");
	
	
	        hmap.put(9, name1);
	        hmap.put(1, name2);
	        hmap.put(6, name3);
	        hmap.put(55, name4);
	
	        Comparator<Name> byName = (Name obj1, Name obj2) -> obj1.getFirstName().compareTo(obj2.getFirstName());
	
	        LinkedHashMap<Integer, Name> sortedMap = hmap.entrySet().stream()
	                .sorted(Map.Entry.<Integer, Name>comparingByValue(byName)
	                	)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	        
	//printing the sorted hashmap 
	        Set set = sortedMap.entrySet();
	        Iterator iterator = set.iterator();
	        while (iterator.hasNext()) {
	            Map.Entry me2 = (Map.Entry) iterator.next();
	            System.out.print(me2.getKey() + ": ");
	         System.out.println(hmap.get(me2.getKey()).firstName + " "+hmap.get(me2.getKey()).lastName );
	          
	        }
	    }
}

