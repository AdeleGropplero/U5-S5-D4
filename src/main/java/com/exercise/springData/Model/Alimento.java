package com.exercise.springData.Model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alimento {
    private int calorie;
    private double prezzo;



    public int getCalorie() {
        return calorie;
    }

    // Getter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return
                " | " + calorie + " kCal |" +
                        " " + prezzo + " € "
                ;
    }
}

