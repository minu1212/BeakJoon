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
				
		0시 30분 -> 23시 45분
		
		if(H == 0 && H < 0 ) {
			--
		}
		else if(H < 0) {
			Hn = (Hl-H);
		}
			
		else {	
			if(M > 45) {
				System.out.println(H+" "+(M-45));
			
			}else if(M < 45) {
				System.out.println((H-1)+" "+ (Ml-Mn)); 
			}
		}
	}	
}
