package com.sarra.auction.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wallet {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Double solde;

		public Wallet() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Wallet(Double solde) {
			super();
			this.solde = solde;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getSolde() {
			return solde;
		}

		public void setSolde(Double solde) {
			this.solde = solde;
		}

		@Override
		public String toString() {
			return "Wallet [id=" + id + ", solde=" + solde + "]";
		}
	    
	    

}
