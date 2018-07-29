package com.sort;

import com.tool.ToolUtils;

public class ShellSort {

	public static void main(String[] args) {
		int[] array = { 2, 9, 22, 12, 4, 3, 6, 7, 3, 0, 1, -1 };
		method1(array);
		method2(array);
		method3(array);

	}

	private static void method1(int[] array) {

		array = ToolUtils.copy(array);
		// ������
		int h = 1;
		while (h < 10) {
			h = 3 * h + 1;
		}
		// ���һ��ѭ��ʱ��h=1,��Ϊ��������
		while (h >= 1) {
			for (int out = 0; out < h; out++) {
				for (int in = out + h; in < array.length; in += h) {
					int temp = array[in];
					int xx = 0;
					for (xx = in; xx - h >= 0; xx -= h) {
						if (array[xx - h] > temp) {
							array[xx] = array[xx - h];
						} else {
							break;
						}
					}
					array[xx] = temp;
				}
			}
			h = (h - 1) / 3;
		}
		ToolUtils.print(array);
	}

	static void method2(int[] array) {
		array = ToolUtils.copy(array);
		// ������
		int h = 1;
		while (h < 10) {
			h = 3 * h + 1;
		}
		// ���һ��ѭ��ʱ��h=1,��Ϊ��������
		while (h >= 1) {
			for (int out = 0; out < h; out++) {
				for (int in = out; in + h < array.length; in += h) {
					int temp = array[in+h];
					int xx = 0;					
					for (xx = in+h; xx - h >= 0; xx -= h) {
						if (array[xx - h] > temp) {
							array[xx] = array[xx - h];
						} else {
							break;
						}
					}
					array[xx] = temp;
				}
			}
			h = (h - 1) / 3;
		}
		ToolUtils.print(array);

	}
	
	static void method3(int[] array){
		array = ToolUtils.copy(array);
		// ������
		int h = 1;
		while (h < 10) {
			h = 3 * h + 1;
		}
		while(h > 0){
			//out�ͱ�ʾҪ����ĵ�һ����
			for (int out=h;out<array.length;out++){		
				int in=out;
			    int temp = array[in];
			    //in��λ��Ϊ��λ��,���ŵ�λ��
				while(in > h-1 && array[in-h]>temp){
					array[in]=array[in-h];
					in-=h;
				}
				array[in]=temp;
			}		
			
			h=(h-1)/3;
		}
		ToolUtils.print(array);
	}

}
