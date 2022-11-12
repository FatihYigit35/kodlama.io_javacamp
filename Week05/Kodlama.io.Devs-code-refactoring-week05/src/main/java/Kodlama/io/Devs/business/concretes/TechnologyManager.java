package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.TechnologyServices;
import Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.technology.GetAllTechnologyResponses;
import Kodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponses;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyServices {

	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;

	@Autowired
	public TechnologyManager(LanguageRepository languageRepository, TechnologyRepository technologyRepository) {
		this.languageRepository = languageRepository;
		this.technologyRepository = technologyRepository;
	}

	@Override
	public List<GetAllTechnologyResponses> getAll() {

		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponses> getAllTechnologyResponses = new ArrayList<GetAllTechnologyResponses>();

		for (Technology technology : technologies) {

			GetAllTechnologyResponses technologyResponseItem = new GetAllTechnologyResponses();
			Language language = languageRepository.getReferenceById(technology.getLanguage().getId());

			technologyResponseItem.setId(technology.getId());
			technologyResponseItem.setTechnologyName(technology.getTechnologyName());
			technologyResponseItem.setLanguageId(language.getId());
			technologyResponseItem.setLanguageName(language.getLanguageName());
			getAllTechnologyResponses.add(technologyResponseItem);
		}
		return getAllTechnologyResponses;
	}

	@Override
	public GetByIdTechnologyResponses getById(int id) throws Exception {

		boolean isCheck = false;

		List<Technology> technologies = technologyRepository.findAll();

		GetByIdTechnologyResponses getByIdTechnologyResponses = new GetByIdTechnologyResponses();

		for (Technology technology : technologies) {
			Language language = languageRepository.getReferenceById(technology.getLanguage().getId());
			if (technology.getId() == id) {
				getByIdTechnologyResponses.setLanguageId(language.getId());
				getByIdTechnologyResponses.setLanguageName(language.getLanguageName());
				getByIdTechnologyResponses.setTechnologyName(technology.getTechnologyName());
				isCheck = true;
			}
		}

		if (!isCheck) {
			throw new Exception("Girdiğiniz programlama teknoloji ID'si database'de yok");
		}

		return getByIdTechnologyResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {

		int languageId = 0;
		boolean isCheck = false;
		List<Language> languages = languageRepository.findAll();
		Technology technology = new Technology();
		List<Technology> technologies = technologyRepository.findAll();

		if (createTechnologyRequest.getLanguageName().equals("")
				|| createTechnologyRequest.getTechnologyName().equals("")) {
			throw new Exception("Programlama dili ve/veya teknolojisi boş olamaz");
		}

		for (Technology technology2 : technologies) {
			if (technology2.getTechnologyName().equalsIgnoreCase(createTechnologyRequest.getTechnologyName())) {
				throw new Exception("Girdiğiniz programlama teknolojisi database'de mevcut");
			}
		}

		for (Language language : languages) {
			if (language.getLanguageName().equals(createTechnologyRequest.getLanguageName())) {
				languageId = language.getId();
				isCheck = true;
			}
		}

		if (isCheck) {
			Language language = languageRepository.getReferenceById(languageId);
			technology.setTechnologyName(createTechnologyRequest.getTechnologyName());
			technology.setLanguage(language);
			technologyRepository.save(technology);

		} else {
			throw new Exception("Girdiğiniz programlama dili database'de yok, önce programlama dili girişi yapın");
		}

	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {

		int languageId = 0;
		boolean isCheck = false;
		List<Language> languages = languageRepository.findAll();
		Technology technology = new Technology();

		if (updateTechnologyRequest.getId() <= 0) {
			throw new Exception("ID boş olamaz");
		}

		if (updateTechnologyRequest.getLanguageName().equals("")
				|| updateTechnologyRequest.getTechnologyName().equals("")) {
			throw new Exception("Programlama dili ve/veya teknolojisi boş olamaz");
		}

		for (Language language : languages) {
			if (language.getLanguageName().equals(updateTechnologyRequest.getLanguageName())) {
				languageId = language.getId();
				isCheck = true;
			}
		}
		
		if (isCheck) {
			Language language = languageRepository.getReferenceById(languageId);
			technology.setId(updateTechnologyRequest.getId());
			technology.setTechnologyName(updateTechnologyRequest.getTechnologyName());
			technology.setLanguage(language);
			technologyRepository.save(technology);

		} else {
			throw new Exception("Girdiğiniz programlama dili database'de yok, önce programlama dili girişi yapın");
		}

	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
	}

}
