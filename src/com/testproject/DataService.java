package com.testproject;

import java.util.ArrayList;
import java.util.List;

public class DataService {

	/*
	 * Lists should be sorted here (in ascending order).
	 */
	public List<List<Integer>> formData() {

		List<Integer> list1 = initArray(0, 1, 80000);
		List<Integer> list2 = initArray(-4, 3, 45000);
		List<Integer> list3 = initArray(-80, 10, 40000);

		/*
		 * List<Integer> list4 = new ArrayList<>();
		 *
		 * list4.add(100); list4.add(200); list4.add(400); list4.add(500);
		 * list4.add(600);
		 *
		 * List<Integer> list5 = new ArrayList<>();
		 *
		 * list5.add(1); list5.add(1); list5.add(1); list5.add(1); list5.add(1);
		 *
		 * List<Integer> list6 = new ArrayList<>();
		 *
		 * list6.add(-2); list6.add(-1); list6.add(0);
		 *
		 * List<Integer> list7 = new ArrayList<>(); list7.add(-3);
		 */

		List<List<Integer>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		/*
		 * list.add(list4); list.add(list5); list.add(list6); list.add(list7);
		 */

		return list;
	}

	private List<Integer> initArray(int start, int increment, int size) {

		List<Integer> list = new ArrayList<>();
		int value = start;

		for (int i = 0; i < size; i++) {
			list.add(value);
			value += increment;
		}

		return list;
	}

}
