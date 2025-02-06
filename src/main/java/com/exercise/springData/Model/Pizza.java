package com.exercise.springData.Model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@DiscriminatorValue("PIZZA")
public class Pizza extends Alimento{
    @Id
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
