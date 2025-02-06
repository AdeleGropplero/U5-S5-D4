package com.exercise.springData.Configurations;


import com.exercise.springData.Model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationBean {

    @Bean
    public Topping mozzarella(){
        return new Topping("Mozzarella", 92, 0.69);
    }

    @Bean
    public Topping pomodoro(){
        return new Topping("Pomodoro", 42, 0.50);
    }

    @Bean
    public Topping prosciutto(){
        return new Topping("Prosciutto", 55, 0.99);
    }

    @Bean
    public Topping cipolle(){
        return new Topping("Cipolle", 22, 0.69);
    }

    @Bean
    public Topping ananas(){
        return new Topping("Ananas", 25, 0.79);
    }

    @Bean
    public Topping salame(){
        return new Topping("Salame", 86, 0.99);
    }

    //-------------------------------------------------------------------------------
    @Bean
    public Drink lemonade() {
        return new Drink("Limonata (0.33l)", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Acqua (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Vino (0.75l, 13%)", 607, 7.49);
    }
    //-------------------------------------------------------------------------------

    @Bean
    public Pizza margherita(){
        return new Pizza("Margherita", List.of(pomodoro(), mozzarella()), 1104, 4.99);
    }

    @Bean
    public Pizza hawaiana(){
        return new Pizza("Hawaiana", List.of(pomodoro(), mozzarella(), prosciutto(), ananas()), 1024, 6.49);
    }

    @Bean
    public Pizza salamona(){
        return new Pizza("Salamona", List.of(pomodoro(), mozzarella(), salame()), 1160, 5.99);
    }
//-------------------------------------------------------------------------------
@Bean
public List<Topping> toppings() {
    List<Topping> toppingsList = new ArrayList<>();
    toppingsList.add(mozzarella());
    toppingsList.add(pomodoro());
    toppingsList.add(prosciutto());
    toppingsList.add(cipolle());
    toppingsList.add(ananas());
    toppingsList.add(salame());
    return toppingsList;
}

    @Bean
    public List<Drink> drinks() {
        List<Drink> drinksList = new ArrayList<>();
        drinksList.add(lemonade());
        drinksList.add(water());
        drinksList.add(wine());
        return drinksList;
    }

    @Bean
    public List<Pizza> pizzas() {
        List<Pizza> pizzasList = new ArrayList<>();
        pizzasList.add(margherita());
        pizzasList.add(hawaiana());
        pizzasList.add(salamona());
        return pizzasList;
    }

    //-------------------------------------------------------------------------------
    @Bean
    public Menu menu(){
        return new Menu(
                List.of(margherita(),hawaiana(),salamona()),
                List.of(mozzarella(),pomodoro(),prosciutto(),salame(),ananas(),cipolle()),
                List.of(lemonade(),water(),wine())
        );
    }

    //-------------------------------------------------------------------------------
    //-------------------------DAY 2-------------------------------------------------

    @Bean("tavolo1")
    @Scope("prototype")
    public Tavolo getTavolo1(){
        return new Tavolo(1, 4, true);
    }

    @Bean("tavolo2")
    @Scope("prototype")
    public Tavolo getTavolo2(){
        return new Tavolo(2, 6, true);
    }

    @Bean("tavolo3")
    @Scope("prototype")
    public Tavolo getTavolo3(){
        return new Tavolo(2, 3, true);
    }

    @Bean("ordine1")
    @Scope("prototype")
    public Ordine getOrdine1(){
        Ordine o = new Ordine(3, getTavolo1());
        o.aggiungiProdotti(margherita());
        o.aggiungiProdotti(margherita());
        o.aggiungiProdotti(salamona());
        o.aggiungiProdotti(lemonade());
        o.aggiungiProdotti(lemonade());
        o.aggiungiProdotti(water());
        return o;
    }



}
