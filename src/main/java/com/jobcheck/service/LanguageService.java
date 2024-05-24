package com.jobcheck.service;

import java.util.List;

import com.jobcheck.models.Language;

public interface LanguageService {
	public Language addLanguage(Language language);
	public Language editLanguage(Language language);
	public String deleteLanguage(long id);
//	public List<Language> getLanguageByProfileId(long profileId);
	public List<Language> getLanguage();
}
