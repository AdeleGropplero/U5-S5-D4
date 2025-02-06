package com.exercise.springData.Model;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "alimenti")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_alimento", discriminatorType = DiscriminatorType.STRING)
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int calorie;
    private double prezzo;


    public Alimento(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return
                " | " + calorie + " kCal |" +
                        " " + prezzo + " € "
                ;
    }
}

