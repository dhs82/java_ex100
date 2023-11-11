package java_ex100;

import java.util.Scanner;

public class ex100_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan. nextInt();
		int j= scan. nextInt();
		int k= scan. nextInt();

		System.out.printf(i+".%02d"+".%02d",j,k);
		
		scan.close();
	}
}
