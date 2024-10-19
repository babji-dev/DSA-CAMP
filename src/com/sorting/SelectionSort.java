package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
			int[] nums = {5,4,3,2,1};
			System.out.println(Arrays.toString(nums));
			selectionSort(nums);
			System.out.println(Arrays.toString(nums));
	}
	
	static int[] selectionSort(int[] nums) {
		
		
		for(int i=0;i<nums.length;i++) {
			int lastIndex = nums.length-i-1;
			int maxIndex = 0;
			for(int j=0;j<=nums.length-i-1;j++) {
				if(nums[j] > nums[maxIndex]) {
					maxIndex = j;
				}
			}
			if(maxIndex!=lastIndex) {
				int temp = nums[lastIndex];
				nums[lastIndex] = nums[maxIndex];
				nums[maxIndex] = temp;
				System.out.println(Arrays.toString(nums));
			}
		}
		return nums;
	}

}
