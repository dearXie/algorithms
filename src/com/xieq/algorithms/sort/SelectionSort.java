package com.xieq.algorithms.sort;

import com.xieq.algorithms.XieqUtils;

/**
 * ѡ������ѭ��һ�����飬����ǰԪ��������Ԫ�رȽϴ�С��������Ԫ�رȵ�ǰԪ��С���ͽ������ߵ�˳��, ���ڳ���Ϊn������ʹ��ѡ������Ҫ����
 * n��ƽ��-1/2�αȽϣ���n������ѡ�����򲻻������������Ԫ��
 * 
 * @author Xieq
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		Integer[] aa = XieqUtils.getAIntegerArray(10);
		for (int i = 0; i < aa.length; i++) {
			for (int j = i + 1; j < aa.length; j++) {
				// �Ƚϴ�С
				if (XieqUtils.lessThan(aa[i], aa[j])) {
					// ����λ��
					XieqUtils.exchange(i, j, aa);
				}
			}
		}
		// ��������
		XieqUtils.printf(aa);
	}
}
