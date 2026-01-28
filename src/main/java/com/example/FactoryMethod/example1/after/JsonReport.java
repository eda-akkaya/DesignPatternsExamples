package com.example.FactoryMethod.example1.after;

public class JsonReport implements Report {

    @Override
    public void generate() {
        System.out.println("The JSON report has been created.");
    }
}
