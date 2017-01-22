package com.xieq.algorithms;

import java.util.Arrays;

/**
 * ���ַ����Ҳ���Ԫ������:���룺һ�����飬һ��Ԫ�أ��������Ԫ������������е������������ھͷ���-1 �ؼ��㣺1�����ڸ����ļ��ϻ�������Ҫ����2��
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
				hi = mid - 1;// �����ǹؼ�
			} else if (key > array[mid]) {
				lo = mid + 1;// �����ǹؼ�
			} else {
				return mid;
			}
		}
		return -1;
	}
}
