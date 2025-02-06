package com.exercise.springData.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("BEVANDE")
public class Drink extends Alimento {
    @Id
    private String nome;

    public Drink(String nome, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.nome = nome;
    }
}
