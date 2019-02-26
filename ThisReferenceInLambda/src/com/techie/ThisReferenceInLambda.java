package com.techie;

public class ThisReferenceInLambda {

	public void process() {
		operate(20, n->{
			System.out.println(30+n);
			System.out.println(n);
			System.out.println(this);
		});
	}
	public static void main(String[] args) {

		int x=30;
		int y=40;
		
		Operation operation = (n) -> System.out.println(n*y);
		operation.operate(3);
		
		ThisReferenceInLambda.operate(x, n->{
			System.out.println(x+y);
			System.out.println(n);
			//System.out.println(this);
		});
		new ThisReferenceInLambda().process();
	}

	private static void operate(int i,Operation o) {
	o.operate(i);	
	}
}
