


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int max = 0, min = 0;
		for(int i=0; i<n; i++) {
			if(i==0) {
				max = Math.max(Math.abs(arr[i]-arr[0]), Math.abs(arr[i]-arr[n-1]));
				min = Math.abs(arr[i]-arr[i+1]);
			}else if(i==n-1) {
				max = Math.max(Math.abs(arr[i]-arr[0]), Math.abs(arr[i]-arr[n-1]));
				min = Math.abs(arr[i]-arr[i-1]);
			}else {
				max = Math.max(Math.abs(arr[i]-arr[0]), Math.abs(arr[i]-arr[n-1]));
				min = Math.min(Math.abs(arr[i]-arr[i-1]), Math.abs(arr[i]-arr[i+1]));;
			}
			
			System.out.println(min +" "+ max);
		}
		
	}

}
