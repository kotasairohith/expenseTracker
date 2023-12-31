package com.analyzer.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDto {

	@Id
	private String id;
	
	private String desc;
	
	private long amount;
	
	private String userId;
	
	private String categoryId;
}
