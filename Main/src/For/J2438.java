package For;

import java.util.Scanner;

public class J2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		while(true){
			N = sc.nextInt();
			if ( N >= 1 && N <= 100) break;
		}
		
		for (int i = 1; i <= N; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}System.out.println(" ");
			
		}
	}
	
}
