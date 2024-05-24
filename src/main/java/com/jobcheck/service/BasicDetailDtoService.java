package com.jobcheck.service;

import com.jobcheck.dto.BasicDetailDto;
import com.jobcheck.enumeration.Gender;
import com.jobcheck.enumeration.Month;
import com.jobcheck.models.BasicDetail;

public interface BasicDetailDtoService {

	BasicDetail addBasicDetail(BasicDetailDto basicDetailDto,Gender gender,Month month);

}
