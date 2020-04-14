package com.bank.account.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	public TransactionEntity(Long id, Long fromphonenumber, Long tophonenumber, Long fromacctnumber, Long toacctnumber,
			Double amttransfered) {
		super();
		this.id = id;
		this.fromphonenumber = fromphonenumber;
		this.tophonenumber = tophonenumber;
		this.fromacctnumber = fromacctnumber;
		this.toacctnumber = toacctnumber;
		this.amttransfered = amttransfered;
	}
	public TransactionEntity() {}
	@Override
	public String toString() {
		return "TransactionEntity [id=" + id + ", fromphonenumber=" + fromphonenumber + ", tophonenumber="
				+ tophonenumber + ", fromacctnumber=" + fromacctnumber + ", toacctnumber=" + toacctnumber
				+ ", amttransfered=" + amttransfered + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFromphonenumber() {
		return fromphonenumber;
	}
	public void setFromphonenumber(Long fromphonenumber) {
		this.fromphonenumber = fromphonenumber;
	}
	public Long getTophonenumber() {
		return tophonenumber;
	}
	public void setTophonenumber(Long tophonenumber) {
		this.tophonenumber = tophonenumber;
	}
	public Long getFromacctnumber() {
		return fromacctnumber;
	}
	public void setFromacctnumber(Long fromacctnumber) {
		this.fromacctnumber = fromacctnumber;
	}
	public Long getToacctnumber() {
		return toacctnumber;
	}
	public void setToacctnumber(Long toacctnumber) {
		this.toacctnumber = toacctnumber;
	}
	public Double getAmttransfered() {
		return amttransfered;
	}
	public void setAmttransfered(Double amttransfered) {
		this.amttransfered = amttransfered;
	}
	private Long fromphonenumber;
	private Long tophonenumber;
	private Long fromacctnumber;
	private Long toacctnumber;
	private Double amttransfered;

}
