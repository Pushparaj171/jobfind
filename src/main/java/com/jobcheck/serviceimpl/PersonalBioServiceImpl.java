package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.exception.PersonNotExistException;
import com.jobcheck.models.PersonalBio;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.repository.PersonalBioRepository;
import com.jobcheck.service.PersonalBioService;

@Service
public class PersonalBioServiceImpl implements PersonalBioService{

	@Autowired
    PersonalBioRepository personalBioRepo;
    
    @Autowired
    JobSeekerProfileRepository jobSeekerProfileRepo;
    



   @Override
    public PersonalBio addPersonalBioByPersonId(long id, PersonalBio presBio) throws PersonNotExistException{
        if (!jobSeekerProfileRepo.existsById(id)) {



           throw new PersonNotExistException();
        } else {
            
            personalBioRepo.save(presBio);
            return presBio;
            
        }
            
        //return null;
    }




    @Override
    public PersonalBio editPersonalBioByPersonId(long id,long personalBioid, PersonalBio presBio) throws PersonNotExistException {
        if (!jobSeekerProfileRepo.existsById(id)) {



           throw new PersonNotExistException();
        } else {
            
            if(personalBioRepo.existsById(personalBioid)) {
            personalBioRepo.save(presBio);
            return presBio;
            }
            else {
                throw new PersonNotExistException();
            }
            
            }
            
        }




    @Override
    public void removePersonalBio(long id, long personalBioId) throws PersonNotExistException {
        if (!jobSeekerProfileRepo.existsById(id)) {



           throw new PersonNotExistException();
        } else {
            
            if(personalBioRepo.existsById(personalBioId)) {
                personalBioRepo.deleteById(personalBioId);
        
            }
            else {
                throw new PersonNotExistException();
            }
            }    
    }

	
}
