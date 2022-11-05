package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponses;

public interface BrandService {
	List<GetAllBrandResponses> getAll();
	
	void add(CreateBrandRequest createBrandRequest);
}
