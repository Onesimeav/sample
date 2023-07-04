package com.onesime.sample.controller;

import com.onesime.sample.modele.produit;
import com.onesime.sample.service.produitService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
@AllArgsConstructor
public class produitController {
    private final produitService ProduitService;
    @PostMapping("/create")
    public produit create(@RequestBody produit Produit){
        return ProduitService.creer(Produit);
    }
    @GetMapping
    public List<produit> read(){
        return ProduitService.lire();
    }
    @PutMapping("/update/{id}")
    public produit update(@PathVariable Integer id,@RequestBody produit Produit){
        return ProduitService.modifier(id, Produit);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Integer id){
        return ProduitService.supprimer(id);
    }
}
