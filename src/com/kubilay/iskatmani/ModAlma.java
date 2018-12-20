package com.kubilay.iskatmani;

public class ModAlma {

    public void soru1(){
        //5 e bölünür bölünemez.
        for (int i=0;i<=100;i++){
            if(i%5==0){
                System.out.println(i+" sayısı beşe BÖLÜNÜR.");
            }
            else {
                System.out.println(i+" sayısı beşe bölünemez.");
            }
        }
    }
    public void soru2(){
        int kalan=0;
        for (int i=1;i<=100;i++){
            kalan=i%7;
            System.out.println(i+" sayısının 7'ye bölümünden kalan= "+kalan);
        }

    }
}
