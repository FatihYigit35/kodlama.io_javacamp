package Kodlama.io.Devs.programmingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.programmingLanguages.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.programmingLanguages.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));

	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getById(int id) throws Exception {
		for (int i = 0; i < this.languages.size(); i++) {

			if (languages.get(i).getId() == id) {
				return languages.get(i);

			}
		}
		throw new Exception("ID bulunamadı");
	}

	@Override
	public void add(Language language) throws Exception {
		if(language.getLanguageName().equals("")||language.getLanguageName().equals(null)) {
			throw new Exception("Programlama dili boş olamaz");
		}
		if(language.getId()<=0) {
			throw new Exception("ID sıfırdan büyük olmalıdır");
		}
		for (int i = 0; i < this.languages.size(); i++) {
			if (languages.get(i).getLanguageName().equals(language.getLanguageName())) {
				throw new Exception("Girdiğiniz programlama dili mevcut");
			}
			if (languages.get(i).getId() == language.getId()) {
				throw new Exception("ID daha önce kullanılmış");
			}
		}

		languages.add(language);

	}

	@Override
	public void update(Language language) throws Exception {
		if(language.getLanguageName().equals("")||language.getLanguageName().equals(null)) {
			throw new Exception("Programlama dili boş olamaz");
		}
		if(language.getId()<=0) {
			throw new Exception("ID sıfırdan büyük olmalıdır");
		}
		for (int i = 0; i < this.languages.size(); i++) {
			if (languages.get(i).getLanguageName().equals(language.getLanguageName())) {
				throw new Exception("Girdiğiniz programlama dili mevcut");
			}
		}

		for (int i = 0; i < this.languages.size(); i++) {
			if (languages.get(i).getId() == language.getId()) {
				languages.set(i, language);
				return;
			}
		}

		throw new Exception("ID bulunamadı");

	}

	@Override
	public void delete(Language language) throws Exception {
		for (int i = 0; i < this.languages.size(); i++) {
			if (languages.get(i).getId() == language.getId()) {
				languages.remove(i);
				return;
			}
		}

		throw new Exception("ID bulunamadı");

	}

}
