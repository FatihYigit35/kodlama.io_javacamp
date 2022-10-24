package kodlamaIoWebSimulation.business;

import kodlamaIoWebSimulation.entities.Validate;

public class ValidateManager {

	Validate validate = new Validate();

	public boolean isValidCategory(String data) {
		boolean isValid = false;

		for (int i = 0; i < validate.getCategorySize(); i++) {
			if (validate.getCategory(i) == data) {
				isValid = true;
			}
		}
		return isValid;
	}

	public boolean isValidCourseName(String data) {
		boolean isValid = false;

		for (int i = 0; i < validate.getCourseNameSize(); i++) {
			if (validate.getCourseName(i) == data) {
				isValid = true;
			}
		}
		return isValid;
	}

}
