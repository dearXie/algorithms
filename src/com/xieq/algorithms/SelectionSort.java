package com.xieq.algorithms;

/**
 * 选择排序：循环一个数组，将当前元素与其他元素比较大小，若其他元素比当前元素小，就交换两者的顺序
 * 
 * @author Xieq
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] aa = new int[] { 43, 45, 7, 31, 9788972, 312324, 45, 78, 23, 12, 43, 43, 5, 67, 778, 9, 43, 0 };
		for (int i = 0; i < aa.length; i++) {
			for (int j = i + 1; j < aa.length; j++) {
				if (aa[j] < aa[i]) {
					int tmp = aa[j];
					aa[j] = aa[i];
					aa[i] = tmp;
				}
			}
		}
		for (int i : aa) {
			System.out.println(i);
		}
	}
}
