package com.example.StrategyPattern.example1.before;

/* Tüm davranışlar tek sınıfta
    PaymentService hem ödemeYİ yönetiyor hem ödeme türlerini biliyor -> single responsibility prensibine aykırı
    Yeni ödeme yöntemi eklenmesi demek, mevcut kodu değiştirmek demek (ayrıca if-else'in uzaması demek) -> open-closed prensibine aykırı
    Her senaryo tek sınıfa bağlı olduğundan test edilebilirliği düşük

*/
public class PaymentService {

    public void pay(String paymentType, double amount){

        // bu yapı büyüdükçe kontrol edilmesi zorlaşır
        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Payment by Credit Card: " + amount);
        }
        else if (paymentType.equals("PAYPAL")) {
            System.out.println("Payment by PayPal: " + amount);
        }
        else if (paymentType.equals("CRYPTO")) {
            System.out.println("Payment by Crypto: " + amount);
        }
    }
}