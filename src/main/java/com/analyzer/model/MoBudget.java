package com.analyzer.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Budget")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoBudget {

	@Id
	private String id;
	
	private long budget;
	
	private String desc;
	
	private long startDate;
	
	private long endDate;
	
	private String userId;
	
	private String categoryId;
	
	
}
