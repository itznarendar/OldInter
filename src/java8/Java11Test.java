package java8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java11Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//'_' is a keyword from source level 9 onwards, cannot be used as identifier
		// cgf String _="";//cannot use _ as variable and reserved in java9

		/*
		 * InputStream inputStream=new FileInputStream("./demo.txt"); int character;
		 * try(inputStream){ while((character=inputStream.read())!=-1) {
		 * 
		 * } }
		 */
		Stream.of("a", "b", "c", "", "d", "e").takeWhile(s -> !s.isEmpty()).forEach(System.out::println);
		Stream.of("a", "b", "c", "", "d", "e").dropWhile(s -> !s.isEmpty()).forEach(System.out::println);
		IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::println);

		long count = Stream.ofNullable(100).count();
		System.out.println(count + "?? ");// 1
		long countNull = Stream.ofNullable(null).count();
		System.out.println(countNull);// 0
		List<Optional<String>> list = Arrays.asList(Optional.empty(), Optional.of("naren"), Optional.empty(),
				Optional.of("software"));
		List<String> stringList=list.stream().flatMap(Optional::stream).collect(Collectors.toList());
	System.out.println(stringList );
	Optional<String> opt=Optional.of("naren");
	opt.ifPresentOrElse(x->System.out.println(x), ()-> System.out.println("not present"));
	
	Optional<String> opt1=Optional.empty();
	opt1.ifPresentOrElse(x->System.out.println(x), ()-> System.out.println("not present"));
 Optional<String> opt3=Optional.of("IRIS");
Supplier<Optional<String>>supplier=()->Optional.of("Not present");
opt3=opt3.or(supplier);
opt3.ifPresent(x->System.out.println(x));
var s="hhh";
System.out.println(s);
 int [] arr2= {1,2,3};
 Arrays.stream(arr2).boxed().distinct().collect(Collectors.toList());
	}

}
