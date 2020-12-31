
// Problem URL - CF767-D2-A : https://codeforces.com/problemset/problem/767/A

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = scan.nextInt();
		}
		
		boolean isDone[] = new boolean[n+1];
		Arrays.fill(isDone, false);
		
		int curr = n;
		
		for(int i=1; i<=n; i++) {
			
			int x = arr[i];
			isDone[x] = true;
			if(x==curr) {
				while(isDone[curr]) {
					System.out.print(curr + " ");
					curr--;
				}
				System.out.println();
			}else {
				System.out.println();
			}
			
		}
		
		
		
	}

}
