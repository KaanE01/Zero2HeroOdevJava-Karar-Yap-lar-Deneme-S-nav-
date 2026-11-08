# Rapor

**Ad Soyad:**Kaan Enes KAYA
**Numara:** 62

## 1. Problem Analizi
kullanıcın girdiği doğru yanlış değerleriyle boş soru sayısını netini ve sonucunun çok iyimi iyi mi orta mı geliştirilmeli mi  bulmak


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-doğru
-yanlış

**İşlemler:**
-

**Çıktılar:**
-"ogrencinin dogru sayisini dogru girdiginizi kontrol ediniz"
"Ogrencinin yanlis sayisini giriniz"
"ogrencinin dogru sayisini dogru girdiginizi kontrol ediniz"
"ogrencinin dogru ve yanlis sayisini dogru girdiginizi kontrol ediniz"
"ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu cok iyi"
"ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu iyi"
"ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu orta"
"ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu gelistirilmeli"

## 3. Matematiksel Formüller
-<   (yanlis>20 || yanlis<0)
->   (20 -(dogru+yanlis))
-/   net=(dogru-(yanlis/4.0))
-=
## 4. Sözde Kod (Pseudocode)

1. if
2. return
3.


## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 6. Başarı Durumu Koşulları

Doğru Sayısı Girişi:

Ekrana "Ogrencinin dogru sayisini giriniz" yazdırılır.

Kullanıcıdan dogru sayısı alınır.

Doğru Kontrolü:

Eğer dogru > 20 veya dogru < 0 ise:

"ogrencinin dogru sayisini dogru girdiginizi kontrol ediniz" yazdırılır ve program durur (return).

Değilse devam edilir.

Yanlış Sayısı Girişi:

Ekrana "Ogrencinin yanlis sayisini giriniz" yazdırılır.

Kullanıcıdan yanlis sayısı alınır.

Yanlış Kontrolü:

Eğer yanlis > 20 veya yanlis < 0 ise:

"ogrencinin dogru sayisini dogru girdiginizi kontrol ediniz" yazdırılır ve program durur (return).

Değilse devam edilir.

Toplam Kontrolü:

Eğer yanlis + dogru > 20 veya yanlis + dogru < 0 ise:

"ogrencinin dogru ve yanlis sayisini dogru girdiginizi kontrol ediniz" yazdırılır ve program durur (return).

Değilse devam edilir.

Net Hesaplama:

net = dogru - (yanlis / 4.0) işlemi yapılır. (Ondalıklı hesap için 4.0 kullanılır).

Net Aralık Kontrolleri ve Sonuçlar:

Durum 1: Eğer net > 15 ve net <= 15 arasındaysa:

"ogrencinin bos sayisi +boş+ net sayisi ise +net+ Ogrencinin deneme sonucu cok iyi" yazdırılır ve program durur (return).

Durum 2: Eğer net > 10 ve net <= 15 arasındaysa:

"ogrencinin bos sayisi +boş+ net sayisi ise +net+ Ogrencinin deneme sonucu iyi" yazdırılır ve program durur (return).

Durum 3: Eğer net > 5 ve net <= 10 arasındaysa:

"ogrencinin bos sayisi +boş+ net sayisi ise +net+ Ogrencinin deneme sonucu orta" yazdırılır ve program durur (return).

Durum 4: Eğer net <= 5 ise:

"ogrencinin bos sayisi +boş+ net sayisi ise +net+ Ogrencinin deneme sonucu gelistirilmeli" yazdırılır ve program durur (return).

"uygulamayi kullandiginiz icin tesekkurler" yazdırılır ve program sonlanır.


## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi | 0=boş Net=20, Çok iyi | Doğru|
| 15 | 4 |  | 1=boş Net=14 İyi |Doğru |
| 10 | 8 | Net 8, Orta | 2=boş Net=8 Orta | Doğru|
| 5 | 0 | Net 5, Geliştirilmeli | 15=boş Net=5 Geliştirilmeli |Doğru |
| 0 | 20 | Net -5, Geliştirilmeli |0=boş Net = -5 Geliştirilmeli | Doğru|
| 10 | 10 | Net 7,5, Orta | 0=boş Net=7,5 Orta | Doğru|
| 15 | 10 | Geçersiz giriş |Geçersiz giriş | Doğru|
| 12 | 9 | Geçersiz giriş | Geçersiz giriş| Doğru|
| -1 | 5 | Geçersiz giriş |Geçersiz giriş | Doğru|
