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
@Table(name = "DRIVER_DOC_REQUIREMENT")
public class DriverDocumentRequirement implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DOC_REQ_ID", unique = true, nullable = false)
	private Long docReqId;
	
	@Column(name = "DOC_NAME", nullable = false)
	private String docName;
	
	@Column(name = "COMMENTS")
	private String comments;
	
	@Column(name = "DRIVER_ID")
	private Long driverId;
	
	@Column(name = "DOC_TYPE_ID")
	private Long docTypeId;
	
	@Column(name = "DOC_STATUS_ID")
	private String docStatusId;
	
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
	
	@Column(name = "UPLOADED_DOCUMENT")
	private String uploadedDocument;
	
	@Column(name = "FOLDER_INDEX")
	private String folderIndex;
	
	@Column(name = "DOCUMENT_INDEX")
	private String documentIndex;

}
