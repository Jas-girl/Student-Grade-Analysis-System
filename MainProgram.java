package com.StudentGradeAnalysisSystem;

import java.util.Scanner;

public class MainProgram {
public static void main(String[] args) {
	StudentOperation s=new StudentOperation();
	Scanner sc=new Scanner(System.in);
	System.out.println("*****Student Grade Analysis System*****");
	
	int ch=0;
	do {
		System.out.println("\nChoose1:Add Students\nChoose2:View All records\nChoose3:SearchbyId"
				+ "\nChoose4:SearchbyName\nChoose5:UpdateGrades\nChoose6:DeleteRecords\nChoose7:AnalysePerformance");
		ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("Add students");
		s.addStudent(1, "aman", 45);
		s.addStudent(2, "avleen", 67);
		s.addStudent(3, "sumit", 78);
		s.addStudent(4, "raman", 90);
		s.addStudent(5, "laksh", 55);
		System.out.println("*****************************************************************");
		break;
		case 2:System.out.println("Display records");
		s.display();
		System.out.println("***********************************************************************");
		break;
		case 3:System.out.println("Search by id:Enter the student id");
		s.searchId(sc.nextInt());
		System.out.println("***********************************************************************");
		break;
		case 4:System.out.println("Search by name:Enter the student name");
		s.searchName(sc.next());
		System.out.println("***********************************************************************");
		break;
		case 5:System.out.println("Upgrade the grade:Enter the student id");
		s.updateGrade(sc.nextInt());
		System.out.println("***********************************************************************");
		break;
		case 6:System.out.println("Delete the record:Enter the student id");
		s.delete(sc.nextInt());
		System.out.println("***********************************************************************");
		break;
		case 7:System.out.println("Analyse the performance");
		s.analyse();
		System.out.println("***********************************************************************");
		break;
		default:System.out.println("Exit operation");
		

		}
	}
	while(ch<9);
	
	
	
	
	
}
}
