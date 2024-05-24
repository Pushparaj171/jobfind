package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.repository.LanguageRepository;
import com.jobcheck.service.JobSeekerProfileService;


@Service
public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {

	@Autowired
	JobSeekerProfileRepository jobSeekerProfileRepository;

	@Autowired
    LanguageRepository langRepo;
    @Autowired
    JobSeekerProfileRepository jobSeekerRepo;
    



//   @Override
//    public Language addLanguage(Language language) {
//        
////        JobSeekerProfile profile = jobSeekerRepo.getById(jobProfileId);
//    //    List<Language> languages = new ArrayList<>();
//        Language lang = new Language();
//        lang.setLanguage(language.getLanguage());
//        lang.setLanguageId(language.getLanguageId());
//        lang.setJobSeekerProfile(language.getJobSeekerProfile());
//        langRepo.save(lang);    //l9anguages.add(lang);
////        profile.setLanguage(languages);
////        jobSeekerRepo.save(profile);
//        return lang;
//    }


}
