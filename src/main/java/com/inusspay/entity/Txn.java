package com.inusspay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="tbl_txn")
@Entity
public class Txn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String txnId;
    private String customerName;
    private String service;
    private double amount;
    private double gst;
    private double commission;
    
	public Txn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Txn(Long id, String txnId, String customerName, String service, double amount, double gst,
			double commission) {
		super();
		this.id = id;
		this.txnId = txnId;
		this.customerName = customerName;
		this.service = service;
		this.amount = amount;
		this.gst = gst;
		this.commission = commission;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	@Override
	public String toString() {
		return "Txn [id=" + id + ", txnId=" + txnId + ", customerName=" + customerName + ", service=" + service
				+ ", amount=" + amount + ", gst=" + gst + ", commission=" + commission + "]";
	}

}
