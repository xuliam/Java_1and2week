package ewfwef;

import java.util.Scanner;

class Student{
	public String name;
	public double SDI;
	public double Java;
	public double DB;
	public double average;
	public static int numberOfObjects;
	
public Student(String name, double SDI, double Java, double DB) {
	this.name = name;
	this.SDI = SDI;
	this.Java = Java;
	this.DB = DB;
	this.average = (SDI + Java + DB)/(3);
	numberOfObjects++;
}
public double getAverage() {
    return average;	
}
static int getNumberOfObject() {
	return numberOfObjects;
	}
}
public class Week4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s1 = new Student("lian", 50,60,70);
	Student s2 = new Student("Xu", 70,60,70);
	System.out.println("FullName:"+s1.name+"SDI:"+s1.SDI+"Average:"+s1.getAverage());
	System.out.println("FullName:"+s2.name+"SDI:"+s2.SDI+"Average:"+s2.getAverage());
	}

}
