package com.sofka.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DataPerson {

    private String Name;
    private String Country;
    private String City;
    private String CreditCard;
    private String Month;
    private String Year;

}
