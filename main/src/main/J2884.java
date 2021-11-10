package If;

import java.util.Scanner;

public class J2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int AH = sc.nextInt();
		int AM = sc.nextInt();
		
		int alam;
		int HN = 0;
		int MN = 0;
		
//		AH <= 0    1
//		AH > 0
//		AM < 45    1
//		AM >= 45
		
		
		if( AM >= 45 || AH <= 0) {// AH가 0보다 크고 AM이 45보다 작을때
			MN = -(-45+AM);
			HN = AH;
		}else if( AM < 45 && AH <= 0) {// AH가 0보다 크고 AM이 45보다 작을때
			MN = -(-45+AM);
			HN = AH;
		}else if(AM < 45) {// AH가 0이고 AM이 45보다 크거나 같을때
			MN = 60+(-45+AM);
			HN = AH - 1;
		}
			
		System.out.print(HN+" "+ MN);
		
 
		
	}	
}
