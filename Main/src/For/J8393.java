package For;

import java.util.Scanner;

public class J8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		while(true) {
			n = sc.nextInt();
			if(n >= 1 && n <= 10000)break;
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}System.out.println(sum);
				
	
	
	}
}
