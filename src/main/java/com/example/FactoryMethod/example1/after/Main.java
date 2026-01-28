package com.example.FactoryMethod.example1.after;

public class Main {
    public static void main(String[] args) {

        ReportService service = new ReportService();
        service.generateReport("PDF");
    }
}