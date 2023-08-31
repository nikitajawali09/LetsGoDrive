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
import jakarta.validation.constraints.Email;
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
@Table(name = "DRIVER_DTLS")
public class DriverEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DRIVER_ID", unique = true, nullable = false)
	private Long driverId;

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

	@Column(name = "DISTRICT", nullable = false)
	private String district;

	@Email
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
	private int totalRidesTaken;

	@Column(name = "DRIVER_RATING")
	private String driverRating;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "TOTAL_EXPERIENCE_IN_YEARS")
	private Long totalExperienceInYears;

	@Column(name = "TOTAL_EXPERIENCE_IN_MONTHS")
	private Long totalExperienceInMonth;

	@Column(name = "IS_DRIVER_VERIFIED")
	private boolean isDriverVerified;//phone no and email id || sms

	@Column(name = "DRIVING_LICENSE_NO")
	private Long drivingLicenseNo;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "DRIVING_DATE_ISSUE")
	private Date drivingDateIssue;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "DRIVING_EXPIRY_DATE")
	private Date drivingExpiryDate;
	
	@Column(name="IS_DRIVER_DOC_VERIFIED")
	private boolean isDriverDocVerified;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CONFIRM_PASSWORD")
	private String confirmPassword;
	
	@Column(name="OLD_PASSWORD")
	private String oldPassword;

}
