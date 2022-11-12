package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageServices;
import Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.language.GetAllLanguageResponses;
import Kodlama.io.Devs.business.responses.language.GetByIdLanguageResponses;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
	LanguageServices languageServices;

	@Autowired
	public LanguageController(LanguageServices languageServices) {
		this.languageServices = languageServices;
	}

	@Operation(tags = "Programming Languages Service")
	@GetMapping("/getall")
	public List<GetAllLanguageResponses> getAll() {
		return languageServices.getAll();

	}
	
	@Operation(tags = "Programming Languages Service")
	@GetMapping("/getbyid")
	public GetByIdLanguageResponses getById(int id) throws Exception{
		return languageServices.getById(id);
		
	}
	
	@Operation(tags = "Programming Languages Service")
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception{
		languageServices.add(createLanguageRequest);
		
	}
	
	@Operation(tags = "Programming Languages Service")
	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest ) throws Exception{
		languageServices.update(updateLanguageRequest);
		
	}
	
	@Operation(tags = "Programming Languages Service")
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest ) throws Exception{
		languageServices.delete(deleteLanguageRequest);
		
	}

}
