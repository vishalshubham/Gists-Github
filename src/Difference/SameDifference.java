package Difference;

import java.util.Scanner;
import java.util.Arrays;

class SameDifference{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of numbers:");
		int num = input.nextInt();

		int[] arr = new int[num];
		for(int i=0; i<num; i++){
			System.out.println("Enter the number " + (i+1));
			arr[i] = input.nextInt();
		}

		System.out.println("Enter the difference");
		int diff = input.nextInt();
		printSameDiff(arr, diff);
	}

	public static void printSameDiff(int[] arr, int diff){
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
			System.out.println("Number " + (i+1) + " " + arr[i]);
		}
		
		int i=0;
		int j=1;
		while(j<arr.length){
			if((arr[j] - arr[i]) == diff){
				System.out.println("Pair: " + arr[i] + " - " +  arr[j]);
				i++;
				j++;
			}
			else if((arr[j]-arr[i]) > diff){
				i++;
			}
			else{
				j++;
			}
		}
	}
}
