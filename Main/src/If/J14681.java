package If;

import java.util.Scanner;

public class J14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		if(first > 0 && second > 0) System.out.println(1);
		else if(first > 0 && second < 0) System.out.println(4);
		else if(first < 0 && second < 0) System.out.println(3);
		else if(first < 0 && second > 0) System.out.println(2);
		
	}
}
