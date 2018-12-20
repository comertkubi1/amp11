package com.kubilay.iskatmani;

import javax.xml.soap.SOAPPart;

public class DortIslem {
    //bu alana genel sınıf değişkenleri tanımlanır.
    int sayi1=5; //burada sayi1 adında, data tipi int olan değişken tanımladık.
    int sayi2=49;  //
    int sayi3=20;
    String islem="toplama";
    //iki sayıyı toplayan metotu yazalım.
    public void ikisayitaopla(){
        int sonuc;
        sonuc=sayi1+sayi2;
        System.out.println(sayi1 + "+" + sayi2 +"= "+sonuc);
    }
    public void ikisayicarp(){
        int sonuc;
        sonuc=sayi1*sayi2;
        System.out.println(sayi1+"*"+sayi2+"= "+sonuc);
    }
    public void ikisayicikar() {
        int sonuc;
        sonuc=sayi1-sayi2;
        System.out.println(sayi1+"-"+sayi2+"= "+sonuc);
    }
    public void ikisayibol() {
        int sonuc;
        sonuc=sayi1/sayi2;
        System.out.println(sayi1+"/"+sayi2+"= "+sonuc);
    }

    public String ikisayitoplafonk(){
        String sonuc;
        sonuc= sayi1+ "+" + sayi2 + "= "+ (sayi1+sayi2);
        return sonuc;
    }
    public void soru1(){
        int sonuc;
        sonuc=(sayi1+sayi2+sayi3)/3;
        System.out.println("("+sayi1+ "+" + sayi2+ "+" +sayi3 +")/3 = "+sonuc);
    }
    public int soru2(){
        int enb;
        if(sayi1>sayi2 && sayi1>sayi3){
            enb=sayi1;
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            enb=sayi2;
        }
        else{
            enb=sayi3;
        }
        return enb;
    }

    public void soru3(){
        int sonuc;
        if(sayi1<=10){
            System.out.println("sayı çok küçük");
        }
        else{
            if(sayi1<=30){
                System.out.println("sayı küçük");
            }
            else{
                if(sayi1<=50){
                    System.out.println("sayı büyük");
                }
                else{
                    System.out.println("sayı çok büyük");
                }
            }
        }
    }



}
