package com.tool;

import java.util.Arrays;
import java.util.Random;

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
	
	public static int[] generateArray(int length){
		if(length <1){
			return null;
		}
		int array[] = new int[length];
		Random random = new Random(100);
		for (int index =0;index < length;index++){
			array[index] = random.nextInt(100);
		}
		print(array);
		return array;
	}

}
