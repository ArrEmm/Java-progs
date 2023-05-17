package resultPackage;
import resultPackage.InvalidSGPA;
import java.text.ParseException;
//import java.lang.RuntimeException;
public class calculate {
	double totalWeightedSumMarks;
	double  weightedMarksArray[];
	double sgpa;
//	double cgpa;
	String grade;
/*	calculate(){
		totalWeightedSumMarks=0;
	}*/
	public double SGPA(int marksArray[],int creditsArray[],int totalCredits) throws ParseException{
		totalWeightedSumMarks=0;
		weightedMarksArray=new double[marksArray.length];
		for(int i=0;i<marksArray.length;i++) {
			double weightedMarks=marksArray[i]*creditsArray[i];
			totalWeightedSumMarks+=weightedMarks;
			weightedMarksArray[i]=weightedMarks;
		}
//		int l=weightedMarksArray.length;
		sgpa=totalWeightedSumMarks/(10*totalCredits);
		if (sgpa>10||sgpa<0) throw new InvalidSGPA("Invalid entries, please check.");
		else if (sgpa<=10.0 && sgpa>9.0) grade="O";
		else if (sgpa<=9.00 && sgpa>8.0) grade="A+";
		else if (sgpa<=8.00 && sgpa>7.0) grade="A";
		else if (sgpa<=7.00 && sgpa>6.0) grade="B";
		else if (sgpa<=6.00 && sgpa>5.0) grade="C";
		else if (sgpa<=5.00 && sgpa>4.0) grade="D";
		else if (sgpa<=4.00 && sgpa>3.0) grade="E";
		else if (sgpa<=3.00) grade="F";
		System.out.println("SGPA = "+sgpa);
		System.out.println("Grade = "+grade);
		return sgpa;
	}
}
