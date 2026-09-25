import java.util.Scanner;
public class IT26101756Lab9Q4
{
	public static double calcFinalMark(double assignmentMark,double examMark)
	{
		double finalMark=(assignmentMark*0.30)+(examMark*0.70);
		return finalMark;
	}
	public static char findGrades(double finalMark)
	{
		char grade;
		if(finalMark>=75){
			grade='A';
		}else if(finalMark>=60&&finalMark<75){
			grade='B';
		}else if(finalMark>=50&&finalMark<60){
			grade='C';
		}else{
			grade='F';
		}
		return grade;
	}
	public static void printDetails(String name,double finalMark,char grade){
		System.out.printf("%-10s\t%-12.2f\t%-5c\n", name, finalMark, grade);
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String[]names=new String[5];
		double[]finalMark=new double[5];
		char[]grades=new char[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter Name of Student" + (i+1) +": ");
			names[i]=scanner.next();
			System.out.print("Enter Assignment Mark (out of 100) for" + names[i]+":");
			double assignmentMark=scanner.nextDouble();
			System.out.print("Enter Exam Paper Mark(out of 100) for" + names[i]+":");
			double examMark=scanner.nextDouble();
			finalMark[i]=calcFinalMark(assignmentMark,examMark);
			grades[i]=findGrades(finalMark[i]);
System.out.println();
		}
	System.out.println("Name\t\tFinal Mark\tGrade");
for(int i=0;i<5;i++){
printDetails(names[i],finalMark[i],grades[i]);
}
scanner.close();
	}
}
	