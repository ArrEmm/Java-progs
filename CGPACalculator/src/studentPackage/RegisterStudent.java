package studentPackage;
import InterfacePackage.Student;
import java.util.Scanner;
import java.lang.RuntimeException;
import java.text.ParseException;
import resultPackage.calculate;
public class RegisterStudent implements Student{
	String name;
	String branch;
	
	int marks[];
	int credits[];
//	double sgpa[]=new double[4];
	double sgpa;
	public void getName() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Student's name.");
		name=sc.nextLine();
	}
	public void getBranch() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Student's branch.");
		branch=sc.nextLine();
	}
	public void marksCollection() throws ParseException{
		Scanner sc= new Scanner(System.in);
		double sgpaSum=0;
		for (int i=1;i<=4;i++) {
			int totalCredits=0;
			System.out.println("Enter number of subjects in semester "+i);
			int n=sc.nextInt();
			marks=new int[n];
			credits=new int[n];
			calculate calcObj=new calculate();
			for (int j=0;j<n;j++) {
				System.out.println("Please enter the number of credits of subject number "+(j+1));
				int subCredits=sc.nextInt();
				totalCredits+=subCredits;
				if (totalCredits>30) throw new CreditLimit("Credit Limit exceeded. Please check entries.");
				credits[j]=subCredits;
				System.out.println("Please enter marks entered in this subject.");
				marks[j]=sc.nextInt();
				
			}
			sgpa = calcObj.SGPA(marks, credits,totalCredits);
			sgpaSum+=sgpa;
		}
		double cgpa=sgpaSum/4;
		System.out.println("CGPA of 4 semesters : "+cgpa);
	}
}
