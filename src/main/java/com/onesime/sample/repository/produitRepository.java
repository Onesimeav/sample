package com.onesime.sample.repository;

import com.onesime.sample.modele.produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produitRepository extends JpaRepository<produit,Integer> {
}
