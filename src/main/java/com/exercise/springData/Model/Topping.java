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
@DiscriminatorValue("TOPPING")
public class Topping extends Alimento{
    @Id
    private String nome;

    public Topping( String nome, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + super.toString();
    }
}

