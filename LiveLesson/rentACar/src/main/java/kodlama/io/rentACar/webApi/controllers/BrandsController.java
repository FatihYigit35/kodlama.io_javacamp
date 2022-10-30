package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotation --> bilgilendirme // erişim noktası
@RequestMapping("/api/brands") // adresleme
public class BrandsController {
	private BrandService brandService;

	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<Brand> getAll() {
		{
			//Ioc
			return brandService.getAll();
		}

	}
	
	// www.rentacarsitesi.com/api/brands/getall

}
