package com.sort;
import java.util.Arrays;

public class SelectSort {

	private static void swap(int[] array,int i, int j) {
		int a= array[i];
		array[i] = array[j];
		array[j] = a;		
	}
	
	/**
	 * 较为抽象的写法，因为用了排好的个数这个抽象的概念，而不是index指针（形象）
	 * @param param
	 */
	public static void method1(int[] param){
		int maxIndex = 0;
		int[] array= Arrays.copyOf(param, param.length);
		//已拍好最大的个数
		for(int out=0;out < array.length-1 ; out ++){
			maxIndex=0;
			for (int in=1;in < array.length - out;in++){
				if(array[maxIndex]<array[in]){
					maxIndex=in;
				}
			}
			if(maxIndex!= array.length-out-1){//已拍好大小的前一个index
				swap(array,maxIndex,array.length-out-1);
			}			
		}
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * out表示index
	 * @param param
	 */
	public static void method2(int[] param){
		int[] array=Arrays.copyOf(param, param.length);
		int maxIndex=0;
		//out 表示本次循环需要放置的index
		for (int out=array.length - 1;out > 0;out --){
			maxIndex=0;
			for (int in=1;in <= out;in ++){//注意这里in<=out
				if(array[maxIndex]<array[in]){
					maxIndex=in;
				}
			}
			if(maxIndex !=out){
				swap(array,maxIndex,out);
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * 
	 * @param param
	 */
	public static void method3(int[] param){
		int[] array=Arrays.copyOf(param, param.length);
		//选择排序需要用数组内的空间进行交换，而不是用额外的空间保存index
		//
		for(int out=array.length-1;out > 0;out--){
			for (int in=0;in < out;in ++){
				if(array[in] > array[out]){
					swap(array,in,out);
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		int[] array = {2,9,22,12,4,3,6,7,3,0,1,-1};
		method1(array);
		method2(array);
		method3(array);
		
	}
}
