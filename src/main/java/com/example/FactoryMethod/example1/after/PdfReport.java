package com.example.FactoryMethod.example1.after;

public class PdfReport implements Report {

    @Override
    public void generate() {
        System.out.println("The PDF report has been created.");
    }
}
