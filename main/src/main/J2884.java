package main;

import java.util.Scanner;

public class J2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc. nextInt();
		int M = sc. nextInt();
		
		int Hl = 24;
		int Ml = 60;
		int Hn ;
		int Mn = 45-M;
				

		
		if(H == 0 ) {
			Hn = 23;
			if(M > 45) {
				System.out.println(Hn+" "+(M-45));
			
			}else if(M < 45) {
				System.out.println(Hn+" "+ (Ml-Mn)); 
			}
		}
		else if(H < 0) {
			Hn = (Hl-H);
			
			if(M > 45) {
				System.out.println(Hn+" "+(M-45));
			
			}else if(M < 45) {
				System.out.println(Hn+" "+ (Ml-Mn)); 
			}
		}
		else {
			Hn = H;
			if(M > 45) {
				System.out.println(Hn+" "+(M-45));
			
			}else if(M < 45) {
				System.out.println((Hn-1)+" "+ (Ml-Mn)); 
			}
		}
				
			
		
	}	
}
