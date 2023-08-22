package com.hdfc.quarkus.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EducationDetail {
	
	private String degree;
	private String institute;
	private int yearCompleted;

}
