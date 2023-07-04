package com.onesime.sample.service;

import com.onesime.sample.modele.produit;
import com.onesime.sample.repository.produitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class produitServiceImpl implements produitService{

    private final produitRepository ProduitRepository;
    @Override
    public produit creer(produit Produit) {
        return ProduitRepository.save(Produit);
    }

    @Override
    public List<produit> lire() {
        return ProduitRepository.findAll();
    }
    @Override
    public produit modifier(Integer id, produit Produit) {
        return ProduitRepository.findById(id)
                .map(p ->{
                    p.setPrice(Produit.getPrice());
                    p.setName(Produit.getName());
                    p.setTaxe(Produit.getTaxe());
                    p.setCurrency(Produit.getCurrency());
                    p.setExperied_at(Produit.getExperied_at());
                    p.setProduced_by(Produit.getProduced_by());
                    return ProduitRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Produit non trouvé"));
    }

    @Override
    public String supprimer(Integer id) {
        ProduitRepository.deleteById(id);
        return "Produit supprimé";
    }
}
