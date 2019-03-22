package com.general.interview.programs.level2;


class TestValueVsReference{
	
	private String reference;
	public TestValueVsReference(String reference) {
		super();
		this.reference = reference;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
}
public class JavaPassByValue {
	
	public static void main(String[] args) {
		TestValueVsReference t = new TestValueVsReference("Inside main...");
		changeReference(t);
		changevalue(t);
		
		
	}
	
	public static void changeReference(TestValueVsReference test) {
		TestValueVsReference testValueVsReference = new TestValueVsReference("Test Reference");
		test = testValueVsReference;
		System.out.println(test.getReference());
		System.out.println(testValueVsReference.getReference());
	}
	
	public static void changevalue(TestValueVsReference test) {
		TestValueVsReference testValueVsReference = new TestValueVsReference("Test Value");
		System.out.println("==================");
		System.out.println(testValueVsReference.getReference());
		testValueVsReference.setReference("Changed test value");
		System.out.println(testValueVsReference.getReference());
	}

}
