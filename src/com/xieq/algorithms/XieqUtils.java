package com.xieq.algorithms;

import java.util.Random;

public class XieqUtils {

	/**
	 * 比较两个double的数字 的大小，若 a<b 返回true
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean lessThan(Double a, Double b) {
		if (a < b) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 比较两个double的数字 的大小，若 a<b 返回true
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean lessThan(Integer a, Integer b) {
		if (a < b) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 交换数组中位置i与位置j两个位置的元素
	 * 
	 * @param i
	 * @param j
	 * @param aa
	 */
	public static void exchange(Integer i, Integer j, Double[] aa) {
		Double tmp = aa[i];
		aa[i] = aa[j];
		aa[j] = tmp;
	}

	/**
	 * 交换数组中位置i与位置j两个位置的元素
	 * 
	 * @param i
	 * @param j
	 * @param aa
	 */
	public static void exchange(Integer i, Integer j, Integer[] aa) {
		Integer tmp = aa[i];
		aa[i] = aa[j];
		aa[j] = tmp;
	}

	public static void printf(Double[] aa) {
		for (Double i : aa) {
			System.out.println(i);
		}
	}

	public static void printf(Integer[] aa) {
		for (Integer i : aa) {
			System.out.println(i);
		}
	}

	/**
	 * 生成包含i个double类型de元素的数组
	 * 
	 * @param i
	 * @return
	 */
	public static Double[] getADoubleArray(int i) {
		Random random = new Random();
		Double[] aa = new Double[i];
		for (int j = 0; j < aa.length; j++) {
			aa[j] = random.nextDouble();
		}
		return aa;
	}

	/**
	 * 生成包含i个double类型的元素的数组
	 * 
	 * @param i
	 * @return
	 */
	public static Integer[] getAIntegerArray(int i) {
		Random random = new Random();
		Integer[] aa = new Integer[i];
		for (int j = 0; j < aa.length; j++) {
			aa[j] = random.nextInt(100);
		}
		return aa;
	}
}
