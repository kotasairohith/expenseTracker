package com.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analyzer.model.MoUser;

@Repository
public interface MoUserRepository extends JpaRepository<MoUser, String> {

	public long count();
	
	public MoUser findByUserName();
}
