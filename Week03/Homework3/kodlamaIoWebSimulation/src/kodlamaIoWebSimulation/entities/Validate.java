package kodlamaIoWebSimulation.entities;

import java.util.ArrayList;

public class Validate {
	private static ArrayList<String> courseName = new ArrayList<String>();
	private static ArrayList<String> category = new ArrayList<String>();

	public void addCourseName(String courseName) {
		Validate.courseName.add(courseName);
	}

	public String getCourseName(int i) {
		return courseName.get(i);
	}

	public int getCourseNameSize() {
		return courseName.size();

	}

	public void addCategory(String category) {
		Validate.category.add(category);
	}

	public String getCategory(int i) {
		return category.get(i);
	}

	public int getCategorySize() {
		return category.size();

	}

}
