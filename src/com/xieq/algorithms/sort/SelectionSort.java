package com.xieq.algorithms.sort;

import com.xieq.algorithms.XieqUtils;

/**
 * 选择排序：循环一个数组，将当前元素与其他元素比较大小，若其他元素比当前元素小，就交换两者的顺序, 对于长度为n的数组使用选择排序要进行
 * n的平方-1/2次比较，和n次排序，选择排序不会访问索引左侧的元素
 * 
 * @author Xieq
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		Integer[] aa = XieqUtils.getAIntegerArray(10);
		for (int i = 0; i < aa.length; i++) {
			for (int j = i + 1; j < aa.length; j++) {
				// 比较大小
				if (XieqUtils.lessThan(aa[i], aa[j])) {
					// 交换位置
					XieqUtils.exchange(i, j, aa);
				}
			}
		}
		// 排序后输出
		XieqUtils.printf(aa);
	}
}
