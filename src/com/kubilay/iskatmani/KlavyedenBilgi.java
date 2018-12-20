package com.kubilay.iskatmani;

import java.util.Scanner;

public class KlavyedenBilgi {
    Scanner sc=new Scanner(System.in);

    public void klavyedenoku(){
        float sayi1,sayi2;
        System.out.print("birinci sayiyi giriniz= ");
        sayi1=sc.nextFloat();

        System.out.print("ikinci sayiyi giriniz= ");
        sayi2=sc.nextFloat();

        float toplam=sayi1+sayi2;
        System.out.println(sayi1 + " + "+sayi2+" = "+toplam);
    }

    public void soru2(){
        int sayi1,sayi2;
        System.out.print("birinci sayi gir= ");
        sayi1=sc.nextInt();
        while (sayi1>100){
            System.out.print("birinci sayi 100 den büyük olamaz. bir daha dene= ");
            sayi1=sc.nextInt();
        }

        System.out.print("ikinci sayi gir= ");
        sayi2=sc.nextInt();
        while (sayi2>100){
            System.out.print("ikinci sayi 100 den büyük olamaz. bir daha dene= ");
            sayi2=sc.nextInt();
        }

        int toplam=sayi1+sayi2;
        System.out.println(sayi1 + " + "+sayi2+" = "+toplam);
    }

    public int soru3(){
        int kkenar,ukenar,alan;
        System.out.print("kısa kenar gir= ");
        kkenar=sc.nextInt();

        System.out.print("uzun kenar gir= ");
        ukenar=sc.nextInt();

        while (kkenar<0 || ukenar<0 || ukenar<kkenar){
            System.out.println("girdiginiz bilgileri kontrol ederek tekrar giriniz...");
            System.out.print("kısa kenar gir= ");
            kkenar=sc.nextInt();
            System.out.print("uzun kenar gir= ");
            ukenar=sc.nextInt();
        }
        alan=kkenar*ukenar;
        return alan;
    }

}
