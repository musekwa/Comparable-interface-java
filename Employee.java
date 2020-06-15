package com.comparable;

//the Comparable has a type: Employee
public class Employee implements Comparable<Employee>
{
	// instance fields
	private String name;
	private double salary;

	// constructor
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
   
   public double getSalary()
   {
         return this.salary;
   }	

   public String getName()
   {
         return this.name;
   }	
   /*
   *the parameter type of this method is now the same as the 
   *one that the interface has.
   *No more need for manual casting from Object to the desired type
  */
	public int compareTo(Employee other)
	{
		return Double.compare(this.salary, other.getSalary());
	}
  //...
}
