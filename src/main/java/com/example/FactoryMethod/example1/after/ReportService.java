package com.example.FactoryMethod.example1.after;

// Nesneyi kullanan sınıftır, nesnenin nasıl oluşturulduğunu bilmez
public class ReportService {

    public void generateReport(String type) {
        Report report = ReportFactory.createReport(type);
        report.generate();
    }
}