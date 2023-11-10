package com.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analyzer.model.MoCategory;

@Repository
public interface MoCategoryRepository extends JpaRepository<MoCategory, String> {
	
	public long count();

}
