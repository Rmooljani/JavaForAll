package com.techie.data.structures;

public class JaggedArray {
	
	public static void main(String[] args) {
		int[][] arr = {{3,2},{4,5},{5,6}};
		int ar[] = new int[6];
		System.out.println(ar.getClass());
		System.out.println("=========================================");
		Integer intArray[] = {1,2,3}; 
        
        Integer cloneArray[] = intArray.clone(); 
        System.out.println(intArray[0] == cloneArray[0]);
        
        for(int i=0;i<intArray.length;i++) {
        	System.out.println(intArray[i] + "intArray" +  intArray);
        }
        for(int i=0;i<cloneArray.length;i++) {
        	System.out.println(cloneArray[i] + "cloneArray" + cloneArray);
        }
        System.out.println(intArray[0].equals(cloneArray[0]));
        
        System.out.println("=========================================");
        
        Address add1 = new Address("Delhi","India");
        Address add2 = new Address("NY","England");
        Employee emp1= new Employee(111, "Rashmi",add1);
        Employee emp2 = emp1;
        emp1.setName("Ram");
        emp1.setAddress(add2);
        emp1.setAddress(add1);
        add1.setCity("Bangalore");
        System.out.println(emp2==emp1);
        System.out.println(emp1.equals(emp2));
        System.out.println("Employee1:" +  emp1);
        System.out.println("Employee2:" +  emp2);
        
        System.out.println("=========================================");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<2;j++) {
				 sum = sum + (arr[i][j]);
				System.out.print(arr[i][j] + " " );
				
			}
			System.out.println();
		}
		System.err.println("sum is: " + sum);
	}
}


class Employee {
	private int id;
	private String name;
	private Address address;
	
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address" + address + "]";
	}
	
	
}

class Address{
	private String city;
	private String country;
	
	public Address(String city,String country) {
		this.city=city;
		this.country=country;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
}
