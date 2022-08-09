package com.totalshakes.wstotalshakes.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "adicional")
public class Adicional {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @NonNull
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_id_ingrediente")
    private Ingrediente ingrediente;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}