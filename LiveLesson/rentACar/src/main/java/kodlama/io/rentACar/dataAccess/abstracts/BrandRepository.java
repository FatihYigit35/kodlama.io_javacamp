package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	// JpaRepository sınıfını extend ettiğimiz için bu metoda ve InMemory sınıfına gerek kalmadı
//	List<Brand> getAll();
}

