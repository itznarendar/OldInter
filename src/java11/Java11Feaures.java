 package java11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11Feaures {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 var s="hello ";
 System.out.println(s.length()+"  "+s.isBlank()+" "+s.isEmpty());
 var s2=" ";
 System.out.println(s2.length()+"  "+s2.isBlank()+" "+s2.isEmpty());

 System.out.println(s.repeat(2));
 System.out.println(s.length());
s=s.repeat(2);
System.out.println(s.length()+" "+s);

//strip
 var s3="  hello how are you   ";
 System.out.println(s3.length()+"  "+s3.trim()+" ");
//s3=s3.stripTrailing();
 s3=s3.strip();
 System.out.println(s3.length()+" stripe ++"+s3+"++");
 var s4="\n\t  hello how are you  \u2005";
var t=s4.trim().equals("hello how are you  \u2005");
System.out.println(t);
var s5=" line1\n \nline2 \n line3";
var lines=s5.lines().filter(String::isBlank).count();
System.out.println(lines);

//File Reader
 InputStream stream= new FileInputStream("C:\\Users\\itzna\\eclipse-workspace\\Interview\\src\\java11\\file.txt");
System.out.println(new String(stream.readAllBytes()));
Path path=Paths.get("test.txt");
Files.writeString(path, "the sample append",StandardOpenOption.APPEND);
String content=Files.readString(path);
System.out.println(content);

//Collections to Array
List<String> list=Arrays.asList("iris","softwaare");
	//oldway
var arr=list.toArray(new String[list.size()]);
//new
String[] names=list.toArray(String[]::new);

//Not  Predicate
List<Integer>intlist=Arrays.asList(1,2,3,4,5,6,7,8);
Predicate<Integer>predicate=i->i%2==0;
intlist.stream().filter(Predicate.not(predicate)).forEach(System.out::println);
//Optonal isEmpty  opposite to ispresent
Optional<String> test=Optional.of("value1");
System.out.println(test.isPresent()+"  "+test.isEmpty()); 


int[] arrSeg = {0, 1, 0, 1, 1, 0};
Map<Boolean, List<Integer>> mapSeg = Arrays.stream(arrSeg).boxed()
        .collect(Collectors.partitioningBy(i -> i == 0));
List<Integer> zeros = mapSeg.get(true);
List<Integer> ones = mapSeg.get(false);
System.out.println("iiii===="+zeros+"======================\n\n");

Collection<List<Integer>> colleList=Arrays.stream(arrSeg).boxed()
.collect(Collectors.groupingBy(i -> i == 0)).values();
for(List listoo:colleList) {
	System.out.println("===="+listoo.get(1)+"======================");
}
System.out.println(colleList.iterator().next().get(0)+"================gpby"+colleList.iterator().next().get(1));
Arrays.stream(arrSeg).boxed()
.collect(Collectors.groupingBy(i -> i == 0)).entrySet().stream().map(e->e.getKey()).forEach((i)->System.out.println("==gg=="+i));;
Arrays.stream(arrSeg).boxed()
.collect(Collectors.groupingBy(i -> i == 0)).entrySet().stream().map(e->e.getValue()).forEach(System.out::println);;

	}
	
	

}
