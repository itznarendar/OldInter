package dsa.stacks;

import java.util.Stack;

public class StackMain {
//usecase undo/redo in text editors
	//forward and backward web browsers
	//backtracking ,calling functions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> stack=new Stack<String>();
stack.push("mincecraft");
stack.push("Doom"); 
stack.push("Far Cry");
stack.push("The Division");
stack.push("Assassin’s Creed");
//System.out.println("is empty ? "+stack.isEmpty());
System.out.println("is "+stack);
System.out.println("top element "+stack.peek());
System.out.println("search element "+stack.search("Doom"));

	}

}
