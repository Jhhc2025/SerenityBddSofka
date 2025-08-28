package com.sofka.stepDefinitios;

import com.sofka.models.DataPerson;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTable {

    @DataTableType
    public DataPerson dataPerson(Map<String , String> data)
    {
        return new DataPerson(
                data.get("Name"),
                data.get("Country"),
                data.get("City"),
                data.get("CreditCard"),
                data.get("Month"),
                data.get("Year")
        );
    }
}