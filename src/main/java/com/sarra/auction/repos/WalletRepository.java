package com.sarra.auction.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarra.auction.entities.Wallet;

public interface WalletRepository extends JpaRepository< Wallet, Long> {

}
