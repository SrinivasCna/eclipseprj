package collection.stack.examples.a1;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> subjectStack = new Stack<>();
		System.out.println(subjectStack);

		// add(element)
		// adds the element to the top of the stack

		boolean isTrueOrFalse;
		isTrueOrFalse = subjectStack.add("java");
		System.out.println(isTrueOrFalse);

		subjectStack.add("python");
		subjectStack.add("html");
		subjectStack.add("sql");
		subjectStack.add("ai");
		subjectStack.add("machine learning");
		subjectStack.add(null);

		System.out.println(subjectStack);

		String element;
		// pop()
		// removes the element at the top of this stack
		// returns the element at the top of this stack
		element = subjectStack.pop();
		System.out.println(element);
		System.out.println(subjectStack);

		// push(element)
		// pushes an element onto the top of this stack
		// returns the added
		element = subjectStack.push("c++");
		System.out.println(element);
		System.out.println(subjectStack);

		Integer position;
		// search(element)
		// returns value 1 based position from the top of this stack
		// where element is located
		// returns value -1 which indicates that the element is not on the stack
		position = subjectStack.search("c++");
		System.out.println(position);

		// peek()
		// looks at the element at the top of this stack
		// without removing it from the stack
		// returns the element at the top of this stack
		element = subjectStack.peek();
		System.out.println(element);

		Integer size;
		// size()
		// returns the no of elements in this stack
		size = subjectStack.size();
		System.out.println(size);

		// clear()
		// removes all of the element from this stack
		subjectStack.clear();
		System.out.println(subjectStack);

		// empty()
		// tests if this stack is empty
		// returns true if and only if this stack contains no element
		isTrueOrFalse = subjectStack.empty();
		System.out.println(isTrueOrFalse);

	}
}
