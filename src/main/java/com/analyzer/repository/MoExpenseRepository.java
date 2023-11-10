package com.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analyzer.model.MoExpense;

@Repository
public interface MoExpenseRepository extends JpaRepository<MoExpense, String> {

	public long count();
}
