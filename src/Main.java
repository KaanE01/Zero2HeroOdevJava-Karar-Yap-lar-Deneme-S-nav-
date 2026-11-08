package com.mycompany.javakararyapilaridenemesinavi;

import java.util.Scanner;

public class JavaKararYapilariDenemeSinavi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

            
        System.out.println("Ogrencinin dogru sayisini giriniz"); //kullanıcıdan doğru sayısını istedik
        int dogru = sc.nextInt();                                
        
        if(dogru>20 || dogru<0){                                 // 20  büyük yada 0 dan küçükse çıktıyı çıkar ve dur
            System.out.println("ogrencinin dogru sayisini dogru girdiginizi kontrol ediniz");
    return;}
        
        System.out.println("Ogrencinin yanlis sayisini giriniz"); //kullanıcıdan yanlış sayısını istedik
        int yanlis = sc.nextInt();
        
        if(yanlis>20 || yanlis<0){                                // 20  büyük yada 0 dan küçükse çıktıyı çıkar ve dur
            System.out.println("ogrencinin dogru sayisini dogru girdiginizi kontrol ediniz");
    return;}
        
        if(yanlis+dogru>20 || yanlis +dogru<0){          //toplamları 20  büyük yada 0 dan küçükse çıktıyı çıkar ve dur
            System.out.println("ogrencinin dogru ve yanlis sayisini dogru girdiginizi kontrol ediniz");
    return;}
    
        double net=(dogru-(yanlis/4.0)) ; //double kullanıyoruz çünkü tam sayı olmayabilir 4.0 kullanmamızın sebebi ise işlem ondalıklı yapılsın diye
          
        if(net>15 & net<=20 ){  // 15 20 arasındaysa çıktıyı çıkar dur
            System.out.println("ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu cok iyi");
        return;}
        
        if(net>10& net<=15 ){    // 10 15  arasındaysa çıktıyı çıkar dur
            System.out.println("ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu iyi");
        return;}
        
        if(net>5 & net<=10 ){  //5 10  arasındaysa çıktıyı çıkar dur
            System.out.println("ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu orta");
        return;}
        
        if(net<=5 ){    // 5 ten küçükse çıktıyı çıkar dur
            System.out.println("ogrencinin bos sayisi "+ (20 -(dogru+yanlis)) + " net sayisi ise " + net + " Ogrencinin deneme sonucu gelistirilmeli");
        return;}
        
        System.out.println("uygulamayi kullandiginiz icin tesekkurler");
    }
}
