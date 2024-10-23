package com.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		
		int[] arr = {5,8,9,6,6};
		System.out.println(Arrays.toString(cyclicSortRecall(arr)));

	}
	
	
	

	
	
	private static int[] cyclicSortRecall(int[] arr) {
		
		int i = 0;
		while(i<arr.length) {
			int correctIndex = arr[i]-5;
			if(arr[correctIndex] != arr[i]) {
				int temp = arr[i];
				arr[i] = arr[correctIndex];
				arr[correctIndex] = temp;
			}else {
				i++;
			}
		}
		
		return arr;
	}












	static int[] missingNumberInRange(int[] nums) {
		
		int i=0;
		
		while(i<nums.length) {
			if(nums[i]<nums.length && nums[i]!=i) {
				int temp = nums[i];
				nums[i] = nums[temp];
				nums[temp] = temp;
			}else {
				i++;
			}
		}
		
		for(int c=0;c<nums.length;c++) {
			if(nums[c]!=c) {
				System.out.println(c);
			}
		}
		
		
		return nums;
	}

	static int[] cyclicSort(int[] nums) {

		/*
		for(int i=0;i<nums.length-1;i++) {
			while(i != nums[i]-1) {
				int temp = nums[i];
				nums[i] = nums[temp-1];
				nums[temp-1] = temp;
				//System.out.println(Arrays.toString(nums));
			}
		}
		 */
		
		int i = 0;
		while(i<nums.length) {
			if(nums[i]-1!=i) {
				int temp = nums[i];
				nums[i] = nums[temp-1];
				nums[temp-1] = temp;
			}else {
				i++;
			}
		}
		

		return nums;
	}
	

}
