 package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sort.Employee2;
import sort.Subject;

public class ValidParenthesis {
	static boolean isValidParenthesis(String s) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push(')');
			}
			else if(s.charAt(i)=='[') {
				stack.push(']');
			}
			else if(s.charAt(i)=='{') {
				stack.push('}');
			}
			else if(stack.isEmpty()||stack.pop()!=s.charAt(i)) {
				return false;
			}
			 
		}  
		return stack.isEmpty();
	}
	
	private static int CHARACTER_RANGE= 256;

	public boolean isAnagramCounting(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    int count[] = new int[CHARACTER_RANGE];
	    for (int i = 0; i < string1.length(); i++) {
	        count[string1.charAt(i)]++;
	        count[string2.charAt(i)]--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	} 
	void segregate0and1(int arr[], int n) {
        int i=0;
        int j=n-1;
        while(j>=i){
            
            if(arr[i]==1 && arr[j]==0){
              //   swap(arr[i],arr[j]);
                i++;
                j--;
            }
            
          else  if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            } 
        }
    }
	
	static <T> Collector<T,?,List<T>> toSortedList(Comparator<? super T> c) {
	    return Collectors.collectingAndThen(
	        Collectors.toCollection(()->new TreeSet<>(c)), ArrayList::new);
	}
	public static void main(String [] args) {
System.out.println("is valid ?"+		isValidParenthesis("()[]"));
String s="hello how are you";
List<String> list=Arrays.asList(s.split(" "));
String o=list.stream().map(e->(e.substring(0, 1).toUpperCase()+e.substring(1, e.length())+" ")).collect(Collectors.joining("?"));
System.out.println( o);
List<Employee> listEmployee=new ArrayList<Employee>();
Employee e1=new Employee("name","3322","hyd",7000);
Employee e2=new Employee("remo","3323","hyd",6000);
Employee e3=new Employee("sumo","3325","hyd",6000);
Employee e4=new Employee("demo","3324","hyd",5000);

listEmployee.add(e1);
listEmployee.add(e2);
listEmployee.add(e3);
listEmployee.add(e4);

listEmployee.stream().filter(e->e.sal==6000).
sorted(Comparator.comparing(Employee ::getName)).collect(Collectors.toList()).forEach(System.out::println); 
listEmployee.stream().filter(e->e.sal==6000).
sorted(Comparator.comparing((Employee e)->e.getName())).collect(Collectors.toList()).forEach(System.out::println);;
Integer numsArray[]= {10,20,30};
Map mapE=listEmployee.stream().collect(Collectors.groupingBy(e->e.getId()));
Map mapE2=listEmployee.stream().collect(Collectors.toMap(e->e.getId(),e->e));
System.out.println("-----------------------------"); 

System.out.println(mapE+"mapE diff==============  \n "+mapE2);
ArrayList<Integer> list2=new ArrayList(Arrays.asList(numsArray));
list2.stream().filter(e->e<=6000).forEach(System.out::println);
List coList=list2.stream().filter(e->e<=6000).collect(()->new ArrayList<Integer>(),(list3,e)->list3.add(e),(list3,list4)->list3.addAll(list4));
System.out.println("BiCOn ==start="); 

coList.stream().forEach(System.out::println);
System.out.println("BiCOn ==end="); 
Map partionMap=list2.stream().collect(Collectors.partitioningBy(e->e%2==0));
Map partionMapSet=list2.stream().collect(Collectors.partitioningBy(e->e%2==0,Collectors.toSet() ));

System.out.println("Map ==part="+partionMap); 

Stream.of(numsArray).filter(e->e<=6000).forEach(System.out::println); 
//list1.stream().collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
Integer numsArray2[]= {10,20,30,40,40};

List<String> cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa");

Map<Integer, Long> counts = Stream.of(numsArray2)
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//list.sort((x,y)->x.getValue().compareTo(y.getValue()));
//list.stream().sorted(Map.Entry.comparingByValue()).forEach(e->			temp.put(e.getKey(), e.getValue()) 
System.out.println(counts+" CNTS");
Map<String, Integer> cardsLength=cards.stream().collect(Collectors.toMap(Function.identity(),String::length,(el1,el2)->el1,LinkedHashMap::new));
System.out.println(cardsLength+"==CL="); 
Map<String, Long> cardsLength2=cards.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
cards.stream().collect(Collectors.groupingBy(Function.identity())).values().forEach(l->l.sort((o1, o2) -> o1.compareTo(      o2)));

System.out.println(cardsLength2+"==CL222=");  
Map<Integer, List<String>> cardsLength3=cards.stream().collect(Collectors.groupingBy(String::length));
Map<Integer, Set<String>> cardsLength4=cards.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));

System.out.println(cardsLength3+"==cl33="); 

String s1="Hello How are you";
Set set1=new HashSet();
System.out.println("1=="+s1.chars().filter(c->set1.add((char)c)).mapToObj(c->(String.valueOf((char)c))).collect(Collectors.joining()));
System.out.println("2=="+s1.chars().distinct().mapToObj(c->(String.valueOf((char)c))).collect(Collectors.joining()));
Optional<Character> result = s1.chars()
.mapToObj(i -> (char) i)
.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
.entrySet().stream()
.filter(e -> e.getValue() == 1L)
.map(Map.Entry::getKey)
.findFirst();
System.out.println("3==="+result);
s1.chars()  .mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
entrySet().stream().filter(e->e.getValue()==1L)
.map(Map.Entry::getKey)
.forEach(System.out::println);



//.map(string->string.subString(0,1).toUppercase()+string.subString(1,string.length()-1)+" ").collect(Collectors.joining());


List<List<Integer>> numbers	= Arrays.asList(
	    Arrays.asList(1, 2),
	    Arrays.asList(3, 4),
	    Arrays.asList(5, 6)
	);
numbers.stream().flatMap(list1->list1.stream()).collect(Collectors.toList());

String test="Java FullStack Developer";
String[] array=	test.split("");
Set set =new HashSet();/*
Arrays.asList(array).stream().map(elem->{
!set.add(elem)

})*/
test.chars().filter(c->!set.add(c)).findFirst().ifPresent(e->System.out.println((char)e));
List<Employee2> listE=List.of(new Employee2(0,"","sam"), new Employee2(12,"token","manoj"), new Employee2(16,"azure","raja"), new Employee2(1,"token","pradeep"));
List<Employee2> listE2=List.of(new Employee2(0,"","sam"), new Employee2(12,"token","manoj"), new Employee2(16,"azure","raja"), new Employee2(1,"token","pradeep"));

listE.stream().mapToInt(e->(Integer)e.getExp()).sum();
listE.stream().filter(e->e.getDept()=="").forEach(System.out::println);
listE.stream().collect(Collectors.groupingBy(e->e.getDept())).values().forEach(l->Collections .sort(l,Comparator.comparing(Employee2::getExp)));
listE.stream().collect(Collectors.groupingBy(e->e.getDept())).values().forEach(l->Collections .sort(l,Comparator.comparing(Employee2::getExp)));
listE2.stream().collect(Collectors.groupingBy(e->e.getDept())).entrySet().stream().forEach(l->Collections .sort(l.getValue(),Comparator.comparing(Employee2::getExp)));;
	System.out.println("==="+listE2);
	System.out.println("==="+listE);
	//listE2.stream()
  //  .collect(Collectors.groupingBy(Employee::getDept, toSortedList(Employee::getExp)));
//listStd.stream().collect(Collectors.groupingBy(s->s.getName(),Collectors.mapping(s->s.getSubjects().stream().mapToInt(Subject::getMarks).sum(), Collectors.toList())));

	}
	
	
}
