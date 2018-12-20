package com.kubilay.iskatmani;

public class ForDongu {
    public void soru1(){
       for (int i=1;i<=5;i++){
           System.out.println("cömert");
       }
    }
    public void soru2(){
        for (int x=100;x>=1;x--){
            System.out.println(x);
        }
    }
  //1 ile 10 arasındaki sayıların toplamını bulup geri gönderen
    // fonksiyon (soru7) yaz
    public int soru7(){
        int toplam=0;

        for (int x=1;x<=10;x++){
            toplam=toplam+x;
        }
        return toplam;
    }
    public void soru8(){
       for(int i=1;i<=2000;i++){
           if(i%2==0){
               System.out.println(i+" çift sayıdır.");
           }
           else {
               System.out.println(i+" tek sayıdır.");
           }
       }
    }
}
