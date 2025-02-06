package com.exercise.springData.Service;

import com.exercise.springData.Model.Alimento;

import com.exercise.springData.Model.Drink;
import com.exercise.springData.Model.Pizza;
import com.exercise.springData.Model.Topping;
import com.exercise.springData.Repository.AlimentoDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Classe service annotazione service
public class AlimentoService {
    @Autowired
    private AlimentoDAORepository db;

    @Autowired
    @Qualifier("toppings")
    private List<Topping> toppings;

    public List<Topping> createToppings() {
        return toppings; // restituisce direttamente la lista iniettata
    }



    //JPA Method:
    public void insertAlimento(Alimento alimento){
        db.save(alimento);
        System.out.println(alimento + " aggiunto al database!");
    }
}


/*    @Autowired
    @Qualifier("mozzarella")
    ObjectProvider<Topping> mozzarellaProvider;
    @Autowired
    @Qualifier("pomodoro")
    ObjectProvider<Topping> pomodoroProvider;

    @Autowired
    @Qualifier("prosciutto")
    ObjectProvider<Topping> prosciuttoProvider;

    @Autowired
    @Qualifier("cipolle")
    ObjectProvider<Topping> cipolleProvider;

    @Autowired
    @Qualifier("ananas")
    ObjectProvider<Topping> ananasProvider;

    @Autowired
    @Qualifier("lemonade")
    ObjectProvider<Drink> lemonadeProvider;

    @Autowired
    @Qualifier("water")
    ObjectProvider<Drink> waterProvider;

    @Autowired
    @Qualifier("wine")
    ObjectProvider<Drink> wineProvider;

    @Autowired
    @Qualifier("margherita")
    ObjectProvider<Pizza> margheritaProvider;

    @Autowired
    @Qualifier("hawaiana")
    ObjectProvider<Pizza> hawaianaProvider;
    @Autowired
    @Qualifier("salamona")
    ObjectProvider<Pizza> salamonaProvider;*/

