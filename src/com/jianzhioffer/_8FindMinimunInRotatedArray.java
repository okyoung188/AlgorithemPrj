package com.jianzhioffer;

import com.tool.ToolUtils;

/**
 * 旋转数组的最小数
 * @author Harry.Yang
 * 2018年8月28日 下午10:34:55
 */
public class _8FindMinimunInRotatedArray {
	
	public static void main(String[] args) {
		int[] array = {5,6,7,8,4};
		int minimum = findMinimum(array);
		System.out.println(minimum);
	}

	private static int findMinimum(int[] array) {
		if(array == null){
			return -1;
		}
		if(array.length == 1){
			return array[0];
		}
		if(array.length == 2){
			if(array[0]>array[1]){
				return array[1];
			} else {
				return array[0];
			}
		}
		if(array[0]<array[array.length-1]){
			return array[0];
		}
		int left = 0;
		int right = array.length-1;
		int middle = (left+right)/2;
		while(middle>left&&array[middle]>array[middle-1]){
			if(array[middle]>array[right]){
				left = middle;
			} else{
				right = middle;
			}			
			middle = (left+right)/2;		  
		}
		if(middle>left){
			return array[middle];
		} else{
			if(array[left]>array[right]){
				return array[right];
			} else {
				return array[left];
			}
		}
	}

}
