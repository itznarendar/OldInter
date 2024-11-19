package arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
public class MyClass {
    
    
static  Character   unique(String s
){

Set<Character> set=new LinkedHashSet<Character>();
 char Uniq;
 int i=0;
 int j=0;
while(i<s.length()){

if(!set.add(s.charAt(i)))
{
 set.remove(s.charAt(i));
	System.out.println(j+"j ");

j++;
}
else{
	System.out.println(j+"j else ");
char uniqChar=s.charAt(j);
System.out.println(j+"j uniq  ============"+uniqChar);

i++;
//return uniqChar;
}

}
Iterator iter=set.iterator();
System.out.println(set );
if(iter.hasNext()){
    return (Character)iter.next();
    
}
    return null;
}


    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
      String s="hihrhellio";
   Optional<Character> chare=   s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1l).map(e->e.getKey()).findFirst();

      System.out.println(chare.get()+"Sum of x+y = " + unique("hihrhellio"));
     }
}