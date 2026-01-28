package com.example.FactoryMethod.example1.after;

public class ExcelReport implements Report {

    @Override
    public void generate() {
        System.out.println("The Excel report has been created.");
    }
}
