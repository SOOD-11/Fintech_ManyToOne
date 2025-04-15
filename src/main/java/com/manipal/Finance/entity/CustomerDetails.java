package com.manipal.Finance.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name="customer_details")

public class CustomerDetails{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name = "customer_id")
	private Long customerId;
	private String fullName;
	private String emailId;
	private String status;
	private String createdBy;
	private String wsId;
	private String uuid;
	private LocalDate dob;
	private LocalDateTime localTs;
	private LocalDateTime hostTs;
	@PrePersist
	public void onCreate() {
	this.localTs=LocalDateTime.now();
	this.hostTs=LocalDateTime.now();
	this.uuid=UUID.randomUUID().toString();
	
	
	
}

public Long getCustomerId() {
	return customerId;
}

public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}

public String getWsId() {
	return wsId;
}

public void setWsId(String wsId) {
	this.wsId = wsId;
}

public String getUuid() {
	return uuid;
}

public void setUuid(String uuid) {
	this.uuid = uuid;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public LocalDateTime getLocalTs() {
	return localTs;
}

public void setLocalTs(LocalDateTime localTs) {
	this.localTs = localTs;
}

public LocalDateTime getHostTs() {
	return hostTs;
}

public void setHostTs(LocalDateTime hostTs) {
	this.hostTs = hostTs;
}

}

	