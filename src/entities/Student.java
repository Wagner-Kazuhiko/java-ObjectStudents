package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public double FinalGrade() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public double Missing() {
		media = (nota1 + nota2 + nota3) / 3;
		return 60 - media;
	}
	
}
