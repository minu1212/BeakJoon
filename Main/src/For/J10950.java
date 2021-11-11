package For;

import java.util.Scanner;

public class J10950 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A = 0;
		int B = 0;
	
		int T = sc.nextInt();
		int sum[] = new int[T];
			for (int j = 0; j < T; j++) {
				
					A = sc.nextInt();
					if(A < 0) {
						j--;
						continue;
					}
					B = sc.nextInt();
					if(B > 10) {
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
