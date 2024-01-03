package com.sarra.auction.entities;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Bid {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idBid;
		private String nomBid;
	    private String description;
		private Double prixMaxBid;
		private Double prixMinBid;
	    private Date startTime;
		private Date endTime;
		 
		
		 
		 @ManyToOne
		 private Bidder bidder;
		 
		 @ManyToOne
			@JoinColumn(name="categorie")
			private Categorie categorie;

		public Bid() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Bid(String nomBid, String description, Double prixMaxBid, Double prixMinBid, Date startTime,
				Date endTime, Bidder bidder, Categorie categorie) {
			super();
			this.nomBid = nomBid;
			this.description = description;
			this.prixMaxBid = prixMaxBid;
			this.prixMinBid = prixMinBid;
			this.startTime = startTime;
			this.endTime = endTime;
			this.bidder = bidder;
			this.categorie = categorie;
		}



		public Long getIdBid() {
			return idBid;
		}



		public void setIdBid(Long idBid) {
			this.idBid = idBid;
		}



		public String getNomBid() {
			return nomBid;
		}



		public void setNomBid(String nomBid) {
			this.nomBid = nomBid;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public Double getPrixMaxBid() {
			return prixMaxBid;
		}



		public void setPrixMaxBid(Double prixMaxBid) {
			this.prixMaxBid = prixMaxBid;
		}



		public Double getPrixMinBid() {
			return prixMinBid;
		}



		public void setPrixMinBid(Double prixMinBid) {
			this.prixMinBid = prixMinBid;
		}



		public Date getStartTime() {
			return startTime;
		}



		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}



		public Date getEndTime() {
			return endTime;
		}



		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}



		public Bidder getBidder() {
			return bidder;
		}



		public void setBidder(Bidder bidder) {
			this.bidder = bidder;
		}



		public Categorie getCategorie() {
			return categorie;
		}



		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}



		@Override
		public String toString() {
			return "Bid [idBid=" + idBid + ", nomBid=" + nomBid + ", description=" + description + ", prixMaxBid="
					+ prixMaxBid + ", prixMinBid=" + prixMinBid + ", startTime=" + startTime + ", endTime=" + endTime
					+ ", bidder=" + bidder + ", categorie=" + categorie + "]";
		}
		 
		 
		 
	



		
		
		
		
		
		
	}

