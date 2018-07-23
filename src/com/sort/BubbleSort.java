package com.sort;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {2,9,22,12,4,3,6,7,3,0,1,-1};
		method1(array);
	}
	
	
	public static void method1(int[] param){
		int array[] = Arrays.copyOf(param, param.length);
		for (int out = array.length - 1; out > 0;out--){
			for (int in=0;in <out ; in++){
				if(array[in] > array[in+1]){
					swap(array,in,in+1);
				}
			}
		}
		System.out.println(Arrays.toString(array));		
	}

	private static void swap(int[] array,int i, int j) {
		int a= array[i];
		array[i] = array[j];
		array[j] = a;		
	}

}
