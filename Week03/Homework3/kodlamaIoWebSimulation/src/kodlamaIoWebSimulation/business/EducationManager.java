package kodlamaIoWebSimulation.business;

import kodlamaIoWebSimulation.dataAccess.EducationDao;
import kodlamaIoWebSimulation.entities.Education;
import kodlamaIoWebSimulation.logging.Logger;

public class EducationManager {
	private EducationDao educationDao;
	private Logger[] loggers;

	public EducationManager(EducationDao educationDao, Logger[] loggers) {
		this.educationDao = educationDao;
		this.loggers = loggers;
	}

	public void add(Education education) throws Exception {

		if (education.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0 'dan küçük olamaz");
		}

		educationDao.add(education);
		for (Logger logger : loggers) {
			logger.log(education.getCategory());
			logger.log(education.getCourseName());
			logger.log(education.getEducator());
			System.out.println("----------------------------------");
		}

	}

}
