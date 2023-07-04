package com.onesime.sample.service;

import com.onesime.sample.modele.produit;

import java.util.List;

public interface produitService {
    produit creer(produit Produit);

    List<produit> lire();

    produit modifier(Integer id, produit Produit);

    String supprimer (Integer id);
}
