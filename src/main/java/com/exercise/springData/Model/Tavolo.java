package com.exercise.springData.Model;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tavolo {
    private int numTavolo;
    private int numCoperti;
    private boolean libero; //Potrebbe essere un Enum.

}