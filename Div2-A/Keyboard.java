
// Problem URL - CF474-D2-A : https://codeforces.com/contest/474/problem/A

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String test = "qwertyuiopasdfghjkl;zxcvbnm,./";
		
		String c = scan.next();
		String m = scan.next();
		String result = "";
		
		if(c.equals("R")) {
			for(int i=0; i<m.length(); i++) {
				char ch = m.charAt(i);
				int index = test.indexOf(ch);
				result = result + test.charAt(index-1);
			}
		}else {
			for(int i=0; i<m.length(); i++) {
				char ch = m.charAt(i);
				int index = test.indexOf(ch);
				result = result + test.charAt(index+1);
			}
		}
		
		System.out.println(result);
		
	}

}
