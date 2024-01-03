package com.sarra.auction.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bidder {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBidder;
    private String biddername;
    private String password;
    private String email;
    private String cin;
    
   
    @OneToMany(mappedBy = "bidder")
    @JsonIgnore
    private List<Bid> bids;

    
	public Bidder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bidder(String biddername, String password, String email, String cin) {
		super();
		this.biddername = biddername;
		this.password = password;
		this.email = email;
		this.cin = cin;
	}

	public Long getIdBidder() {
		return idBidder;
	}

	public void setIdBidder(Long idBidder) {
		this.idBidder = idBidder;
	}

	public String getBiddername() {
		return biddername;
	}

	public void setBiddername(String biddername) {
		this.biddername = biddername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

    

} 
