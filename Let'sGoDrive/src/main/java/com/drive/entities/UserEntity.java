package com.drive.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "USER_DTLS")
public class UserEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", unique = true, nullable = false)
	private Long userId;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "ADDRESS1", nullable = false)
	private String address1;

	@Column(name = "ADDRESS2")
	private String address2;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "PINCODE", nullable = false)
	private String pincode;

	@Column(name = "EMAILID", nullable = false)
	private String emailId;

	@Size(max = 10, min = 10, message = "Phone no cannot be less or more than 10")
	@Column(name = "PHONE_NO", nullable = false)
	private String phoneNo;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private Date dateOfBirth;

	@Column(name = "GENDER_ID", nullable = false)
	private Long genderId;

	@Column(name = "TOTAL_RIDES_TAKEN")
	private Long totalRidesTaken;

	@Column(name = "USER_RATING")
	private BigDecimal userRating;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "ADDRESS_TYPE_ID")
	private Long addressTypeId;// office,home,communication

}
