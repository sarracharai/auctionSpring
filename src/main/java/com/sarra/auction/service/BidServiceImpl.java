package com.sarra.auction.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarra.auction.entities.Bid;
import com.sarra.auction.entities.Categorie;
import com.sarra.auction.repos.BidRepository;

@Service
public class BidServiceImpl  implements BidService{
	
		@Autowired
		BidRepository bidRepository;

		@Override
		public Bid saveBid(Bid b) {
			return bidRepository.save(b);
		}

		@Override
		public Bid updateBid(Bid b) {
			return bidRepository.save(b);
		}

		@Override
		public void deleteBid(Bid b) {
			bidRepository.delete(b);

			
		}

		@Override
		public void deleteBidById(Long id) {
			bidRepository.deleteById(id);
			
		}

		@Override
		public Bid getBid(Long id) {
			return bidRepository.findById(id).get();

		}

		@Override
		public List<Bid> getAllBid() {
			return bidRepository.findAll();
		}

		@Override
		public List<Bid> findByCategorie(Categorie categorie) {
			return bidRepository.findByCategorie(categorie);
		}

		@Override
		public List<Bid> findByCategorieIdCat(Long id) {
			return bidRepository.findByCategorieIdCat(id);
		}

		@Override
		public List<Bid> findByNomBid(String nom) {
			return bidRepository.findByNomBid(nom);

		}

		@Override
		public List<Bid> findByNomBidContains(String nom) {
			return bidRepository.findByNomBidContains(nom);
		}

		@Override
		public List<Bid> findByNomPrixMax(String nom, Double prixMax) {
			return bidRepository.findByNomPrixMax(nom, prixMax);

		}

	

}
