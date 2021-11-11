package For;

import java.util.Scanner;

public class J11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt() ;
		int A = 0;
		int B = 0 ;
		int arr [] = new int [T];
		for(int i = 0 ; i < T; i++) {
			A = sc.nextInt();
			if(A < 0) {
				i--;
				continue;
			}
			B = sc.nextInt();
			if(B > 10) {
				i--;
				continue;
			}
			arr[i] = A + B;
		}
		int num = 1;
		for(int k : arr) {		
			System.out.println("Case #"+ num + ": "+ k);	
			num ++;

			
		}
	}
	
		
	
}
