package com.tool;

import java.util.Arrays;

public class ToolUtils {
	
	public static void swap(int[] array,int i, int j) {
		int a= array[i];
		array[i] = array[j];
		array[j] = a;		
	}
	
	public static void print(int[] array){
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] copy(int[] array){
		return Arrays.copyOf(array, array.length);
	}

}
