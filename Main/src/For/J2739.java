package For;

import java.util.Scanner;

public class J2739 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = 0;
		
		while(true) {
			N = sc.nextInt();
			if(N>=1 && N<=9)break;
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = "+ N * i);
		}
		
		
	}
}
