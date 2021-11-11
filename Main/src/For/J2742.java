package For;

import java.util.Scanner;

public class J2742 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		while(true) {
			N = sc.nextInt();
			if(N <= 1000000)break;
		}
		
		for (int i = N; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
}
