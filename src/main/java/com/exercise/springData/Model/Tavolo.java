package com.exercise.springData.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tavoli")
public class Tavolo {
    private int numTavolo;
    private int numCoperti;
    private boolean libero; //Potrebbe essere un Enum.

}