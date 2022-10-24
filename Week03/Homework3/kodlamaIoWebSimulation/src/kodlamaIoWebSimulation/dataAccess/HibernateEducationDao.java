package kodlamaIoWebSimulation.dataAccess;

import kodlamaIoWebSimulation.entities.Education;

public class HibernateEducationDao implements EducationDao {

	@Override
	public void add(Education education) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
