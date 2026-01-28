Factory Method Pattern
----------------------

Factory Method Pattern, nesne oluşturma sorumluluğunu istemci sınıftan alıp ayrı bir yapıya taşır. Yani _**nesneyi oluşturan ve kullanan birbirinden ayrılır.**_

Çözdüğü problemler:

*   “new” keyword'ünün her yerde kullanılması

*   Nesne oluşturma mantığı ve iş mantığının karışması

*   Yeni bir sınıf eklendiğinde var olan kodun değiştirilmesi


Example1'de rapor oluşturma sistemini ele aldım: Bir sistem PDF, Excel, JSON gibi farklı formatlarda rapor üretebilir. İlerleyen zamanlarda yeni format türleri eklenebilir.

**Factory Method Pattern öncesinde ;**

*   ReportService tüm somut sınıfları biliyor,

*   Yeni rapor türü eklemek demek mevcut kodu değiştirmek demek (open/closed prensibine aykırı) **\***,

*   Böyle bir kodu test etmek de zordur.


**Factory Method Pattern sonrasında ;**

*   Report davranışı interface ile soyutlandı.

*   Nesne oluşturma Factory sınıfına taşındı, nesne oluşturma mantığı tek yerde.

*   Yeni rapor türü eklemek için yeni sınıf eklemek ve factory'ye ekleme yapmak yeterli.

*   Kod daha okunabilir ve test edilebilir.


**\*Open/closed prensibi** : SOLID prensiplerindendir. Yazılım, geliştirmeye açık ancak değişikliğe kapalı olmalıdır. (Daha fazlası için: [https://en.wikipedia.org/wiki/Open–closed\_principle](https://en.wikipedia.org/wiki/Open–closed_principle))