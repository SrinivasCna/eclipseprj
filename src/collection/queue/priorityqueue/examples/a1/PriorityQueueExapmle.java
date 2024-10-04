package collection.queue.priorityqueue.examples.a1;

import java.util.PriorityQueue;

public class PriorityQueueExapmle {
	public static void main(String[] args) {
		PriorityQueue<String> subjectQueue = new PriorityQueue<>();
		System.out.println(subjectQueue);

		boolean isTrueOrFalse;
		// add(element)
		// adds an element to the rear of the queue
		// insert the specified element into this queue
		// returns true if the element is added to the queue
		// if the queue is full, it throws exception
		isTrueOrFalse = subjectQueue.add("java");
		System.out.println(isTrueOrFalse);

		subjectQueue.add("python");
		subjectQueue.add("c++");
		subjectQueue.add("ai");
		subjectQueue.add("machine learning");
		subjectQueue.add("sql");
		subjectQueue.add("manual testing");

		// this one will throw an error
		// subjectQueue.add(null);

		System.out.println(subjectQueue);

		String element;
		// poll()
		// returns the head of this queue
		// removes the head of this queue
		// returns null if the queue is empty
		element = subjectQueue.poll();
		System.out.println(element);

		// peek()
		// returns, but does not remove, the head of this queue
		// or returns null if this queue is empty
		element = subjectQueue.peek();
		System.out.println(element);

		// remove()
		// removes and returns the head of this queue
		// this method differs from the poll only in that
		// it throws an exception if this queue is empty
		element = subjectQueue.remove();
		System.out.println(element);
		System.out.println(subjectQueue);

		// contains(element) //contains(object)
		// returns true if this queue contains the specified element
		isTrueOrFalse = subjectQueue.contains("java");
		System.out.println(isTrueOrFalse);

		Integer size;
		// size()
		// returns the number of elements in this queue
		size = subjectQueue.size();
		System.out.println(size);

		// offer(element)
		// adds an element to the rear of this queue
		// if the queue is full, it returns false
		isTrueOrFalse = subjectQueue.offer("html");
		System.out.println(isTrueOrFalse);
		System.out.println(subjectQueue);

		// element()
		// returns the element at the front of the queue without removing it
		// if the queue is empty, it throws an exception
		element = subjectQueue.element();
		System.out.println(element);

		// clear()
		// removes all the elements from this queue
		subjectQueue.clear();
		System.out.println(subjectQueue);

		// isEmpty()
		// returns if this queue contains no element
		isTrueOrFalse = subjectQueue.isEmpty();
		System.out.println(isTrueOrFalse);

	}
}
