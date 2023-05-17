package studentPackage;
import studentPackage.RegisterStudent;
import java.util.Scanner;
import java.text.ParseException;
import java.lang.RuntimeException;
public class mainClass {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of students.");
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			RegisterStudent student = new RegisterStudent();
			student.getName();
			student.getBranch();
			student.marksCollection();
		}
	}

}
