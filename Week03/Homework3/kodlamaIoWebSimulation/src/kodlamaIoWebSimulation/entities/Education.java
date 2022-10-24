package kodlamaIoWebSimulation.entities;

import kodlamaIoWebSimulation.business.ValidateManager;

public class Education {
	private int id;
	private String category;
	private String courseName;
	private String educator;
	private double coursePrice;

	Validate validate = new Validate();
	ValidateManager validateManager = new ValidateManager();

	public Education(int id, String category, String courseName, String educator, double coursePrice) throws Exception {
		this.id = id;
		this.category = category;
		this.courseName = courseName;
		this.educator = educator;
		this.coursePrice = coursePrice;

		if (!validateManager.isValidCategory(category)) {
			validate.addCategory(category);
		} else {
			throw new Exception(category + ": daha önce girilmiş, lütfen farklı değer giriniz.");
		}
		if (!validateManager.isValidCourseName(courseName)) {
			validate.addCourseName(courseName);
		} else {
			throw new Exception(courseName + ": daha önce girilmiş, lütfen farklı değer giriniz.");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getEducator() {
		return educator;
	}

	public void setEducator(String educator) {
		this.educator = educator;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}
