package com.jobcheck.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.exception.LanguageNotFoundException;
import com.jobcheck.models.JobSeekerProfile;
import com.jobcheck.models.Language;
import com.jobcheck.models.Skill;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.repository.LanguageRepository;
import com.jobcheck.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	LanguageRepository langRepo;
	@Autowired
	JobSeekerProfileRepository jobSeekerProfileRepo;
	@Override
	public Language addLanguage(Language language) {
		return langRepo.save(language);
	}
	@Override
	public Language editLanguage(Language language) {
		if(langRepo.existsById(language.getLanguageId())) {
		Language lang = new Language(); 
		lang.setLanguage(language.getLanguage());
		lang.setLanguageId(language.getLanguageId());
		langRepo.save(lang);
		return lang;
		}
		else
		{
			throw new LanguageNotFoundException("language not found");
		}
	}
	@Override
	public String deleteLanguage(long id) {
		if(langRepo.existsById(id)) {
			Language lang = langRepo.getById(id); 
			lang.setLanguage(null);
			langRepo.save(lang);
			return "deleted";
			
		}
		else
		{
			throw new LanguageNotFoundException("language not found");
		}

}
//	@Override
//	public List<Language> getLanguageByProfileId(long profileId) {
//		JobSeekerProfile jsp = jobSeekerProfileRepo.getJobSeekerProfileById(profileId);
//		List<Language> languages = jsp.getLanguage();
//		if(languages.isEmpty())
//		{
//			throw new LanguageNotFoundException("language not found for this profile");
//		}
//		else
//		{
//			return languages;
//		}
//	}
	@Override
	public List<Language> getLanguage() {
		List<Language> languages = langRepo.findAll();
		if(languages.isEmpty())
			{
				throw new LanguageNotFoundException("language not found for this profile");
			}
			else
			{
				return languages;
			}
		}
//	@Override
//	public List<Language> getLanguageByProfileId(long profileId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	}
