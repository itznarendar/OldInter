package java8;

public interface TestInterface {
	//private methods allowed from java9
private static void doSomething() {
	System.out.println("hello private method");
}

private static void dispaly() {
doSomething(); }
}
