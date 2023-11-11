package java_ex100;

import java.util.Scanner;

public class ex100_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		int MULj=(int)Math.pow(2,j);
		Math.pow(2,j);
		int res = i*MULj;
		
		System.out.print(res);
		
		scan.close();
	}
}
