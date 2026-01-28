package com.example.FactoryMethod.example1.after;

// Nesnelerin oluşturulmasından sorumlu sınıf

public class ReportFactory {
    public static Report createReport(String type) {

        if (type.equals("PDF")) {
            return new PdfReport();
        }
        else if (type.equals("EXCEL")) {
            return new ExcelReport();
        }
        else if (type.equals("JSON")) {
            return new JsonReport();
        }

        throw new IllegalArgumentException("Geçersiz rapor tipi");
    }
}
