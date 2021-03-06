package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		return Arrays.stream(elements).sum() / elements.length;
	}

	public static int mode(int[] elements) {
		int auxiliarCount = 0;
		int count = 0;
		int number = 0;
		for (int index = 0; index < elements.length; index += 1) {
			for (int key = 0; key < elements.length; key += 1) {
				if (elements[index] == elements[key]) {              //[1,2,2,3,3,4,4,4,5,5,6,7,8
					count += 1;
				}
				if (auxiliarCount <= count) {
					auxiliarCount = count;
					number = elements[index];
				}
			}
			count = 0;
		}
		return number;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int number = 0;
		if (elements.length / 2 == 0) {
			number = ((elements[(elements.length -1) / 2]) + (elements[((elements.length - 1) /2) + 1]));
			number = number / 2;
		} else {
			number = elements[((elements.length -1) + 1) / 2];
		}
		return number;
	}
}