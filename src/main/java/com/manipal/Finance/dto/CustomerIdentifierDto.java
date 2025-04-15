package com.manipal.Finance.dto;
import java.time.LocalDateTime;

public class CustomerIdentifierDto {

    private Long id;
    private String panCardNumber;
    private String aadharNumber;
    private String wsId;
    private LocalDateTime localTs;
    private LocalDateTime hostTs;
    private String uuid;
    private Long customerId;
    private String fullName;
    private String emailId;

    // Constructor
    public CustomerIdentifierDto(Long id, String panCardNumber, String aadharNumber, String wsId, 
                                      LocalDateTime localTs, LocalDateTime hostTs, String uuid, 
                                      Long customerId, String fullName, String emailId) {
        this.id = id;
        this.panCardNumber = panCardNumber;
        this.aadharNumber = aadharNumber;
        this.wsId = wsId;
        this.localTs = localTs;
        this.hostTs = hostTs;
        this.uuid = uuid;
        this.customerId = customerId;
        this.fullName = fullName;
        this.emailId = emailId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getWsId() {
        return wsId;
    }

    public void setWsId(String wsId) {
        this.wsId = wsId;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
}