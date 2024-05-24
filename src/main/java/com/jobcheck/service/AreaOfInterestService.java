package com.jobcheck.service;

import java.util.List;

import com.jobcheck.models.AreaOfInterest;

public interface AreaOfInterestService {
	
	List<AreaOfInterest> getAreaOfInterest();
	
	AreaOfInterest addAreaOfInterest(long profileId, String areaOfIntrest);
	
}
