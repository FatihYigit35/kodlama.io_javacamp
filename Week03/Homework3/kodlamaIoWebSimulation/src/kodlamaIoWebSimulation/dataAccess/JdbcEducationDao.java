package kodlamaIoWebSimulation.dataAccess;

import kodlamaIoWebSimulation.entities.Education;

public class JdbcEducationDao implements EducationDao {

	@Override
	public void add(Education education) {
		System.out.println("Jdbc ile veritabanına eklendi");
	}

}
