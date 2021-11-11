package For;

import java.util.Scanner;

public class J11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		
		int A = 0;
		int B = 0;
		
		int arr1 [] = new  int [T];
		int arr2 [] = new  int [T];
		int arr3 [] = new  int [T];
		
		for (int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			arr1[i] = A + B;
			arr2[i] = A;
			arr3[i] = B;
			
		}
		
		int num = 0;
		for(int k = 0; k  < T; k++) {
			num = num + 1;
			System.out.println("Case #"+ num + ": " + arr2[k] + " + " + arr3[k] + " = " + arr1[k]);
		}
		
		
	}
}
