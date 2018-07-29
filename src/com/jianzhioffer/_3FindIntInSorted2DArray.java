package com.jianzhioffer;

import com.tool.ToolUtils;

/**
 * 在二维数组中查找整数
 * @author Harry.Yang
 * 2018年7月29日 下午8:17:30
 */
public class _3FindIntInSorted2DArray {
	
	public static void main(String[] args) {
		int[][] array = {
				{1,2,3,3,3,3,3,5,7},
				{2,2,4,3,3,3,3,5,7},
				{1,2,4,3,3,3,4,5,7},
				{1,2,4,6,7,9,11,11,19},
				{1,2,4,6,7,9,11,11,23}};
		ToolUtils.print(find(array,9));
		
	}
	
	private static int[] find(int[][] array ,int number){
		if(array == null || array.length ==0 ||array[0].length ==0){
			return null;
		}
		int row=0;
		int column=array[0].length-1;
		while(row <array.length && column >=0){
			if(array[row][column] == number){
				return new int[]{row,column};
			} else if(array[row][column] > number){
				column--;
			} else {
				row++;
			}
		}
		return null;
	}

}
