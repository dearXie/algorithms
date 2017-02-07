package com.xieq.algorithms.sort;

import com.xieq.algorithms.XieqUtils;

/**
 * 插入排序：就像打扑克排序一样，摸第一张牌放在手上，摸第二张与第一张比较大小，
 *        若第二张比第一张牌小就放在第一张的左边，依次类推，第三张只需与第二张进行比较
 *        插入排序不会访问索引右侧的元素
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
