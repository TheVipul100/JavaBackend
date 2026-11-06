//package com.kodewala.oops.polymorphism3.test;

package ExplainDownCast;
class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) // Object obj = new Person("shreya"); (p2)    // no hardcoding if an employee,person is passed limited
	{
//		Object ob = new Person("shreya"); // one obj on heap.. xyz

		Person p =  (Person) obj;
//		System.out.println("------->correct");
//		System.out.println(ob.equals(p)); recursive call gives stackoverflow p will be referred again and again to the same obj.
		// p.name refers t the object that is downcasted
		return p.name.equals(this.name);  //this refers to p1 depends
	}

}

public class Driver

{
	public static void main(String[] args) 
	{
		Person p1 = new Person("shreya");
		Object p2 = new Person("shreya"); // another obj on heap add is abc
		System.out.println(p1.equals(p2)); // false

	}
}

/**
 * Child to parent works automatically (upcasting)
 *
 * ExcelReport excel = new ExcelReport("Alchemist", repo);
 * excel.report("Alchemist");   // inherited from parent - works fine
 *
 * A child is a parent. Everything the parent has, the child has too, so treating a child as a parent is always safe. No cast is needed.
 *
 * Parent reference to child methods needs a cast (downcasting)
 *
 * Suppose ExcelReport has an extra method:
 *
 * class ExcelReport extends ReportGenerator {
 *     public void addChart() { ... }   // only in the child
 * }
 *
 * ReportGenerator rv = new ExcelReport("Alchemist", repo);
 * rv.addChart();                        // compile error
 * ((ExcelReport) rv).addChart();        // works
 */
