package com.sort;
import java.util.Arrays;

public class SelectSort {

	private static void swap(int[] array,int i, int j) {
		int a= array[i];
		array[i] = array[j];
		array[j] = a;		
	}
	
	/**
	 * ��Ϊ�����д������Ϊ�����źõĸ����������ĸ��������indexָ�루����
	 * @param param
	 */
	public static void method1(int[] param){
		int maxIndex = 0;
		int[] array= Arrays.copyOf(param, param.length);
		//���ĺ����ĸ���
		for(int out=0;out < array.length-1 ; out ++){
			maxIndex=0;
			for (int in=1;in < array.length - out;in++){
				if(array[maxIndex]<array[in]){
					maxIndex=in;
				}
			}
			if(maxIndex!= array.length-out-1){//���ĺô�С��ǰһ��index
				swap(array,maxIndex,array.length-out-1);
			}			
		}
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * out��ʾindex
	 * @param param
	 */
	public static void method2(int[] param){
		int[] array=Arrays.copyOf(param, param.length);
		int maxIndex=0;
		//out ��ʾ����ѭ����Ҫ���õ�index
		for (int out=array.length - 1;out > 0;out --){
			maxIndex=0;
			for (int in=1;in <= out;in ++){//ע������in<=out
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
		//ѡ��������Ҫ�������ڵĿռ���н������������ö���Ŀռ䱣��index
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
