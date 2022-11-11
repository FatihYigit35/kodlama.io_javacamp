package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageServices;
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
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) throws Exception {
		return languageRepository.getById(id);
	}

	@Override
	public void add(Language language) throws Exception{
			languageRepository.add(language);
	}

	@Override
	public void update(Language language) throws Exception{
			languageRepository.update(language);

	}

	@Override
	public void delete(Language language) throws Exception {
			languageRepository.delete(language);

	}

}

