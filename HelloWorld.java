package android.project;

import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner mark = new Scanner(System.in);
		System.out.print("Inter Your Mark: ");
		int point = mark.nextInt();

		
		String grade = "";
		if(point >=101) {
			System.out.println("Please Give 1-100");
		}
		if (point <= 100 && point>=80 ){
		grade = "A+";
		} else if (point <= 79 && point >= 70){
		grade = "A";
		} else if (point <= 69 && point >= 60){
		grade = "A-";
		} else if (point <= 59 && point >= 50){
		grade = "B";
		} else if(point <= 49 && point >= 40){
		grade = "C";
		}else if(point <= 39 && point >= 33){
			grade = "D";
		}else if(point <=32) {
			grade = "F";
		}
		if(point <=100) {
		System.out.println("Your Result: " + grade);
		}

	
 }
	
}



