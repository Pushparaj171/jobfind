package com.jobcheck.service;

import com.jobcheck.exception.PersonNotExistException;
import com.jobcheck.models.PersonalBio;

public interface PersonalBioService {
    public PersonalBio addPersonalBioByPersonId(long id,PersonalBio presBio) throws PersonNotExistException;
    public PersonalBio editPersonalBioByPersonId(long id,long personalBioid,PersonalBio presBio) throws PersonNotExistException;
    public void removePersonalBio(long id,long personaBiolId) throws PersonNotExistException ;



}