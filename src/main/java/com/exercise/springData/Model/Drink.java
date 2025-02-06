package com.exercise.springData.Model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class Drink extends Alimento {
    private String nome;

    public Drink(String nome, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.nome = nome;
    }
}
