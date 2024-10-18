package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,1,2,3,4,5,6,7,7,8,64};
		System.out.println(isArraySorted(arr, 0, 1));
		System.out.println(searchForElement(arr, 0, 64));
		System.out.println(findAllIndexesOfElement(arr,0,7,new ArrayList<>()));
		System.out.println(findAllIndexesOfElementWithoutListAsArgument(arr, 0,64) );
		Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(i->i.intValue()).toArray();
	
	}
	
	static boolean isArraySorted(int[] arr, int lower,int upper) {
		if(arr.length-1!=upper && arr[lower]<=arr[upper]) {
			return isArraySorted(arr,upper,upper+1);
		}
		if(arr.length-1==upper && arr[lower]<=arr[upper]) {
			return true;
		}else {
			return false;
		}
	}
	
	//Linear Search using recursion
	static int searchForElement(int[] arr,int index,int target) {
		if(index>arr.length-1)
			return -1;
		
		if(arr[index]==target)
			return index;
		else 
			return searchForElement(arr, index+1, target);
		
	}
	
	static List<Integer> findAllIndexesOfElement(int arr[], int index,int target,List<Integer> store){
		if(index>arr.length-1) {
			return store;
		}
		
		if(arr[index]==target)
			store.add(index);
		
		return findAllIndexesOfElement(arr, index+1, target, store);
	}
	
	static List<Integer> findAllIndexesOfElementWithoutListAsArgument(int arr[], int index, int target) {
		List<Integer> list = new ArrayList<>();
		
		if(index>arr.length-1){
			return list;
		}
		
		if(arr[index]==target)
			list.add(index);
		
		List<Integer> listFromBelowCalls = findAllIndexesOfElementWithoutListAsArgument(arr, index+1, target);
		list.addAll(listFromBelowCalls);
		return list;
	}

}
