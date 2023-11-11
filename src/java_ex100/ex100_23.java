package java_ex100;

import java.util.Scanner;

public class ex100_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		int res=0;
		
		if(i==j)
			res=1;
		else
			res=0;
		
		System.out.print(res);
		
		scan.close();
	}
}
