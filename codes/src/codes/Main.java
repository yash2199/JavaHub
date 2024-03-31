package codes;

class Grandparent {
	public Grandparent()
	{
		super();
		System.out.println("in grandparent");
	}
    public  void display() {
        System.out.println("Inside grandparent");
    }
}

class Parent extends Grandparent {
	public Parent()
	{
		super();
		System.out.println("in parent");
	}
//@Override
    public  void display() {
	super.display();
        System.out.println("In parent");
    }
}

class Child extends Parent {
	public Child()
	{
		super();
		
		System.out.println("child");
	}
	//@Override
    public void display() {
    	super.display();
        System.out.println("In child");
    }
}

public class Main {
    public static void main(String[] args) {
    	
       Child ch = new Child();
        //Parent p = new Parent();
       // p.display();  // This will print "In parent"
       ch.display(); // This will print "In child"
    }
}
