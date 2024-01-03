package com.sarra.auction.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarra.auction.entities.Bid;
import com.sarra.auction.service.BidService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BidRESTControllers {
	

    @Autowired
    BidService bidService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Bid> getAllBid() {
        return bidService.getAllBid();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Bid getBidById(@PathVariable("id") Long id) {
        return bidService.getBid(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Bid createBid(@RequestBody Bid bid) {
        return bidService.saveBid(bid);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Bid updateBid(@RequestBody Bid bid) {
        return bidService.updateBid(bid);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBid(@PathVariable("id") Long id) {
        bidService.deleteBidById(id);
    }

    @RequestMapping(value = "/bidscat/{idCat}", method = RequestMethod.GET)
    public List<Bid> getBidsByCategorieId(@PathVariable("idCat") Long idCat) {
        return bidService.findByCategorieIdCat(idCat);
    }
}
