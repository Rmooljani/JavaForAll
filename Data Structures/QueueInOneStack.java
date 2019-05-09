package com.techie.data.structures;

import java.util.Stack;

public class QueueInOneStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	public void enqueue(int x) {
		stack.push(x);
	}
	
	public void dequeue() {
		if(stack.size()<1) {
			System.out.println("Queue is empty....");
		//	System.exit(0);
		}
		if(stack.size()==1) {
			System.out.println(stack.pop());
			return;
	}
		
		int data = stack.pop();
		dequeue();
		
		stack.push(data);
		}
	
	public static void main(String[] args) {
		
		QueueInOneStack s = new QueueInOneStack();
		long start = System.nanoTime();
		s.enqueue(11);
		s.enqueue(22);
		s.enqueue(33);
		s.enqueue(44);
		s.enqueue(55);
		s.enqueue(66);
		long end = System.nanoTime();
		System.out.println(end-start);
		
		long startd = System.nanoTime();
		s.dequeue();
		s.dequeue();
		s.dequeue();
		s.dequeue();
		s.dequeue();
		s.dequeue();
		long endd = System.nanoTime();
		System.out.println(endd-startd);
		s.dequeue();
		
		s.dequeue();
		
		
		
	}

}
