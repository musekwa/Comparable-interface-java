package com.comparable;

import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		var employees = new Employee[3];
		employees[0] = new Employee("Dalton", 5600);
		employees[1] = new Employee("Mark", 8000);
		employees[2] = new Employee("Nancy", 4300);

          // sorting Employee objects based on the salary field
		Arrays.sort(employees);

		for (Employee emp: employees)
			System.out.println("name:"+emp.getName() + "\tsalary:" + emp.getSalary());

     }
}
