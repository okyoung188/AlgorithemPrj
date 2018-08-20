package com.sort;

import com.tool.ToolUtils;

/**
 * 归并排序
 * @author Harry.Yang
 * 2018年8月20日 下午10:49:23
 */
public class MergeSort {
	
	public static void main(String[] args) {		
		int[] array = { 2, 3, 4, 5,1,2,5,7,8,9 };
		ToolUtils.print(method(array,4));		
	}
	
	static int[] method(int[] array,int splitIndex){
		if(array== null || array.length == 0||splitIndex <0){
			return null;
		}
		int[] copy = new int[array.length];
		int copyIndex = 0;
		int leftIndex = 0;
		int rightIndex = splitIndex;
		while(true){
			if(leftIndex==splitIndex){
				break;
			}
			if(rightIndex == array.length){
				break;
			}
			if(array[leftIndex]<array[rightIndex]){
				copy[copyIndex++]=array[leftIndex];
				leftIndex++;
			} else {
				copy[copyIndex++]=array[rightIndex];
				rightIndex++;
			}
		}
		if(leftIndex== splitIndex){
			while(rightIndex < array.length){
				copy[copyIndex++]=array[rightIndex];
				rightIndex++;
			}
		}else if(rightIndex == array.length){
			while(leftIndex < splitIndex){
				copy[copyIndex++]=array[leftIndex];
				leftIndex++;
			}
		}
		return copy;
	}

}
