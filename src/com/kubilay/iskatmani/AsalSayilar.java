package com.kubilay.iskatmani;

public class AsalSayilar {

    private boolean asalmi(int sayi){
     boolean sonuc=true;
        for(int x=2;x<=sayi-1;x++){
            if(sayi%x==0){
                sonuc=false;
                break;
            }
        }
      return sonuc;
    }


    public String asalmiyazdir(int s){
        String sonuc="";
        if(this.asalmi(s)){
            sonuc=s+" sayısı ASALDIR.";
        }
        else {
            sonuc=s+" sayısı ASAL DEĞİLDİR.";
        }
        return sonuc;
    }
}
