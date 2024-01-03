package com.sarra.auction.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarra.auction.entities.Bidder;

public interface BidderRepository extends JpaRepository <Bidder, Long>{
	
	
}


