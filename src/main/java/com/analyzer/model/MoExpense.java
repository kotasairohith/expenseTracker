package com.analyzer.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Expense")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoExpense {
	
	@Id
	private String id;
	
	private String desc;
	
	private long amount;
	
	private String userId;
	
	private String categoryId;
	
	
}
