package com.testproject;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	public List<Integer> sort(List<List<Integer>> initialList) {

		if (initialList == null) {
			throw new RuntimeException("Not valid initial data!");
		}

		List<Integer> resList = initialList.get(0);
		List<Integer> curList;

		int listIndex = 1;

		// Iterate over all lists
		while (listIndex < initialList.size()) {
			curList = initialList.get(listIndex);
			resList = merge2(resList, curList);
			listIndex++;
		}
		return resList;
	}

	/**
	 * Merges two sorted lists into one sorted list.
	 *
	 * @param first,
	 *            sorted list
	 * @param second,
	 *            sorted list
	 * @return
	 */
	private List<Integer> merge(List<Integer> first, List<Integer> second) {

		if (first == null || second == null) {
			throw new RuntimeException("Not valid data!");
		}

		List<Integer> newList = new ArrayList<>();

		int firstListSize = first.size();
		int secondListSize = second.size();

		int firstListIndex = 0;

		while (firstListIndex < firstListSize) {

			int secondListIndex = 0;
			while (secondListIndex < secondListSize) {

				// Add current array to a new array as there are no elements
				// in the first list
				if (firstListIndex >= firstListSize) {
					newList.add(second.get(secondListIndex));
					secondListIndex++;
				} else {
					int a = first.get(firstListIndex);
					int b = second.get(secondListIndex);

					// Add minimum element in the final array
					if (a <= b) {
						newList.add(a);
						firstListIndex++;
					} else {
						newList.add(b);
						secondListIndex++;
					}
				}
			}
			// There are no elements in second list. Add elements from
			// the first list.
			if (firstListIndex < firstListSize) {
				while (firstListIndex < firstListSize) {
					newList.add(first.get(firstListIndex));
					firstListIndex++;
				}
			}
		}
		return newList;
	}

	// https://stackoverflow.com/questions/5958169/how-to-merge-two-sorted-arrays-into-a-sorted-array
	private List<Integer> merge2(List<Integer> a, List<Integer> b) {

		if (a == null || b == null) {
			throw new RuntimeException("Not valid data!");
		}

		List<Integer> newList = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < a.size() && j < b.size()) {
			if (a.get(i) < b.get(j)) {
				newList.add(a.get(i));
				i++;
			} else {
				newList.add(b.get(j));
				j++;
			}
		}

		while (i < a.size()) {
			newList.add(a.get(i));
			i++;
		}

		while (j < b.size()) {
			newList.add(b.get(j));
			j++;
		}
		return newList;
	}

}
