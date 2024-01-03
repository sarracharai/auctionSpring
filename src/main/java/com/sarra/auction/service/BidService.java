package com.sarra.auction.service;

import java.util.List;

import com.sarra.auction.entities.Bid;
import com.sarra.auction.entities.Categorie;


public interface BidService {
	Bid saveBid(Bid p);
	Bid updateBid(Bid p);
	void deleteBid(Bid p);
	void deleteBidById(Long id);
	Bid getBid(Long id);
	List<Bid> getAllBid();
	List<Bid> findByCategorie (Categorie categorie);
	List<Bid> findByCategorieIdCat(Long id);
	List<Bid> findByNomBid(String nom);
	List<Bid> findByNomBidContains(String nom);
	List<Bid> findByNomPrixMax (String nom, Double prixMax);

	
	
	//List<Produit> findByOrderByNomProduitAsc();
	//List<Produit> trierProduitsNomsPrix();
}
