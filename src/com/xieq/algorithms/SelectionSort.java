package com.xieq.algorithms;

/**
 * ѡ������ѭ��һ�����飬����ǰԪ��������Ԫ�رȽϴ�С��������Ԫ�رȵ�ǰԪ��С���ͽ������ߵ�˳��
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
