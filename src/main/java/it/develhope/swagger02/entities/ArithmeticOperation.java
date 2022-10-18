package it.develhope.swagger02.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    public String name;
    public int minNumberOfOperands;
    public String description;
    public String[] properties;

}
