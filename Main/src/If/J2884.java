package If;

import java.util.Scanner;

public class J2884 {
	public static void main(String[] args) {
		int HN = 0;
		int MN = 0;
		int AH = 0;
		int AM = 0;
		
		Scanner sc = new Scanner(System.in);
	while(true) {
			AH = sc.nextInt();
			AM = sc.nextInt();
			if((AH >= 0 && AH <= 23)&&(AM >= 0 && AM <= 59)==true)break;
	}
			
			if((AH >= 0 && AH <= 23)&&(AM >= 0 && AM <= 59)) { 
				if(AH < 0) {
					if(AM < 45) {
						MN = 60+(-45+AM);
						HN = AH - 1;
					}else if(AM >= 45) {
						MN = AM-45;
						HN = AH;
					}
				}else if(AH > 0){
					if(AM < 45) {
						MN = 60+(-45+AM);
						HN = AH - 1;
					}else if(AM >= 45) {
						MN = AM-45;
						HN = AH;
					}
				}else if(AH == 0) {
					if(AM < 45) {
						MN = 60+(-45+AM);
						HN = AH + 24 - 1;
					}else if(AM >= 45) {
						MN = AM-45;
						HN = AH;
					}
				}
			
			}
		
		
		
		
		System.out.print(HN+" "+ MN);
		
 
		
	}
}	

