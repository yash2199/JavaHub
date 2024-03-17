package com.cdac.core;
import com.cdac.core.*;
public class Student extends Person{
	private int id;
	private int fees;
	private int gradyear;
	
Student(String fname,String lname, int id,int fees,int gradyear)
{
	super(fname,lname);

this.id=id;
this.fees=fees;
this.gradyear=gradyear;
}
public String toString()
{
	return  "student"+super.toString()+ " id  "+  id  +"fees   "+fees+"graduationyear   "+gradyear;
}
}
