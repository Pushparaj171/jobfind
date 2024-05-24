package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobcheck.models.Language;

public interface LanguageRepository extends JpaRepository<Language,Long> {

}
