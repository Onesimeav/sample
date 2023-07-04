package com.onesime.sample.modele;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="PRODUIT")
@Getter
@Setter
@NoArgsConstructor
public class produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private Integer taxe;
    private Date experied_at;
    private String produced_by;
    private String currency;

}
