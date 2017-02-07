package com.xieq.algorithms.sort;

import com.xieq.algorithms.XieqUtils;

/**
 * �������򣺾�����˿�����һ��������һ���Ʒ������ϣ����ڶ������һ�űȽϴ�С��
 *        ���ڶ��űȵ�һ����С�ͷ��ڵ�һ�ŵ���ߣ��������ƣ�������ֻ����ڶ��Ž��бȽ�
 *        �������򲻻���������Ҳ��Ԫ��
 * 
 * @author dell
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		Integer[] aa = XieqUtils.getAIntegerArray(10);
		int n = aa.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && XieqUtils.lessThan(aa[j], aa[j - 1]); j--) {
				XieqUtils.exchange(j - 1, j, aa);
			}

		}
		XieqUtils.printf(aa);
	}

}
