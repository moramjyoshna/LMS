package com.hcl.lms.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Leaves {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaveId;
	private String leaveType;
	private Double availableLeaves;
	private Double availedLeaves;
	private Long employeeId;
	
}
