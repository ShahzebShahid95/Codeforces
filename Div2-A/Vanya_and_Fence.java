
// Problem URL - CF677-D2-A : https://codeforces.com/contest/677/problem/A


import java.util.Scanner;
 
public class Solve {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int h = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int result = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] <= h) {
				result++;
			}else {
				result = result + 2;
			}
		}
		
		System.out.println(result);
		
	}
 
}
