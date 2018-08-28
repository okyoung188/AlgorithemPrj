package com.search;

/**
 * 
 * @author Harry.Yang
 * 2018年8月28日 下午10:18:16
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		int array[] = {1,2,4,6,7,8,9,12,15,17,18,19,20,55};
		System.out.println(method(array,4));
	}
	
	static int method(int[] array,int value){
		if(array == null || array.length == 0 || array[0] > value || array[array.length-1] < value){
			return -1;
		}
		//只有一个元素
		if(array.length == 1){
			return 0;
		}
		if(array[0]== value){
			return 0;
		}
		if(array[array.length -1] == value){
			return array.length-1;
		}
		//最左小于value，最右大于value
		int index = -1;
		int left =0,right=array.length-1;		
		while(true){
			if(left == right -1){
				break;
			}
			int middle= (left+right)/2;			
			if(array[middle] == value){
				index= middle;
				break; 
			}else if(array[middle] < value){
				left = middle;
			} else{
				right = middle;
			}
		}
		return index;
	}

}
