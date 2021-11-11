package For;

import java.util.Scanner;

public class J15552 {//BufferedReader¿Í BufferedWriter
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		int T = sc.nextInt();
		int sum [] = new int[T]; 
			for (int j = 0; j < T; j++) {
				
					A = sc.nextInt();
					if(A <= 1 && A >= 1000 ) {
						j--;
						continue;
					}
					B = sc.nextInt();
					if(B <= 1 && B >= 1000) {
						j--;
						continue;
					}
				
				sum[j] = A + B;
			}
			
		for(int k : sum) {
			System.out.println(k);
		}
		
	}
}
