package com.sort;

import com.tool.ToolUtils;

/**
 * 堆排序
 * @author Harry.Yang
 * 2018年8月26日 下午10:22:00
 */
public class HeapSort {
	
	public static void main(String[] args) {
		int[] array = ToolUtils.generateArray(20);
		sort(array);
		ToolUtils.print(array);
	}

	private static void sort(int[] array) {
		if(array == null || array.length == 1){
			return;
		}
		int length = array.length;
		//构建堆
		int trickleIndex = array.length/2-1;
		while(trickleIndex>=0){
		    int leftChild = trickleIndex*2+1;
		    int rightChild = trickleIndex *2 +2;
		    if(rightChild >= array.length){
		    	if(leftChild >= array.length){		    		
		    	} else{
		    		if(array[leftChild]>array[trickleIndex]){
		    			ToolUtils.swap(array, leftChild, trickleIndex);
		    			trickleDown(array,leftChild,length);
		    		}
		    	}
		    } else {
		    	if(array[rightChild]>array[leftChild]){
		    		if(array[rightChild]>array[trickleIndex]){
		    			ToolUtils.swap(array, rightChild, trickleIndex);
		    			trickleDown(array,rightChild,length);
		    		}
		    	} else{
		    		if(array[leftChild]>array[trickleIndex]){
		    			ToolUtils.swap(array, leftChild, trickleIndex);
		    			trickleDown(array,leftChild,length);
		    		}
		    	}		    	
		    }
		    trickleIndex--;
		}
		
		//大顶堆，取出最大值放到最后
		int arrangedSize = 0;
		while(arrangedSize < length){
			ToolUtils.swap(array, 0, length-1-arrangedSize);
			trickleDown(array, 0,length-1-arrangedSize);//注意避免trickleDown much
			arrangedSize++;			
		}
		
	}
	
	//向下传递
	private static void trickleDown(int[] array, int trickleIndex,int range){		
		int leftChild = trickleIndex*2+1;
	    int rightChild = trickleIndex *2 +2;
	    if(rightChild >= range){
	    	if(leftChild >= range){		    		
	    	} else{
	    		if(array[leftChild]>array[trickleIndex]){
	    			ToolUtils.swap(array, leftChild, trickleIndex);
	    			trickleDown(array,leftChild,range);
	    		}
	    	}
	    } else {
	    	if(array[rightChild]>array[leftChild]){
	    		if(array[rightChild]>array[trickleIndex]){
	    			ToolUtils.swap(array, rightChild, trickleIndex);
	    			trickleDown(array,rightChild,range);
	    		}
	    	} else{
	    		if(array[leftChild]>array[trickleIndex]){
	    			ToolUtils.swap(array, leftChild, trickleIndex);
	    			trickleDown(array,leftChild,range);
	    		}
	    	}		    	
	    }
	}

}
