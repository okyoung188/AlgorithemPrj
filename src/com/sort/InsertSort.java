package com.sort;
import java.util.Arrays;

public class InsertSort {
	private static void swap(int[] array,int i, int j) {
		int a= array[i];
		array[i] = array[j];
		array[j] = a;		
	}
	
	public static void main(String[] args) {
		int[] array = {2,9,22,12,4,3,6,7,3,0,1,-1};
		method1(array);
		method2(array);
	}

	/**
	 * 从小到大，先从小头开始,for循环
	 * @param param
	 */
	private static void method1(int[] param) {
		int[] array= Arrays.copyOf(param, param.length);
		int temp=0;
		for (int out=1;out<array.length;out++){
			temp=array[out];
			int in=out-1;
			for (;in>=-1;in--){
				if(in==-1){
					array[0]=temp;
					break;
				}
				if(array[in] > temp){
					array[in+1]=array[in];
				} else {
					array[in+1] = temp;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * while循环
	 * @param param
	 */
	public static void method2(int[] param){
		int[] array= Arrays.copyOf(param, param.length);
		int temp=0;
		for (int out=1;out<array.length;out++){
			temp=array[out];
			int in=out;
			while(in>0 && array[in-1] > temp){
				array[in]=array[in-1];
				in--;
			}
     		array[in]=temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
 