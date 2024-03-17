package Inheri;

public class Person {
private String firstname;
private String lastname;
 
public Person(String fname,String lname){
	super();
	this.firstname=fname;
	this.lastname=lname;
}
public String toString()
{
return "firstname"+firstname+"lastname"+lastname;	
}

}
