package com.manipal.Finance.entity;
import java.time.LocalDateTime;
import com.manipal.Finance.entity.*;
import java.util.UUID;
import jakarta.persistence.*;


@Entity
@Table(name="customer_identification")

public class CustomerIdentification{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	private String PancardNumber;
	private String AadharNumber;
	private String wsId;
	private LocalDateTime localTs;
	private LocalDateTime hostTs;
	private String uuid;
	@ManyToOne

	@JoinColumn(name="customer_id",referencedColumnName="customer_id")
	private CustomerDetails customer;
	@PrePersist
	
	public void prePersist() {
		
		this.localTs=LocalDateTime.now();
		this.hostTs=LocalDateTime.now();
		this.uuid=UUID.randomUUID().toString();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPancardNumber() {
		return PancardNumber;
	}
	public void setPancardNumber(String pancardNumber) {
		PancardNumber = pancardNumber;
	}
	public String getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		AadharNumber = aadharNumber;
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
	public CustomerDetails getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}
	}
	
	
	
	
	
}