package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageServices;
import Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.language.GetAllLanguageResponses;
import Kodlama.io.Devs.business.responses.language.GetByIdLanguageResponses;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageServices {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguageResponses> getAll() {

		List<Language> languages = languageRepository.findAll();

		List<GetAllLanguageResponses> getAllLanguageResponses = new ArrayList<GetAllLanguageResponses>();

		for (Language language : languages) {
			GetAllLanguageResponses languageResponseItem = new GetAllLanguageResponses();
			languageResponseItem.setId(language.getId());
			languageResponseItem.setLanguageName(language.getLanguageName());
			getAllLanguageResponses.add(languageResponseItem);
		}
		return getAllLanguageResponses;
	}

	@Override
	public GetByIdLanguageResponses getById(int id) throws Exception {

		List<Language> languages = languageRepository.findAll();

		GetByIdLanguageResponses getByIdLanguageResponses = new GetByIdLanguageResponses();
		for (Language language : languages) {
			if (language.getId() == id) {

				getByIdLanguageResponses.setLanguageName(language.getLanguageName());
			}
		}

		return getByIdLanguageResponses;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {

		Language language = new Language();

		List<Language> languages = languageRepository.findAll();

		if (createLanguageRequest.getLanguageName().equals("")) {
			throw new Exception("Programlama id ve/veya dili boş olamaz");
		}

		for (Language languageF : languages) {

			if (languageF.getLanguageName().equalsIgnoreCase(createLanguageRequest.getLanguageName())) {
				throw new Exception("Girdiğiniz programlama dili database'de mevcut");
			}

		}

		language.setLanguageName(createLanguageRequest.getLanguageName());
		languageRepository.save(language);

	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {

		boolean isCheck = true;

		Language language = new Language();

		List<Language> languages = languageRepository.findAll();

		if (updateLanguageRequest.getLanguageName().equals("") || updateLanguageRequest.getId() <= 0) {
			throw new Exception("Programlama id ve/veya dili boş olamaz");
		}

		for (Language languageF : languages) {

			if (languageF.getLanguageName().equalsIgnoreCase(updateLanguageRequest.getLanguageName())) {
				throw new Exception("Girdiğiniz programlama dili database'de mevcut");
			}

			if (languageF.getId() == updateLanguageRequest.getId()) {
				isCheck = false;
			}
		}

		if (isCheck) {
			throw new Exception("Girdiğiniz ID numarası database'de yok");
		}

		language.setId(updateLanguageRequest.getId());
		language.setLanguageName(updateLanguageRequest.getLanguageName());
		languageRepository.save(language);

	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		languageRepository.deleteById(deleteLanguageRequest.getId());

	}

}
