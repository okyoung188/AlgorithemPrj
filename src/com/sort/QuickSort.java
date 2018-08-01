package com.sort;

import com.tool.ToolUtils;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 2, 9, 22, 12, 4, 3, 6, 7, 3, 0, 1, -1 };
		method1(array);
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

}
