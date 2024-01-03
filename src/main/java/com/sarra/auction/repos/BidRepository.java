package com.sarra.auction.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sarra.auction.entities.Bid;
import com.sarra.auction.entities.Categorie;

@RepositoryRestResource(path = "rest")
public interface BidRepository extends JpaRepository<Bid,Long> {
	
	List<Bid> findByNomBid(String nom);
	List<Bid> findByNomBidContains(String nom);
	
	


	
	@Query("select b from Bid b where b.nomBid like %:nom and b.prixMaxBid > :prixMax")
	List<Bid> findByNomPrixMax (@Param("nom") String nom,@Param("prixMax") Double prixMax);
	
	
	@Query("select b from Bid b where b.categorie = ?1")
	List<Bid> findByCategorie (Categorie categorie);
	
	List<Bid> findByCategorieIdCat(Long id);
	
	

}
