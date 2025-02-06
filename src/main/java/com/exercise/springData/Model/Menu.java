package com.exercise.springData.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void stampaMenu() {
        System.out.println("\n--- Pizze ---");
        pizze.forEach(p -> System.out.println(p.toString()));

        System.out.println("\n--- Toppings ---");
        toppings.forEach(t -> System.out.println(t.getNome() + " | " + t.getCalorie() + " Kcal | €" + t.getPrezzo()));

        System.out.println("\n--- Drinks ---");
        drinks.forEach(d -> System.out.println(d.getNome() + " | " + d.getCalorie() + " Kcal | €" + d.getPrezzo()));
    }

}