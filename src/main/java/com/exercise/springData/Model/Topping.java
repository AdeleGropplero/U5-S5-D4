package com.exercise.springData.Model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class Topping extends Alimento{
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

