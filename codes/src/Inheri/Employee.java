package Inheri;

import java.util.Date;

public class Employee extends Person {

	private int id;
	private String CName;
	private int salary;
	private String doj;

	
	public Employee(String fname,String lname,int id,String CName,int salary,String doj)
	{
	super(fname,lname);
	this.id=id;
	this.CName=CName;
	this.salary=salary;
	this.doj=doj;
	}
}
