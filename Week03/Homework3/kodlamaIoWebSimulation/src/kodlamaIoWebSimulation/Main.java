package kodlamaIoWebSimulation;

import kodlamaIoWebSimulation.business.EducationManager;
import kodlamaIoWebSimulation.dataAccess.HibernateEducationDao;
import kodlamaIoWebSimulation.dataAccess.JdbcEducationDao;
import kodlamaIoWebSimulation.entities.Education;
import kodlamaIoWebSimulation.logging.DatabaseLogger;
import kodlamaIoWebSimulation.logging.EmailLogger;
import kodlamaIoWebSimulation.logging.FileLogger;
import kodlamaIoWebSimulation.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {

		Education education1 = new Education(1, "Başlangıç seviye", "Java1", "Engin Demiroğ", 0);
		Education education2 = new Education(2, "Orta seviye", "Java2", "Engin Demiroğ", 0);
		Education education3 = new Education(3, "İleri seviye", "Java3", "Engin Demiroğ", 0);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };
		EducationManager educationManager = new EducationManager(new JdbcEducationDao(), loggers);
		educationManager.add(education1);
		educationManager.add(education2);
		educationManager.add(education3);

	}

}
