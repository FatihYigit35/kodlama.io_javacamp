package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.technology.GetAllTechnologyResponses;
import Kodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponses;

public interface TechnologyServices {
	
	List<GetAllTechnologyResponses> getAll();
	
	GetByIdTechnologyResponses getById(int id) throws Exception;
	
	void add(CreateTechnologyRequest createTechnologyRequest)throws Exception;
	
	void update(UpdateTechnologyRequest updateTechnologyRequest)throws Exception;

	void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;

}
