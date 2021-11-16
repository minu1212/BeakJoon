package For;

import java.util.Scanner;

public class J2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			n = sc.nextInt();
			if (n >= 1 && n <= 100)
				break;
		}
		
		int con = 0;
		int con1 = 0;
		for (int i = n; i >= 0; i--) {//n번만큼 수행
			con1++;
			for (int j = 1; j <= i; j++) {
				con = i-j;	
				for (int j2 = 0; j2 < con; j2++) {
					System.out.print(" ");
				}
			}
			for (int j2 = 0; j2 <= con1; j2++) {
				System.out.print("*");
			}System.out.println("");
		}

	}
}
