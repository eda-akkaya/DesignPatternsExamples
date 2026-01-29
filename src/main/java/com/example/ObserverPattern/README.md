Observer Pattern
----------------

Observer Pattern, bir nesnede(subject) meydana gelen değişikliklerin, ona bağlı olan diğer nesnelere(observer) otomatik bildirilmesini sağlar.

**Çözdüğü temel problem:**

Bir nesnenin durum değişikliğinin birçok yere bildirilmesi gerekli. Bildirim alacak nesnelerin sayısı zamanla artar. Sıkı bağımlılık (tight coupling) oluşur.

Durumu değişen nesne, bu değişikliği hangi nesnelerin/sınıfların dinlediğini bilmemeli.

Bu örnek için kütüphane stok yönetimini ele alalım (example1):

Bir kitabın stok durumu değiştiğinde farklı birimler (bildirim servisi, loglama servisi, istatistik servisi) bilgilendirilmeli. İhtiyaç duyulduğunda bu sisteme yeni dinleyiciler(observer) eklenebilir.

**Observer pattern öncesinde:**

*   BookStockService dinleyici olan tüm servisleri biliyor.

*   Yeni observer eklemek istediğimizde varolan sınıfı değiştirmek gerekli. Open/closed prensibinie aykırı.

*   Birbirine sıkı bağlı olduğu için test edilebilirlik düşük.


**Observer pattern sonrası:**

*   Dinleyicileri (durum değişikliğinin bildirimini alacak yapıları) Observer interface'i olarak soyutladık.

*   Değişen nesne (subject), sadece bu interface'i biliyor.

*   Dinamik bir yapı oluşmuş oldu.

*   Subject ile Observer'lar arasında loose coupling(gevşek bağlılık) sağlandı.

*   Yeni observer eklemek için yeni bir sınıf yazmak yeterli.


**Sonuç:**

*   Bir nesnenin durum değişikliği birçok yere yansıyorsa,

*   Dinleyici sınıfı değişkense,

*   Gevşek bağlılık isteniyorsa Observer Pattern tercih edilir.