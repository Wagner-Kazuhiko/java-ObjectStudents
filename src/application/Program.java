package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter student name: ");
		student.name = sc.next();
		System.out.println("Enter exam points 1: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Enter exam points 2: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Enter exam points 3: ");
		student.nota3 = sc.nextDouble();
		
		if (student.FinalGrade() >= 60) {
			System.out.printf("FINAL GRADE =  %.2f %n", student.FinalGrade());
			System.out.println("PASS");
		}
		
		else {
			System.out.printf("FINAL GRADE = %.2f %n", student.FinalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f %n", student.Missing());
		}
		
		sc.close();

	}

}
