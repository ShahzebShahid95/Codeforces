
// Problem URL - CF136-D2-A : https://codeforces.com/contest/136/problem/A

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int res[] = new int[n];
		
		for(int i=0; i<n; i++) {
			res[arr[i]-1] = i+1;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
