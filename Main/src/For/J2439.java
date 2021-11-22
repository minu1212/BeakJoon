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
		int n1 = 0;
		for (int i = n; i > 0; i--) {//n번만큼 수행--5
				n1++;
				con = n-n1;
				con1++;
				for (int j2 = 0; j2 < con; j2++) {//j2가 con값보다 많을때 까지 반복 con 4 = 4
					System.out.print(" ");
				}
				
				for (int j3 = 0; j3 < con1; j3++) {//j3가 con1만큼 반복
					System.out.print("*");
				}System.out.println("");
			
			
		}

	}
}
