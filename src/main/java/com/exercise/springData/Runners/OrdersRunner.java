package com.exercise.springData.Runners;

import com.exercise.springData.Model.Menu;
import com.exercise.springData.Model.Ordine;
import com.exercise.springData.Model.Tavolo;
import com.exercise.springData.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component //i runners hanno l'annotatio component
public class OrdersRunner implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner...");


        // Quello fatto il giorno precedente l'ho spostato qui. poi commentato perchè ho fatto un refactor del codice
      /*  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        Menu menu = (Menu) ctx.getBean("menu");
        menu.stampaMenu();
        ctx.close();*/
        Menu menu = orderService.createMenu();
        menu.stampaMenu();

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("-----------------------------Tavoli---------------------------------------\n");

        Tavolo t1 = orderService.createTable();
        System.out.println(t1);

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("-----------------------------Ordini---------------------------------------\n");

        Ordine o1 = orderService.createOrdine1();
        o1.stampaOrdine();
//        Ordine o1 = new Ordine(3, t1);
//        o1.aggiungiProdotti();


    }
}

