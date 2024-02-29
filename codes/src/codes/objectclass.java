package codes;

import java.util.Scanner;

public class objectclass {
	private double width,depth,height;
	 objectclass(double w,double d,double h) {
		width=w;
		this.depth=d;
		this.height=h;		
	}
	  String getboxdetails()
		{
			return "box dimension"+this.depth+" "+this.height+" "+this.width;
		}
	  String getcal()
		{
	 return "box "+this.depth*this.height*this.width;
		}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter box dimension:w d h ");
		objectclass b1=new objectclass(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.getcal());
		System.out.println(b1.getboxdetails());
	}

}
