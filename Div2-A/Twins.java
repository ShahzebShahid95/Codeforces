
// Problem URL - CF160-D2-A : https://codeforces.com/contest/160/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		sum = sum/2;
		
		Arrays.sort(arr);
		int currSum = 0;
		int count = 0;
		
		for(int i=n-1; i>=0; i--) {
			currSum += arr[i];
			count++;
			if(currSum > sum) {
				break;
			}
		}
		
		System.out.println(count);
	}

}
