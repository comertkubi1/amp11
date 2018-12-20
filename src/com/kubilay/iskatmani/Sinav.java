package com.kubilay.iskatmani;

public class Sinav {
    int not=60;

    public void soru1(){

        if(not<=49){
            System.out.println("BİR");
        }
        else if(not<=59){
            System.out.println("İKİ");
        }
        else if(not<=69){
            System.out.println("ÜÇ");
        }
        else if(not<=84){
            System.out.println("DÖRT");
        }
        else {
            System.out.println("BEŞ");
        }

    }

    public void soru2(){
        if(not<=49){
            System.out.println("BİR");
        }
        else {
            if(not<=59){
                System.out.println("İKİ");
            }
            else {
                if(not<=69){
                    System.out.println("ÜÇ");
                }
                else {
                    if(not<=84){
                       System.out.println("DÖRT");
                    }
                    else {
                        System.out.println("BEŞ");
                    }
                }
            }
        }


    }

}
