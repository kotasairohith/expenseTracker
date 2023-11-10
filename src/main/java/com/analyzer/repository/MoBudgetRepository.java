package com.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analyzer.model.MoBudget;

@Repository
public interface MoBudgetRepository extends JpaRepository<MoBudget, String> {
	
	public long count();
}
