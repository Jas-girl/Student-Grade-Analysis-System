package com.StudentGradeAnalysisSystem;

import java.util.Vector;

public class StudentOperation {
Vector<Student> v=new Vector<Student>();
public StudentOperation() {
	
}
void addStudent(int id,String name,int marks ) {
	v.add(new Student(id, name, marks));
}
void searchId(int id) {
	boolean flag=false;
	for (Student student : v) {
		if(student.getId()==id) {
			System.out.println(student);
			flag=true;
			break;
		}
	}
	System.out.println(flag==true?"Student id "+id+" is found":"Student id "+id+" is not found");
}
void searchName(String name) {
	boolean flag=false;
	for (Student student : v) {
		if(student.getName().equalsIgnoreCase(name)) {
			System.out.println(student);
			flag=true;
			break;
		}
	}
	System.out.println(flag==true?"Student name "+name+" is found":"Student name "+name+" is not found");
}
void updateGrade(int id) {
	boolean flag=false;
	for (Student student : v) {
		if(student.getId()==id) {
			student.setMarks(89);
			System.out.println(student);
			flag=true;
			break;
		}
	}
	System.out.println(flag==true?"student marks are updated":"student marks are not updated");
}
void delete(int id) {
	boolean flag=false;
	for (Student student : v) {
		if(student.getId()==id) {
			v.remove(student);
			flag=true;
			break;
		}
	}
	System.out.println(flag==true?"Student id "+id+" is removed":"Student id "+id+" is not removed");
}
void analyse() {
	int total=0;int max=0;int min=Integer.MAX_VALUE;
	for (Student student : v) {
		total=total+student.getMarks();
		if(max<student.getMarks()) {
			max=student.getMarks();
		}
		else if(min>student.getMarks()) {
			min=student.getMarks();
		}
	}
	float average=total/v.size();
	System.out.println("Average: "+average);
	System.out.println("Lowest grade: "+min);
	System.out.println("Highest grade: "+max);
	if(average>80 && average<=100) {
		System.out.println("Performance of class: A");
	}
	else if(average>60 && average<=80) {
		System.out.println("Performance of class: B");
	}
	else if(average>40 && average<=60) {
		System.out.println("Performance of class: C");
	}
	else {
		System.out.println("Performance of class: is not good");
	}
	
	
	
}
void display() {
	for (Student student : v) {
		System.out.println(student);
	}
}
}
