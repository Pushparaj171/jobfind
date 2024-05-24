package com.jobcheck.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jobcheck.models.WorkLocation;
import com.jobcheck.repository.WorkLoactionRepository;
import com.jobcheck.service.WorkLocationService;

public class WorkLocationServiceImpl implements WorkLocationService {
	@Autowired
	WorkLoactionRepository workLocationRepo;
	
	
	@Override
	public List<WorkLocation> getWorkLocation() {
		List<WorkLocation> workLocation=workLocationRepo.getAllWorkLocation();
		return workLocation;
	}

	@Override
	public WorkLocation addWorkLocation(WorkLocation workLocation) {
		WorkLocation wl=new WorkLocation();
		wl.setLocation(workLocation.getLocation());
		workLocationRepo.save(wl);
		return wl;
	}
}
