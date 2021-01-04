
// Problem URL - CF768-D2-A : https://codeforces.com/contest/768/problem/A

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		int max = arr[0], min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] > min && arr[i] < max) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
