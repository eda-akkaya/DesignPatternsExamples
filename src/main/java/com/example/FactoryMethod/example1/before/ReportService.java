package com.example.FactoryMethod.example1.before;
/*

ReportService tüm concrete(somut) sınıfları biliyor

Yeni rapor türü eklemek, mevcut kodu değiştirecek
 */
public class ReportService {
    public void generateReport(String type){

        // Nesne oluşturma mantığı iş mantığıyla iç içe geçmiş
        if (type.equals("PDF")) {
            PdfReport report = new PdfReport();
            report.generate();
        }
        else if (type.equals("EXCEL")) {
            ExcelReport report = new ExcelReport();
            report.generate();
        }
        else if (type.equals("JSON")) {
            JsonReport report = new JsonReport();
            report.generate();
        }
    }
}