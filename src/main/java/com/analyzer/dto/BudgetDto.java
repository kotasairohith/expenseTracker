package com.analyzer.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetDto {

	@Id
	private String id;
	
	private long budget;
	
	private String desc;
	
	private long startDate;
	
	private long endDate;
	
	private String userId;
	
	private String categoryId;
}
