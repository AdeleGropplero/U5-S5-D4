package com.exercise.springData.Model;


import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Pizza extends Alimento{
    private String name;
    private List<Topping> toppings;

    public Pizza(String name, List<Topping> toppings, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.name = name;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza: " + name +
                "(" + toppings.stream()
                .map(t -> t.getNome())
                .reduce((t1, t2) -> t1 + ", " + t2)
                .orElse("Nessuno") +
                ") " + super.toString();
    }

}
