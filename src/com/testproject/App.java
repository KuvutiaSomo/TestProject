package com.testproject;

import java.util.List;

public class App {

	public static void main(String[] args) {

		App app = new App();

		// app.demoUtils();

		app.demoUtils2();

	}

	private void demoUtils() {

		DataService dataService = new DataService();
		View view = new View();
		Utils utils = new Utils();

		// Get data
		List<List<Integer>> list = dataService.formData();

		// Process data
		long startTime = System.currentTimeMillis();
		List<Integer> sortedList = utils.sort(list);
		long estimatedTime = System.currentTimeMillis() - startTime;

		// Show results
		/*
		 * System.out.println("Initial data:");
		 * System.out.println(view.formView(list));
		 *
		 * System.out.println("Output:");
		 * System.out.println(sortedList.toString());
		 */

		System.out.println("Utils V1:" + estimatedTime);
	}

	private void demoUtils2() {
		DataService dataService = new DataService();
		View view = new View();
		Utils2 utils = new Utils2();

		// Get data
		List<List<Integer>> list = dataService.formData();

		// Process data
		long startTime = System.currentTimeMillis();
		List<Integer> sortedList = utils.sort(list);
		long estimatedTime = System.currentTimeMillis() - startTime;

		// Show results
		/*
		 * System.out.println("Initial data:");
		 * System.out.println(view.formView(list));
		 *
		 * System.out.println("Output:");
		 * System.out.println(sortedList.toString());
		 */

		System.out.println("Utils V2:" + estimatedTime);
	}

}
