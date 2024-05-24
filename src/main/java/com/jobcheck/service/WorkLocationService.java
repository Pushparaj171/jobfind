package com.jobcheck.service;

import java.util.List;

import com.jobcheck.models.WorkLocation;

public interface WorkLocationService {

	List<WorkLocation> getWorkLocation();

	WorkLocation addWorkLocation(WorkLocation workLocation);
}
