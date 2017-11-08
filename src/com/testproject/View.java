package com.testproject;

import java.util.List;

public class View {

	public String formView(List<List<Integer>> list) {

		String result;
		StringBuilder builder = new StringBuilder();

		if (list != null) {
			for (List<Integer> subList : list) {

				for (Integer item : subList) {
					if (subList.indexOf(item) == subList.size() - 1) {
						builder.append(item);
					} else {
						builder.append(item + ", ");
					}
				}
				builder.append("\n");
			}
			result = builder.toString();
		} else {
			result = "null";
		}
		return result;

	}
}
