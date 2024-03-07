package com.cdac.core;

import java.util.Scanner;

public class Box {
private double lenght;
private double breadth;
private double height;
public Box(double lenght, double breadth, double height) {
	super();
	this.lenght = lenght;
	this.breadth = breadth;
	this.height = height;
}
public double getLenght() {
	return lenght;
}
public void setLenght(double lenght) {
	this.lenght = lenght;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
@Override
public String toString() {
	return "Box [lenght=" + lenght + ", breadth=" + breadth + ", height=" + height + "]";
}

public double  volume(double length,double breadth,double height)
{
	return length*breadth*height;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	Box[]boxes=new Box[sc.nextInt()];
	for(int i=0;i<boxes.length;i++)
	{
		System.out.println("enter the box dimentions");
		boxes[i]=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
	}
	 
		for(Box b: boxes)
		{
			System.out.println(b);	
		}
	sc.close();
}

}

