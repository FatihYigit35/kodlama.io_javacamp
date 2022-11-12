package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TechnologyServices;
import Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.technology.GetAllTechnologyResponses;
import Kodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponses;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

	TechnologyServices technologyServices;

	@Autowired
	public TechnologyController(TechnologyServices technologyServices) {
		super();
		this.technologyServices = technologyServices;
	}

	@Operation(tags = "Programming Language Technologies Service")
	@GetMapping("/getall")
	public List<GetAllTechnologyResponses> getAll() {
		return technologyServices.getAll();

	}

	@Operation(tags = "Programming Language Technologies Service")
	@GetMapping("/getbyid")
	public GetByIdTechnologyResponses getById(int id) throws Exception {
		return technologyServices.getById(id);

	}

	@Operation(tags = "Programming Language Technologies Service")
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createLanguageRequest) throws Exception {
		technologyServices.add(createLanguageRequest);

	}

	@Operation(tags = "Programming Language Technologies Service")
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		technologyServices.update(updateTechnologyRequest);

	}

	@Operation(tags = "Programming Language Technologies Service")
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		technologyServices.delete(deleteTechnologyRequest);

	}

}
