package com.exercise.springData.Model;

import com.exercise.springData.Enums.StatoOrdine;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "ordini")
public class Ordine {
    private static int count = 1;
    private int numOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numCopertiOrdine;
    private LocalTime oraAcquisizione;
    private List<Alimento> elementi;
    @Value("${menu.coperto}")
    private double costoCoperto;
//    private double contoTotale;


    public Ordine(int numCopertiOrdine, Tavolo tavolo) {
        this.numOrdine = count ++;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        this.elementi = new ArrayList<>(); //se vuoi usare List.of(...) devi mettere nel parametro e cambiare questa linea.
        this.numCopertiOrdine = numCopertiOrdine;
        this.tavolo = tavolo;
    }

    public void aggiungiProdotti(Alimento elemento){
        this.elementi.add(elemento);
    }

    public double getContoTotale() {
        double preconto = elementi.stream()
                .mapToDouble(Alimento::getPrezzo) // Prende il prezzo di ogni elemento
                .sum(); // Somma tutti i prezzi

        double coperti = costoCoperto * numCopertiOrdine;
        double contoTotale = (preconto + coperti);
        return  contoTotale;

    }

    public void stampaOrdine(){
        System.out.println("Ordine: " + this.numOrdine);
        System.out.println("Stato: " + this.statoOrdine);
        System.out.println("Numero coperti: " + this.numCopertiOrdine);
        System.out.println("Ora acquisizione: " + this.oraAcquisizione);
        System.out.println("Totale conto: " + this.getContoTotale() + " €");
    }


}
