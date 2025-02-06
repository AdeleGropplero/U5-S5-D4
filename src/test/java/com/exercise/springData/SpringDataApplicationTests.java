package com.exercise.springData;

import com.exercise.springData.Model.Drink;
import com.exercise.springData.Model.Menu;
import com.exercise.springData.Model.Ordine;
import com.exercise.springData.Model.Tavolo;
import com.exercise.springData.Service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SpringDataApplicationTests {
    @Autowired
    SpringDataApplication app;

    @Autowired
    private OrderService orderService;


    @Test
    void contextLoads() {
        //assert true;

        //Verifico che l'app è avviata
        assertThat(app).isNotNull(); //Il test passa perché non è null. Se avessi fatto isNull() il test falliva.
        //assertNotNull(app);
    }

    @Test
    void myTest() {
        //assert true;

    }

    @Test
    void limonataPrezzo() {
        Menu menu = orderService.createMenu();
        Drink limonata = menu.getDrinks().stream().filter(elem -> elem.getNome().contains("Limonata")).findFirst().orElse(null);
        double result = limonata.getPrezzo();
        assertEquals(1.29, result);
    }

    @Test
    void contoCorretto() {
        Ordine ordine = orderService.createOrdine1();
        assertTrue(ordine.getContoTotale() > 20.0);
    }

    @Test
    void tavoloEsistente() {
        Tavolo tavolo = orderService.createTable();
        assertNotNull(tavolo);
    }


}

