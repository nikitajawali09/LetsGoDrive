package com.drive.entities;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "DOC_STATUS")
public class DocumentStatus implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DOC_STATUS_ID", unique = true, nullable = false)
	private Long documentStatusId;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "CREATED_DATE")
	private Date createDate;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	


}
