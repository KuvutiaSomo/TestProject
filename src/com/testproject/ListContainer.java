package com.testproject;

import java.util.List;

public class ListContainer implements Comparable<ListContainer> {

	private List<Integer> list;
	private int index;

	public ListContainer(List<Integer> list, int index) {
		this.list = list;
		this.index = index;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public int compareTo(ListContainer o) {
		return this.list.get(this.index) - o.list.get(o.index);
	}
}
