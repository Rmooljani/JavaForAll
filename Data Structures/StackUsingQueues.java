package com.techie.data.structures;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	
		static class Stack{
		static Queue<Integer> queue1 = new LinkedList<>();
		static Queue<Integer> queue2 = new LinkedList<>();
		
		static void enstack(int x) {
			while(!queue1.isEmpty()) {
				queue2.add(queue1.poll());
			}
			queue1.add(x);
			while(!queue2.isEmpty()) {
				queue1.add(queue2.poll());
			}
		}
		
		static int destack() {
			
			if(queue1.isEmpty()) {
				System.out.println("Stack is empty...");
				System.exit(0);
			}
			int x = queue1.poll();
			//stack1.pop();
			
			return x;
			
		}
		
		};
		public static void main(String[] args) {	
		
			Stack q = new Stack();
			long start = System.nanoTime();
			
			q.enstack(3);
			q.enstack(2);
			q.enstack(1);
			long end = System.nanoTime();
			System.out.println(end-start);
			
			
			long startd = System.nanoTime();
			System.out.println(q.destack());
			System.out.println(q.destack());
			System.out.println(q.destack());
			
			long endd = System.nanoTime();
			System.out.println(endd-startd);
		}

	}
