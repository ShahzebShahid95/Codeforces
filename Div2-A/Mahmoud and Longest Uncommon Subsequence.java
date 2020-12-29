
// Problem URL - CF766-D2-A : https://codeforces.com/contest/766/problem/A

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		if(a.equals(b)) {
			System.out.println("-1");
		}else if(a.length()>b.length()) {
			System.out.println(a.length());
		}else {
			System.out.println(b.length());
		}
		
	}

}
