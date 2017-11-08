package com.testproject;

import java.util.List;

public class App {

	public static void main(String[] args) {

		DataService dataService = new DataService();
		View view = new View();
		Utils utils = new Utils();

		// Get data
		List<List<Integer>> list = dataService.formData();

		// Process data
		List<Integer> sortedList = utils.sort(list);

		// Show results
		System.out.println("Initial data:");
		System.out.println(view.formView(list));

		System.out.println("Output:");
		System.out.println(sortedList.toString());

	}

}
