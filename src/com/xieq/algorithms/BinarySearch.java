package com.xieq.algorithms;

import java.util.Arrays;

/**
 * 二分法查找查找元素索引:输入：一个数组，一个元素，查找这个元素在这个数组中的索引，不存在就返回-1 关键点：1，对于给定的集合或数组需要排序，2，
 * 
 * @author xieq
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int result = runk(100, new int[] { 61, 54, 57, 512, 24, 56, 31, 78, 32 });
		System.out.println(result);
		/*System.out.println(1.0 / 0.0);
		System.out.println(1 / 0);*/
	}

	static int runk(int key, int[] array) {
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int lo = 0;
		int hi = array.length - 1;
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (key < array[mid]) {
				hi = mid - 1;// 这里是关键
			} else if (key > array[mid]) {
				lo = mid + 1;// 这里是关键
			} else {
				return mid;
			}
		}
		return -1;
	}
}
