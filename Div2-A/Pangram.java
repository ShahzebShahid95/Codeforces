
// Problem URL - CF520-D2-A : https://codeforces.com/contest/520/problem/A

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String s = scan.next();
		
		HashSet<Character> set = new HashSet<Character>();
		
		s = s.toLowerCase();
		
		if(n < 26) {
			System.out.println("NO");
		}else {
			for(int i=0; i<s.length(); i++) {
				 set.add(s.charAt(i));
			}
			
			if(set.size()==26) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		
		
	}

}
