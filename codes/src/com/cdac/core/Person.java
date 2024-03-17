package com.cdac.core;

public class Person {
private String firstname;
private String lastname;
Person(String fname,String lname)
{
	super();
firstname=fname;
lastname=lname;
}
public String toString()
{
return "firstname"+firstname+"  lastname"+lastname;	
}
}
