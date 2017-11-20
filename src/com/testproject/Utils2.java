package com.testproject;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Utils2 {

	public List<Integer> sort(List<List<Integer>> initialList) {

		if (initialList == null) {
			throw new RuntimeException("Not valid initial data!");
		}

		List<Integer> resList = new ArrayList<>();
		PriorityQueue<ListContainer> heap = new PriorityQueue<ListContainer>();

		// Add lists to the min heap which is PriorityQueue
		for (int i = 0; i < initialList.size(); i++) {
			heap.add(new ListContainer(initialList.get(i), 0));
		}

		while (!heap.isEmpty()) {
			ListContainer listContainer = heap.poll();
			resList.add(listContainer.getList().get((listContainer.getIndex())));

			if (listContainer.getIndex() < listContainer.getList().size() - 1) {
				listContainer.setIndex(listContainer.getIndex() + 1);
				heap.add(listContainer);
			}
		}

		return resList;
	}

}
