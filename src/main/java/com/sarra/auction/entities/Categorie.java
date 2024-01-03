package com.sarra.auction.entities;

import java.util.List;
import com.sarra.auction.entities.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idCat;
	private String nomCat;
	
	
	@OneToMany(mappedBy = "categorie")
	@JsonIgnore
	private List<Bid>bid;
	
	


	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categorie(String nomCat) {
		super();
		this.nomCat = nomCat;
	}


	public Long getIdCat() {
		return idCat;
	}


	public void setIdCategorie(Long idCat) {
		this.idCat = idCat;
	}


	public String getNomCat() {
		return nomCat;
	}


	public void setNomCategorie(String nomCat) {
		this.nomCat = nomCat;
	}


	public List<Bid> getBid() {
		return bid;
	}


	public void setBid(List<Bid> bid) {
		this.bid = bid;
	}
	
	
	
}
