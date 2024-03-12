package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="nominee")
	public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nomineeId;
	private String nomineeName;
	private String status;
	private Integer userid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(String nomineeId) {
		this.nomineeId = nomineeId;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Nominee [id=" + id + ", nomineeId=" + nomineeId + ", nomineeName=" + nomineeName + ", status=" + status
				+ ", userid=" + userid + "]";
	}

	}

