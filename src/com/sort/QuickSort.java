package com.sort;

import com.tool.ToolUtils;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 2, 9, 22, 12, 4, 3, 6, 7, 3, 0, 1, -1 };
		method1(array);
		method2(ToolUtils.generateArray(50));
	}

	private static void method1(int[] param) {
		int[] array = ToolUtils.copy(param);
		sort(array, 0, array.length - 1);
		ToolUtils.print(array);
	}

	private static void sort(int[] array, int leftIndex, int rightIndex) {
		// 出口条件
		if (array == null || leftIndex >= rightIndex || leftIndex < 0 || rightIndex > array.length - 1) {
			return;
		}
		int size = rightIndex - leftIndex + 1;
		if(size == 2){
			if(array[leftIndex] > array[rightIndex]){
				ToolUtils.swap(array, rightIndex, leftIndex);
			}
		} else if(size == 3){
			if(array[leftIndex] > array[rightIndex]){
				
			}
		}
		int middleIndex = partition(array, leftIndex, rightIndex);
		//size ==2,3时，无法划分
		if (middleIndex < 0) {
			return;
		}
		sort(array, leftIndex, middleIndex - 1);
		sort(array, middleIndex + 1, rightIndex);
	}

	/**
	 * 划分方法
	 * 
	 * @param array
	 * @param leftIndex
	 * @param rightIndex
	 * @return
	 */
	private static int partition(int[] array, int leftIndex, int rightIndex) {
		// 边界            
		if (array == null || leftIndex >= rightIndex || leftIndex < 0 || rightIndex > array.length - 1) {
			return -1;
		}
		int middleIndex = (leftIndex + rightIndex) / 2;
		int pivot = middleIndex;
		if (array[leftIndex] >= array[rightIndex]) {
			if (array[middleIndex] >= array[leftIndex]) {
				pivot = leftIndex;
			} else if (array[middleIndex] <= array[rightIndex]) {
				pivot = rightIndex;
			}
		} else {
			if (array[middleIndex] >= array[rightIndex]) {
				pivot = rightIndex;
			} else if (array[middleIndex] <= array[leftIndex]) {
				pivot = leftIndex;
			}
		}
		// 移位到最右端
		if (pivot != rightIndex) {
			ToolUtils.swap(array, pivot, rightIndex);
			pivot = rightIndex;
		}

		// 偏移一个数
		leftIndex--;
		while (true) {
			while (array[++leftIndex] < array[pivot] && leftIndex < rightIndex) {
			}
			while (array[--rightIndex] >= array[pivot] && rightIndex > leftIndex) {
			}
			if (rightIndex <= leftIndex) {
				break;
			}
			ToolUtils.swap(array, leftIndex, rightIndex);
		}
		ToolUtils.swap(array, pivot, leftIndex);
		return leftIndex;
	}
	
	
	/*--------------------------------------------
	 * 
	 * 第二种方法
	----------------------------------------------*/
    static void method2(int[] param){
		int[] array = ToolUtils.copy(param);
		sort2(array, 0, array.length - 1);
		ToolUtils.print(array);
	}

    //recursive sort,left right表示需要排序的index
	private static void sort2(int[] array, int left, int right) {
		//1.abnormal array length
		if(array == null || array.length == 1|| left >= right|| left <0 || right >array.length -1){
			return;
		}		
		//2.array length==2
		if(left == right -1){
			if(array[left]> array[right]){
				ToolUtils.swap(array, left, right);
			}			
			return;
		}
		
		//3.array length > 2 
		//find pivot
		int middle = (left+right)/2;
		int pivotIndex = 0;
		if(array[left]>= array[middle]){
			if(array[right] >= array[middle]){
				if(array[right] >= array[left]){
					pivotIndex = left;
				} else {
					pivotIndex = right;
				}
			} else {
				pivotIndex = middle;
			}
		} else{
			if(array[right] >= array[middle]){
				pivotIndex = middle;
			} else {
				if(array[right] >= array[left]){
					pivotIndex = right;
				} else{
					pivotIndex = left;
				}
			}
		}
		ToolUtils.swap(array, pivotIndex, right);
		//partition with pivot		
		int leftRef = left;
		int rightRef = right;
		leftRef--;
		while(true){
			while(array[++leftRef] < array[right]&& leftRef <rightRef){
			}
			while(array[--rightRef] >= array[right] && leftRef <rightRef){				
			}
			if(leftRef>= rightRef){
				break;
			}
			ToolUtils.swap(array, leftRef, rightRef);
		}
		
		ToolUtils.swap(array, rightRef, right);		
		int partitionIndex = leftRef;
		
		//recursive sort with partition index
		sort(array, left, partitionIndex - 1);
		sort(array, partitionIndex + 1, right);		
	}
	
	static void partition1(){
		
	}

}
