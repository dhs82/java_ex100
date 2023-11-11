package java_ex100;

import java.util.Scanner;

public class ex100_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		
		
		int sum = i+j+k;
		float avg=sum/3;
		
		System.out.printf("%d\n%.2f",sum,avg);
		
		scan.close();
	}
}
