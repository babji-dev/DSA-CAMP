package com.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// INDEX: 4, 3, 2, 1, 0
		// ELEM : 5, 4, 3, 2, 1

		/*
		  nums[0] = 5
		  so we need to swap nums[0] with nums[5-1]
		  
		 */

		int[] nums = {5,3,4,1,2};
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(cyclicSort(nums)));

	}

	static int[] cyclicSort(int[] nums) {

		for(int i=0;i<nums.length-1;i++) {
			while(i != nums[i]-1) {
				int temp = nums[i];
				nums[i] = nums[temp-1];
				nums[temp-1] = temp;
				//System.out.println(Arrays.toString(nums));
			}
		}

		return nums;
	}

}
