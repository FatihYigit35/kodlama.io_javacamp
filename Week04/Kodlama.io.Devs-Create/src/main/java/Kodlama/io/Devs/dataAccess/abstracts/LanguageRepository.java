package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();

	Language getById(int id) throws Exception;

	void add(Language language) throws Exception;

	void update(Language language) throws Exception;

	void delete(Language language) throws Exception;

}