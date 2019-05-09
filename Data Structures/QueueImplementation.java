package com.techie.data.structures;

import java.util.Stack;

public class QueueImplementation {
	
	static class Queue{
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	static void enqueue(int x) {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(x);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	static int dequeue() {
		
		if(stack1.isEmpty()) {
			System.out.println("Queue is empty...");
			System.exit(0);
		}
		int x = stack1.pop();
		//stack1.pop();
		
		return x;
		
	}
	
	};
	public static void main(String[] args) {	
	
		Queue q = new Queue();
		long start = System.nanoTime();
		
		q.enqueue(3);
		q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);
		q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		long end = System.nanoTime();
		System.out.println(end-start);
		
		
		long startd = System.nanoTime();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		long endd = System.nanoTime();
		System.out.println(endd-startd);
	}

}
