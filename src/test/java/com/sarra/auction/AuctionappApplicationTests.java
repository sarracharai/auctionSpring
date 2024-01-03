package com.sarra.auction;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.auction.entities.Bid;
import com.sarra.auction.entities.Categorie;

import com.sarra.auction.entities.User;
import com.sarra.auction.repos.BidRepository;
import com.sarra.auction.repos.UserRepository;

@Transactional
@SpringBootTest
class AuctionappApplicationTests {
	@Autowired
	private BidRepository bidRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindBid()
	{
	final Bid b = bidRepository.findById(1L).get();
	System.out.println(b);
	}
	
	@Test
	public void testUpdateBid()
	{
		Bid b = bidRepository.findById(1L).get();
	b.setPrixMaxBid(1000.0);
	bidRepository.save(b);
	}
	
	@Test
	public void testDeleteBid()
	{
		bidRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousBids()
	{
	List<Bid> bds = bidRepository.findAll();
	for (Bid p : bds)
	{
	System.out.println(p);
	}
	}
	 @Test
	 public void testFindByNomProduit()
	 {
	 List<Bid> bds = bidRepository.findByNomBid("peugot");
	 for (Bid b : bds)
	 {
	 System.out.println(b);
	 }
	 }
	 
	 @Test
	 public void testFindByNomBidContains ()
	 {
	 List<Bid> bds=bidRepository.findByNomBidContains("peugot");
	 for (Bid b : bds)
	 {
	 System.out.println(b);
	 } }
	 
	 @Test
	 public void testfindByNomPrixMax()
	 {
	 List<Bid> bds = bidRepository.findByNomPrixMax("peugot", 1000.0);
	 for (Bid b : bds)
	 {
	 System.out.println(b);
	 }
	 }
	 
	 @Test
	 public void testfindByCategorie()
	 {
	 Categorie cat = new Categorie();
	 cat.setIdCategorie(1L);
	 List<Bid> bds = bidRepository.findByCategorie(cat);
	 for (Bid b : bds)
	 {
	 System.out.println(b);
	 }
	 }
	 
	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<Bid> bds = bidRepository.findByCategorieIdCat(1L);
	 for (Bid b : bds)
	 {
	 System.out.println(b);
	 }
	  }
	 
	 /*@Test
	 public void testfindByOrderByNomProduitAsc()
	 {
	 List<Produit> prods =
	 produitRepository.findByOrderByNomProduitAsc();
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 } */
	 
	 /*@Test
	 public void testTrierProduitsNomsPrix()
	 {
	 List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 } */

	 
	 

		@Test
		public void testFindUser()
		{
		final User u = userRepository.findById(1L).get();
		System.out.println(u);
		}
		
		@Test
		public void testUpdateUser()
		{
		User u = userRepository.findByUsername("sarra");
		u.setUsername("sarra");
		userRepository.save(u);
		}
		
		@Test
		public void testDeleteUser()
		{
		userRepository.deleteById(1L);;
		}
		
		@Test
		public void testListerTousUsers()
		{
		List<User> users = userRepository.findAll();
		for (User u : users)
		{
		System.out.println(u);
		}
		}
		/* @Test
		 public void testFindByNomUser()
		 {
		 List<User> users = userRepository.findByUsername("sarra");
		 for (User u : users)
		 {
		 System.out.println(u);
		 }
		 }*/
	 
	
	
}
