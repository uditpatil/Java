package com.uditpatil.savetravels.models;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="saveTravels")
public class SaveTravels {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull(message="Expense Name name must not be blank")
    @Size(min = 5, max = 200)
    private String expenseName;
	
	@NotNull(message="Vendor name must not be blanked")
    @Size(min = 5, max = 200)
    private String vendorName;
	
	@NotNull(message="Amount must not be blank")
	@Min(value=1, message="Amount must be greater than zero")
    private Double amount;
	
	@NotNull(message="Description must not be blank")
    @Size(min = 1, max = 200, message="must be atleast 10 characters")
    private String desc;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    
    public SaveTravels() {
	}
    
    
    
	public SaveTravels(
			String expenseName,
			String vendorName,
			Double amount,
			String desc) {
		this.expenseName = expenseName;
		this.vendorName = vendorName;
		this.amount = amount;
		this.desc = desc;
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getExpenseName() {
		return expenseName;
	}



	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public Double getAmount() {
		return amount;
	}



	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
